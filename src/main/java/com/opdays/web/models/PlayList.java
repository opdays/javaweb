package com.opdays.web.models;

import java.util.Date;

/**
 * Created by yangyang on 2017/7/17.
 */
public class PlayList {
    private int id;
    private String playName;
    private int playId;
    private String bigImage;
    private String smImage;
    private Date addTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public int getPlayId() {
        return playId;
    }

    public void setPlayId(int playId) {
        this.playId = playId;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getSmImage() {
        return smImage;
    }

    public void setSmImage(String smImage) {
        this.smImage = smImage;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "id=" + id +
                ", playName='" + playName + '\'' +
                ", playId=" + playId +
                ", bigImage='" + bigImage + '\'' +
                ", smImage='" + smImage + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
