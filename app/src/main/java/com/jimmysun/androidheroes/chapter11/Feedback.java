package com.jimmysun.androidheroes.chapter11;

import cn.bmob.v3.BmobObject;

/**
 * Created by jimmy on 2016/12/24 0024
 */

public class Feedback extends BmobObject {
    private String name;
    private String feedback;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
