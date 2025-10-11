package com.vensoftlabs.controller;

import com.vensoftlabs.model.*;
import com.vensoftlabs.service.VensoftService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class VensoftController {
@Autowired
    private VensoftService service;


    // ✅ Home page content
    @GetMapping("/home")
    public ResponseEntity<Home> getHome() {
        return ResponseEntity.ok(service.getHomeContent());
    }

    // ✅ About Us page
    @GetMapping("/about")
    public ResponseEntity<AboutUs> getAboutUs() {
        return ResponseEntity.ok(service.getAboutUs());
    }

    // ✅ Portfolio projects
    @GetMapping("/portfolio")
    public ResponseEntity<List<Portfolio>> getPortfolio() {
        return ResponseEntity.ok(service.getPortfolio());
    }

    // ✅ Submit contact form
    @PostMapping("/contact")
    public ResponseEntity<ContactUs> submitContact(@RequestBody ContactUs contact) {
        return ResponseEntity.ok(service.saveContactForm(contact));
    }

    // ✅ Admin: View all contacts
    @GetMapping("/contacts")
    public ResponseEntity<List<ContactUs>> getAllContacts() {
        return ResponseEntity.ok(service.getAllContacts());
    }
}

