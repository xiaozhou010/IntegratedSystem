package com.bobo.domain.secondary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/9/28.
 */
@Entity
@Table(name = "t_messge")
public class Messge implements Serializable{

    private static final long serialVersionUID = 3929646492509228358L;
    private int id;
    private String mgs;
    private int number;

    public Messge(int id, String mgs,int number) {
        this.id = id;
        this.mgs = mgs;
        this.number = number;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMgs() {
        return mgs;
    }

    public void setMgs(String mgs) {
        this.mgs = mgs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
