package ro.uvt.info.splablucianodiaconescu.models;

import ro.uvt.info.splablucianodiaconescu.services.Visitee;
import ro.uvt.info.splablucianodiaconescu.services.Visitor;

public class Image implements Element, Visitee {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }

    @Override
    public void print(){
        System.out.println("Image with: " + imageName);
    }

}