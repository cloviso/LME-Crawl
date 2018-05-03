package com.maikegroup.delight.data.repository.data.user.model;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String userId;

    private String userName;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}