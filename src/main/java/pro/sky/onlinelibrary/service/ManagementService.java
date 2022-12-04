package pro.sky.onlinelibrary.service;

import org.springframework.stereotype.Service;
import pro.sky.onlinelibrary.library.Author;
import pro.sky.onlinelibrary.library.Book;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ManagementService {

    private Collection<Book> libraryBook;

    public ManagementService() {
        this.libraryBook = new ArrayList<>();
    }

    public Book findBook(int id) {
        return libraryBook.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    public Book addBook(String title, int rentalPrice, String name) {
        Author author = new Author(name);
        Book book = new Book(author,title,rentalPrice);
        libraryBook.add(book);
        return book;
    }

    public Book removeBook(int id) {
        Book bookRemove = findBook(id);
        libraryBook.removeIf(book -> book.getId() == id);
        return bookRemove;

    }


}
