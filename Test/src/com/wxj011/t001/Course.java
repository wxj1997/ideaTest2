package com.wxj011.t001;

public class Course {
    String cid;
    String cname;
    String date;
    String describe;

    public Course() {
    }

    public Course(String cid, String cname, String date, String describe) {
        this.cid = cid;
        this.cname = cname;
        this.date = date;
        this.describe = describe;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", date='" + date + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
