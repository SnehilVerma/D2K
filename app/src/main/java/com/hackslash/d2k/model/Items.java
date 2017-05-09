package com.hackslash.d2k.model;

public class Items {


    private int image_src;
    private String item_name;


    public String get_name() {
        return item_name;
    }

    public void set_name(String item_name) {
        this.item_name = item_name;
    }

    public int get_image_src() {
        return image_src;
    }

    public void set_image_src(int image_src) {
        this.image_src = image_src;
    }
}