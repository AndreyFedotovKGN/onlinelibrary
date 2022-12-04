package pro.sky.onlinelibrary.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.onlinelibrary.library.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BooleanSupplier;

@Component
@SessionScope
public class UserStorage {
    private Collection<Book> userStorage;

    public UserStorage() {
        this.userStorage = new ArrayList<>();
    }

    public Book bookAdd(Book book) {
        userStorage.add(book);
        return book;
    }

    public Collection<Book> booksAll () {
        return userStorage;

    }
}
