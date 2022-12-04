package pro.sky.onlinelibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.onlinelibrary.library.Book;
import pro.sky.onlinelibrary.service.ManagementService;

@RestController
public class ManagementController {

    private ManagementService managementService;

    public ManagementController(ManagementService managementService) {
        this.managementService = managementService;
    }

    @GetMapping(path = "/book")
    public Book bookAdd(@RequestParam String title,
                        @RequestParam int rentalPrise,
                        @RequestParam String name) {
       return managementService.addBook(title, rentalPrise, name);
    }

    @GetMapping(path = "/getbook")
    public Book bookGet(@RequestParam int id) {
        return managementService.findBook(id);
    }

    @GetMapping(path = "/remove")
    public Book bookRemove(@RequestParam int id) {
        return managementService.removeBook(id);
    }

}
