package com.example.myapplication;

public class AdapterItems {
    private int id;
    private String jobTitle;
    private  String Descreption;

    public AdapterItems(int id, String jobTitle, String descreption) {
        this.id = id;
        this.jobTitle = jobTitle;
        Descreption = descreption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescreption() {
        return Descreption;
    }

    public void setDescreption(String descreption) {
        Descreption = descreption;
    }
}
