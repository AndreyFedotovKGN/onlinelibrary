package pro.sky.onlinelibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.onlinelibrary.library.Book;
import pro.sky.onlinelibrary.service.ManagementService;
import pro.sky.onlinelibrary.service.UserService;

import java.util.Collection;

@RestController
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/buy")
    public Book buyBook(@RequestParam int id) {
        return userService.bookAdd(id);
    }

    @GetMapping("/all")
    public Collection<Book> allBook() {
        return userService.allBook();
    }

}

