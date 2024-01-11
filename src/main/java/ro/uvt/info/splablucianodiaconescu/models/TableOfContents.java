package ro.uvt.info.splablucianodiaconescu.models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents {
    private List<Paragraph> paragraphList = new ArrayList<>();
    private List<Image> imageList = new ArrayList<>();
    private List<Table> tableList = new ArrayList<>();
    private List<Element> elementList = new ArrayList<>();

    public TableOfContents() {
    }

    public List<Paragraph> getParagraphList() {
        return paragraphList;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    public void setParagraphList(List<Paragraph> paragraphList) {
        this.paragraphList = paragraphList;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public void setTableList(List<Table> tableList) {
        this.tableList = tableList;
    }
    public void addParagraph(Paragraph paragraph){
        paragraphList.add(paragraph);
    }
    public void addImage(Image image){
        imageList.add(image);
    }
    public void addTable(Table table){
        tableList.add(table);
    }
    public void printParagraph(){
        for (Paragraph paragraph : paragraphList)
            paragraph.print();
    }
    public void printImage(){
        for (Image image : imageList)
            image.print();
    }
    public void printTable(){
        for (Table table : tableList)
            table.print();
    }
    public void add(Element element) {
        elementList.add(element);
    }

    public void print() {
        for (Element element : elementList) {
            element.print();
        }
    }
}