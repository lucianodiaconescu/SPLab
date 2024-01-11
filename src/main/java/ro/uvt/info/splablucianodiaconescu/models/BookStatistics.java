package ro.uvt.info.splablucianodiaconescu.models;

import ro.uvt.info.splablucianodiaconescu.services.Visitor;

public class BookStatistics implements Visitor {
    private int imageCount;
    private int tableCount;
    private int paragraphCount;

    public BookStatistics() {
        this.imageCount = 0;
        this.tableCount = 0;
        this.paragraphCount = 0;
    }

    public int getImageCount() {
        return imageCount;
    }

    public int getTableCount() {
        return tableCount;
    }

    public int getParagraphCount() {
        return paragraphCount;
    }

    @Override
    public void visitImage(Image image) {
        imageCount++;
    }

    @Override
    public void visitTable(Table table) {
        tableCount++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphCount++;
    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitBook(Book book) {

    }

    public void printStatistics() {
        System.out.println("*** Number of images: " + imageCount);
        System.out.println("*** Number of tables: " + tableCount);
        System.out.println("*** Number of paragraphs: " + paragraphCount);
    }
}
