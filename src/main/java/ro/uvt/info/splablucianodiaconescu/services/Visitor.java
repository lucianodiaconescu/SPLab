package ro.uvt.info.splablucianodiaconescu.services;

import ro.uvt.info.splablucianodiaconescu.models.Book;
import ro.uvt.info.splablucianodiaconescu.models.Paragraph;
import ro.uvt.info.splablucianodiaconescu.models.Section;
import ro.uvt.info.splablucianodiaconescu.models.Table;
import ro.uvt.info.splablucianodiaconescu.models.Image;

public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section section);
    void visitParagraph(Paragraph paragraph);
    void visitImage(Image image);
    void visitTable(Table table);
}
