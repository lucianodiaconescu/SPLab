package ro.uvt.info.splablucianodiaconescu.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authorList = new ArrayList<>();
    private TableOfContents tableOfContents;
    private List<Chapter> chapterList = new ArrayList<>();

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

    public void print() {
        System.out.println("Title: " + title);
    }
}
