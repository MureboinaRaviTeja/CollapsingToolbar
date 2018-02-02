package com.example.mravi.collapsingtoolbar.branch;

import android.widget.Button;

/**
 * Created by mravi on 14-01-2018.
 */

public class Card {

    private String imgUrl;
    private String title;
    private String readmore;



    private String register;

    public String getReadmore() {
        return readmore;
    }

    public void setReadmore(String readmore) {
        this.readmore = readmore;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Card(String imgUrl, String title) {
        this.imgUrl = imgUrl;
        this.title = title;
    }





}
