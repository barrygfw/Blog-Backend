package cn.emrys.springboot.entity;

public class Category {
    private int id;
    private String cateName;
    private int date;

    public int getId() {
        return id;
    }

    public String getCateName() {
        return cateName;
    }

    public int getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
