package ro.uvt.info.splablucianodiaconescu.models;

import ro.uvt.info.splablucianodiaconescu.services.Visitee;
import ro.uvt.info.splablucianodiaconescu.services.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee {
    private String title;
    private List<Element> contentList = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getContentList() {
        return contentList;
    }

    public void setContentList(List<Element> contentList) {
        this.contentList = contentList;
    }

    public void add(Element element) {
        contentList.add(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (Element element : contentList) {
            if (element instanceof Visitee) {
                ((Visitee) element).accept(visitor);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : contentList) {
            element.print();
        }
    }
}
