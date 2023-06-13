package br.com.roberto.microserviceclientapi.transportlayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;


@RestController
@RequestMapping("api/v1")
public class ClientController {

    @GetMapping("/")
    public Collection<Book> findBooks() {
        Collection<Book> books = new ArrayList<>();
        books.add(new Book("40"));
        books.add(new Book("30"));
        books.add(new Book("20"));
        return books;
    }


}
