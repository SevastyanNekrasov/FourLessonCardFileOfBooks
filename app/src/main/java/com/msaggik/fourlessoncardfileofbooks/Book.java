package com.msaggik.fourlessoncardfileofbooks;

// сущность книги
public class Book{
    // поля
    private int id;
    private String name;
    private String author;

    // конструктор
    public Book(int id, String author, String name) {
        this.id = id;
        this.author = author;
        this.name = name;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
