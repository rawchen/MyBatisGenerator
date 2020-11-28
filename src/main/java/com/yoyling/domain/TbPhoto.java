package com.yoyling.domain;

import java.io.Serializable;
import java.util.Date;

public class TbPhoto implements Serializable {
    private Integer xid;

    private Integer fid;

    private Integer userid;

    private String photo;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}