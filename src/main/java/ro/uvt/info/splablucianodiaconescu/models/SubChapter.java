package ro.uvt.info.splablucianodiaconescu.models;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private TableOfContents tableOfContents = new TableOfContents();

    public SubChapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public void createNewParagraph(String text) {
        tableOfContents.addParagraph(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        tableOfContents.addImage(new Image(imageName));
    }

    public void createNewTable(String tableName) {
        tableOfContents.addTable(new Table(tableName));
    }
    public void print(){
        System.out.println("SubChapter: " + name);
        tableOfContents.printParagraph();
        tableOfContents.printImage();
        tableOfContents.printTable();
    }
}