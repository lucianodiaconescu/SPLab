package ro.uvt.info.splablucianodiaconescu.services;

import ro.uvt.info.splablucianodiaconescu.models.Book;
import ro.uvt.info.splablucianodiaconescu.models.Paragraph;
import ro.uvt.info.splablucianodiaconescu.models.Section;
import ro.uvt.info.splablucianodiaconescu.models.Table;
import ro.uvt.info.splablucianodiaconescu.models.Image;

public class RenderContentVisitor implements Visitor {
    @Override
    public void visitBook(Book book) {
        System.out.println("Rendering Book: " + book.getTitle());
    }

    @Override
    public void visitSection(Section section) {
        System.out.println("Rendering Section: " + section.getTitle());
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        System.out.println("Rendering Paragraph: " + paragraph.getText());
    }

    @Override
    public void visitImage(Image image) {
        System.out.println("Rendering Image: " + image.getImageName());
    }

    @Override
    public void visitTable(Table table) {
        System.out.println("Rendering Table: " + table.getTitle());
    }
}
