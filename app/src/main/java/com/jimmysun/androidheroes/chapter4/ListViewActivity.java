package com.jimmysun.androidheroes.chapter4;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private static final String TAG = "ListViewActivity";
    private List<String> mData;
    private MyListView mDataListView;
    private ViewHolderAdapter mAdapter;
    private int lastVisibleItemPosition;
    private int mTouchSlop;
    private float mFirstY;
    private float mCurrentY;
    private int direction;
    private boolean mShow = true;
    private ObjectAnimator mAnimator;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mData = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            mData.add("Data " + i);
//        }
        mDataListView = (MyListView) findViewById(R.id.lv_data);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mAdapter = new ViewHolderAdapter(this, mData);
        mDataListView.setAdapter(mAdapter);
        Button addButton = (Button) findViewById(R.id.btn_add);
        if (addButton != null) {
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mData.add("new " + mData.size());
                    mAdapter.notifyDataSetChanged();
                    mDataListView.setSelection(mData.size() - 1);
                }
            });
        }
        mDataListView.setEmptyView(findViewById(R.id.empty_view));
        View header = new View(this);
        header.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams
                .MATCH_PARENT, (int) getResources().getDimension(R.dimen
                .abc_action_bar_default_height_material)));
        mDataListView.addHeaderView(header);
        mTouchSlop = ViewConfiguration.get(this).getScaledTouchSlop();
        mDataListView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d(TAG, "onTouch: 触摸时操作");
                        mFirstY = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.d(TAG, "onTouch: 移动时操作");
                        mCurrentY = event.getY();
                        if (mCurrentY - mFirstY > mTouchSlop) {
                            direction = 0; // down
                        } else if (mFirstY - mCurrentY > mTouchSlop) {
                            direction = 1; // up
                        }
                        if (direction == 1) {
                            if (mShow) {
                                toolbarAnim(1); // hide
                                mShow = !mShow;
                            }
                        } else if (direction == 0) {
                            if (!mShow) {
                                toolbarAnim(0); // show
                                mShow = !mShow;
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.d(TAG, "onTouch: 离开时操作");
                        break;
                }
                return false;
            }
        });
        mDataListView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                switch (scrollState) {
                    case SCROLL_STATE_IDLE:
                        Log.d("Test", "SCROLL_STATE_IDLE");
                        break;
                    case SCROLL_STATE_TOUCH_SCROLL:
                        Log.d("Test", "SCROLL_STATE_TOUCH_SCROLL");
                        break;
                    case SCROLL_STATE_FLING:
                        Log.d("Test", "SCROLL_STATE_FLING");
                        break;
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
                                 int totalItemCount) {
                Log.d("Test", "onScroll");
                if (firstVisibleItem + visibleItemCount == totalItemCount && totalItemCount > 0) {
                    Log.d(TAG, "onScroll: 滚动到最后一行");
                }
                if (firstVisibleItem > lastVisibleItemPosition) {
                    Log.d(TAG, "onScroll: 上滑");
                } else if (firstVisibleItem < lastVisibleItemPosition) {
                    Log.d(TAG, "onScroll: 下滑");
                }
                lastVisibleItemPosition = firstVisibleItem;
                Log.d(TAG, "onScroll: 可视区域内最后一个Item的id: " + mDataListView.getLastVisiblePosition());
                Log.d(TAG, "onScroll: 可视区域内第一个Item的id: " + mDataListView.getFirstVisiblePosition());
            }
        });
    }

    private void toolbarAnim(int flag) {
        if (mAnimator != null && mAnimator.isRunning()) {
            mAnimator.cancel();
        }
        if (flag == 0) {
            mAnimator = ObjectAnimator.ofFloat(mToolbar, "translationY", mToolbar.getTranslationY
                    (), 0);
        } else {
            mAnimator = ObjectAnimator.ofFloat(mToolbar, "translationY", mToolbar.getTranslationY
                    (), -mToolbar.getHeight());
        }
        mAnimator.start();
    }
}
