package com.example.recyclerviewpizzajaz;

public class PizzaRecipe {
    private int image;
    private String title;
    private String desc;
    private String recept;

    public PizzaRecipe(int image, String title, String desc, String recept) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.recept = recept;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRecept() {
        return recept;
    }

    public void setRecept(String recept) {
        this.recept = recept;
    }
}
