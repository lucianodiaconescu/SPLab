package ro.uvt.info.splablucianodiaconescu.models;

public class AlignRight implements AlignStrategy {
    @Override
    public String render(String text) {
        int totalSpaces = 80 - text.length();
        String alignedText = String.format("%" + totalSpaces + "s", text);
        return alignedText;
    }
}