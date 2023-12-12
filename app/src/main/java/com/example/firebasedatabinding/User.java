package com.example.firebasedatabinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
    String userName, userPhone, userTeam;

    public User() {
    }

    public User(String userName, String userPhone, String userTeam) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userTeam = userTeam;
    }
    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
    @Bindable
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        notifyPropertyChanged(BR.userPhone);
    }
    @Bindable
    public String getUserTeam() {
        return userTeam;
    }

    public void setUserTeam(String userTeam) {
        this.userTeam = userTeam;
        notifyPropertyChanged(BR.userTeam);
    }
}
