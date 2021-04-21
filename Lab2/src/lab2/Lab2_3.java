/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 *
 * @author nhanr
 */
public class Lab2_3 {
    public static void main(String[] args) {
        List<Catalog> catalogs = new ArrayList<>();
    Catalog cata1,cata2,cata3;
    cata1 = new Catalog(1,"Java");
    cata1.addBook(new Book(1,"Java can ban",5000));
    cata1.addBook(new Book(2,"Java nang cao",7000));
    
    cata2 = new Catalog(2,"Mobile");
    cata2.addBook(new Book(3,"Lap trinh Android",10000));
    cata2.addBook(new Book(4,"Swish",12000));
    
    cata3 = new Catalog(3,"Web");
    cata3.addBook(new Book(5,"JSF",6000));
    cata3.addBook(new Book(6,"PHP",7000));
    cata3.addBook(new Book(7,"Angular",8000));
    
    
    catalogs.add(cata1);
    catalogs.add(cata2);
    catalogs.add(cata3);
    
    cata1.getBook().remove(0);
    
    for(Catalog catalog:catalogs){
            System.out.println("\n"+catalog);
            for (Book b: catalog.getBook()) {
                System.out.println(b);
            }
    }
}
}
    class Catalog{
        private int id;
        private String name;
        public Catalog(){
        }

    public Catalog(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Catalog{" + "id=" + id + ", name=" + name + '}';
    }
    
    private List<Book> books = new ArrayList<Book>();
    public List<Book> getBook(){
        return books;
    }
    public void addBook(Book b){
        books.add(b);
        b.setCatalog(this);
    }
    public void removeBook(Book b) {
        books.remove(b);
        b.setCatalog(null);
    }
    }
    class Book{
        private int id;
        private String title;
        private double price;

    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
        public Book() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", price=" + price + '}';
    }
        private Catalog catalog;
        
        public Catalog getCatalog(){
            return catalog;
        }
        public void setCatalog(Catalog catalog){
            this.catalog = catalog;
        }
    }