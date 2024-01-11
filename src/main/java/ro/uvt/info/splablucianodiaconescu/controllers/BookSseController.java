package ro.uvt.info.splablucianodiaconescu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.splablucianodiaconescu.models.Book;

@Controller
public class BookSseController {
    /*@PostMapping
    public String newBook(@RequestBody NewBookRequest newBookRequest) {
        Book book = createBook(newBookRequest);
        book = booksRepository.save(book);
        allBooksSubject.add(book);
        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }
    @GetMapping("/books-sse")
    public String home() {
        return "index";
    }
    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }*/
}