package com.nexus.nurseryteacher.model;

/**
 * Created by Yousef on 02/05/2017.
 */

public class Class {

    public Class(int img , String f_name , String d_name){
        this.setImg(img);
        this.setF_Name(f_name);
        this.setD_name(d_name);

    }

    private int img;
    private String f_name ,d_name;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_Name(String f_name) {
        this.f_name = f_name;
    }
}
