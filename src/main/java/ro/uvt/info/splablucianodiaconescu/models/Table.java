package ro.uvt.info.splablucianodiaconescu.models;

import ro.uvt.info.splablucianodiaconescu.services.Visitee;
import ro.uvt.info.splablucianodiaconescu.services.Visitor;

public class Table implements Element, Visitee {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    @Override
    public void print(){
        System.out.println("Table with Title: " + title);
    }

}