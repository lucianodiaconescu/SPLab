package ro.uvt.info.splablucianodiaconescu.services;

public class AlignCenter implements AlignStrategy {
    @Override
    public String render(String text) {
        int totalSpaces = 80 - text.length();
        int leftSpaces = totalSpaces / 2;
        int rightSpaces = totalSpaces - leftSpaces;
        String alignedText = String.format("%" + leftSpaces + "s%s%" + rightSpaces + "s", "", text, "");
        return alignedText;
    }
}
