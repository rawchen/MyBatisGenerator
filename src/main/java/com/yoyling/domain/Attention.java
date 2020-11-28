package com.yoyling.domain;

import java.io.Serializable;

public class Attention implements Serializable {
    private Integer gid;

    private Integer userid;

    private Integer beuserid;

    private static final long serialVersionUID = 1L;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBeuserid() {
        return beuserid;
    }

    public void setBeuserid(Integer beuserid) {
        this.beuserid = beuserid;
    }
}