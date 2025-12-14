package com.vensoftlabs.controller;

import com.vensoftlabs.model.*;
import com.vensoftlabs.service.VensoftService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class VensoftController {
@Autowired
    private VensoftService service;

    // ✅ INSERT Home Page Content
    @PostMapping("/homeContent")
    public ResponseEntity<Home> createHome(@RequestBody Home home){
        return ResponseEntity.ok(service.createHomaePage(home));
    }

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

    @PostMapping("/services/page")
    public ResponseEntity<ServicesPage> savePage(
            @RequestBody ServicesPage page) {
        return ResponseEntity.ok(service.savePage(page));
    }

    @PostMapping("/services/item")
    public ResponseEntity<ServiceItem> saveItem(
            @RequestBody ServiceItem item) {
        return ResponseEntity.ok(service.saveItem(item));
    }

    // 🌐 Public APIs
    @GetMapping("/services/page")
    public ResponseEntity<ServicesPage> getPage() {
        return ResponseEntity.ok(service.getPage());
    }

    @GetMapping("/services/items")
    public ResponseEntity<List<ServiceItem>> getItems() {
        return ResponseEntity.ok(service.getAllItems());
    }
}

