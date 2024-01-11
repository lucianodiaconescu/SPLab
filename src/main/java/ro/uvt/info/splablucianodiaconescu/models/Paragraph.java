package ro.uvt.info.splablucianodiaconescu.models;

import ro.uvt.info.splablucianodiaconescu.services.AlignLeft;
import ro.uvt.info.splablucianodiaconescu.services.AlignStrategy;
import ro.uvt.info.splablucianodiaconescu.services.Visitee;
import ro.uvt.info.splablucianodiaconescu.services.Visitor;

public class Paragraph implements Element, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    @Override
    public void print() {
        System.out.println(alignStrategy.render(text));
    }
}