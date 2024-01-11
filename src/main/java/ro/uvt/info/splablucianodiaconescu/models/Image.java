package ro.uvt.info.splablucianodiaconescu.models;

public class Image implements Element{
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
    public void print(){
        System.out.println("Image with: " + imageName);
    }

}