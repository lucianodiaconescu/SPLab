package ro.uvt.info.splablucianodiaconescu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.splablucianodiaconescu.models.Author;
import ro.uvt.info.splablucianodiaconescu.models.Book;
import ro.uvt.info.splablucianodiaconescu.models.Chapter;
import ro.uvt.info.splablucianodiaconescu.models.SubChapter;

@SpringBootApplication
public class SpLabLucianoDiaconescuApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpLabLucianoDiaconescuApplication.class, args);
		Book discoTitanic = new Book("Disco Titanic");
		Author author = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(author);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		scOneOne.print();
	}
}
