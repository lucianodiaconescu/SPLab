package ro.uvt.info.splablucianodiaconescu.models;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubChapter> getSubChapterList() {
        return subChapterList;
    }

    public void setSubChapterList(List<SubChapter> subChapterList) {
        this.subChapterList = subChapterList;
    }
    public int createSubChapter(String title) {
        SubChapter subChapter = new SubChapter(title);
        subChapterList.add(subChapter);
        return subChapterList.indexOf(subChapter);
    }
    public SubChapter getSubChapter(int index) {
        return subChapterList.get(index);
    }
    public void print(){
        System.out.println("Chapter: " + name);
    }
}