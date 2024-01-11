package ro.uvt.info.splablucianodiaconescu.models;

import ro.uvt.info.splablucianodiaconescu.services.Visitee;
import ro.uvt.info.splablucianodiaconescu.services.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee {
    private String title;
    private List<Author> authorList = new ArrayList<>();
    private TableOfContents tableOfContents = new TableOfContents();
    private List<Chapter> chapterList = new ArrayList<>();
    private List<Visitee> content = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public void addContent(Element element) {
        tableOfContents.add(element);
    }

    public List<Visitee> getContent() {
        return content;
    }

    public void setContent(List<Visitee> content) {
        this.content = content;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        for (Visitee element : content) {
            element.accept(visitor);
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