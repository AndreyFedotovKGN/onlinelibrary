package pro.sky.onlinelibrary.service;

import org.springframework.stereotype.Service;
import pro.sky.onlinelibrary.library.Book;

import java.util.Collection;

@Service
public class UserService {

    private final ManagementService managementService;

    private final UserStorage userStorage;

    public UserService(ManagementService managementService, UserStorage userStorage) {
        this.managementService = managementService;
        this.userStorage = userStorage;
    }

    public Book bookAdd(int id) {
        Book bookLibrary = managementService.findBook(id);
        userStorage.bookAdd(bookLibrary);
        return bookLibrary;
    }

    public Collection<Book> allBook() {
       return userStorage.booksAll();
    }
}
