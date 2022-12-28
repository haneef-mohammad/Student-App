package com.example.springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @Column
    int sid;
    @Column
    String sname;
    @Column
    String scontact;
    @Column
    String scourse;

//    public Student(int sid, String sname, String scontact, String scourse) {
//        this.sid = sid;
//        this.sname = sname;
//        this.scontact = scontact;
//        this.scourse = scourse;
//    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getScontact() {
        return scontact;
    }

    public String getScourse() {
        return scourse;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setScontact(String scontact) {
        this.scontact = scontact;
    }

    public void setScourse(String scourse) {
        this.scourse = scourse;
    }
}
