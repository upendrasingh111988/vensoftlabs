package com.vensoftlabs.service;

import com.vensoftlabs.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.vensoftlabs.model.*;

import java.util.List;

@Service

public class VensoftService {

    private final HomeRepository homeRepo;
    private final AboutUsRepository aboutUsRepo;
    private final PortfolioRepository portfolioRepo;
    private final ContactFormRepository contactFormRepo;
    private final ServicesPageRepository pageRepo;
    private final ServiceItemRepository itemRepo;


    public VensoftService(HomeRepository homeRepo, AboutUsRepository aboutUsRepo, PortfolioRepository portfolioRepo, ContactFormRepository contactFormRepo, ServicesPageRepository pageRepo, ServiceItemRepository itemRepo) {
        this.homeRepo = homeRepo;
        this.aboutUsRepo = aboutUsRepo;
        this.portfolioRepo = portfolioRepo;
        this.contactFormRepo = contactFormRepo;
        this.pageRepo = pageRepo;
        this.itemRepo = itemRepo;
    }

    public Home createHomaePage(Home home){

        return homeRepo.save(home);
    }
    public Home getHomeContent() {
        return homeRepo.findAll()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public AboutUs getAboutUs() {
        return aboutUsRepo
                .findAll()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public List<Portfolio> getPortfolio() {
        return portfolioRepo.findAll();
    }

    public ContactUs saveContactForm(ContactUs form) {
        return contactFormRepo.save(form);
    }

    public List<ContactUs> getAllContacts() {
        return contactFormRepo.findAll();
    }

    public ServicesPage savePage(ServicesPage page) {
        return pageRepo.save(page);
    }

    public ServiceItem saveItem(ServiceItem item) {
        return itemRepo.save(item);
    }

    public ServicesPage getPage() {
        return pageRepo.findAll().stream().findFirst().orElse(null);
    }

    public List<ServiceItem> getAllItems() {
        return itemRepo.findAll();
    }
}

