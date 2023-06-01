package com.library.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Book implements Serializable {

    private long eat_id;
    private String name;
    private String author;
    private String ingredients;
    private String population;
    private String cookingmethod;

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setCookingmethod(String cookingmethod) {
        this.cookingmethod = cookingmethod;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getPopulation() {
        return population;
    }

    public String getCookingmethod() {
        return cookingmethod;
    }

    private String introduction;
    private Date pub_date;
    private int class_id;
    private int number;

    public long getBookId() {
        return eat_id;
    }

    public void setBookId(long book_id) {
        this.eat_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }


    public Date getPubdate() {
        return pub_date;
    }

    public void setPubdate(Date pub_date) {
        this.pub_date = pub_date;
    }

    public int getClassId() {
        return class_id;
    }

    public void setClassId(int class_id) {
        this.class_id = class_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "eat_id=" + eat_id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", population='" + population + '\'' +
                ", cookingmethod='" + cookingmethod + '\'' +
                ", introduction='" + introduction + '\'' +
                ", pub_date=" + pub_date +
                ", class_id=" + class_id +
                ", number=" + number +
                '}';
    }
}
