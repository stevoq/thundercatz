package com.thundercatz.guestbook.controller;

import com.thundercatz.guestbook.domain.GuestBookEntry;
import com.thundercatz.guestbook.service.GuestBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/api")
@RestController
public class GuestBookRestController {

    @Autowired
    private GuestBookService guestBookService;

    @GetMapping ("/comments")
    public List <GuestBookEntry> testMapping () {
        return guestBookService.findAllEntries ();
    }

    @GetMapping ("/comment/{id}")
    public GuestBookEntry findGuestBookEntryById (@PathVariable ("id") Integer id) {
        return this.guestBookService.findGuestBookEntryById (id);
    }

    @GetMapping ("/user/{user}")
    public List <GuestBookEntry> findGuestBookEntriesByUser (@PathVariable ("user") String user) {
        return this.guestBookService.findGuestBookEntriesByUser (user);
    }

    @DeleteMapping ("/comment/{id}")
    public void deleteGuestBookEntryById (@PathVariable ("id") Integer id) {
        this.guestBookService.deleteGuestBookEntryById (id);
    }

    @PostMapping ("/add")
    public void addComment (@RequestBody GuestBookEntry guestBookEntry) {
        this.guestBookService.save (guestBookEntry);
    }

    @PostMapping ("/update")
    public void updateComment (@RequestBody GuestBookEntry guestBookEntry) {
        this.guestBookService.save (guestBookEntry);
    }

}
