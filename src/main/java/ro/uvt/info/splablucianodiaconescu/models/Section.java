package ro.uvt.info.splablucianodiaconescu.models;

import java.util.ArrayList;
import java.util.List;
public class Section implements Element {
    private String title;
    private List<Element> contentList = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(Element element) {
        contentList.add(element);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : contentList) {
            element.print();
        }
    }
}