package ro.uvt.info.splablucianodiaconescu.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authorList = new ArrayList<>();
    private TableOfContents tableOfContents = new TableOfContents();
    private List<Chapter> chapterList = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addContent(Element element) {
        tableOfContents.add(element);
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }

    public int createChapter(String title) {
        Chapter chapter = new Chapter(title);
        chapterList.add(chapter);
        return chapterList.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapterList.get(index);
    }

    public void printAuthors() {
        for (Author author : authorList) {
            author.print();
        }
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println();
        System.out.println("Authors: ");
        printAuthors();
        System.out.println();
        tableOfContents.print();
    }
}