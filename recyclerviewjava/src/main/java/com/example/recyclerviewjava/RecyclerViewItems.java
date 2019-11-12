package com.example.recyclerviewjava;

public class RecyclerViewItems {
    private int imageRecours;
    private String text1;
    private String text2;

    public RecyclerViewItems(int imageRecours, String text1, String text2) {
        this.imageRecours = imageRecours;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImageRecours() {
        return imageRecours;
    }

    public void setImageRecours(int imageRecours) {
        this.imageRecours = imageRecours;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
