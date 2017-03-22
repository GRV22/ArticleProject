package com.argnv.article.Models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 3/15/17.
 */
@Entity
@Table(name = "USER")
public class User implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long userId;

    @Column(name = "user_name",columnDefinition = "varchar(45) not null")
    private String userName;

    @Column(name = "email",columnDefinition = "varchar(45) not null")
    private String emailId;

    @Column(columnDefinition = "bigint(20) not null")
    private String phone;

    @Column(name = "user_pic_url",columnDefinition = "text")
    private String userPicUrl;

    @Column(name = "user_age",columnDefinition = "bigint(20)")
    private Integer userAge;

    @Column(columnDefinition = "varchar(45) not null")
    private String password;

    @Column(name = "gcm_id",columnDefinition = "text")
    private String gcmId;

    @Column(name = "lat",columnDefinition = "double")
    private Double latitude;

    @Column(name = "lon",columnDefinition = "double")
    private Double longitude;

    @Column(name = "creation_time", columnDefinition = "bigint(20) unsigned not null")
    private Long creationTime;

    @Column(name = "is_active",columnDefinition = "boolean default true")
    private Boolean isActive;

    @Column(name = "is_block",columnDefinition = "boolean default false")
    private Boolean isBlocked;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserPicUrl() {
        return userPicUrl;
    }

    public void setUserPicUrl(String userPicUrl) {
        this.userPicUrl = userPicUrl;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGcmId() {
        return gcmId;
    }

    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }
}
