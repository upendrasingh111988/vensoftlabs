package com.vensoftlabs.service;

import com.vensoftlabs.repository.AboutUsRepository;
import com.vensoftlabs.repository.ContactFormRepository;
import com.vensoftlabs.repository.HomeRepository;
import com.vensoftlabs.repository.PortfolioRepository;
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

    public VensoftService(HomeRepository homeRepo, AboutUsRepository aboutUsRepo, PortfolioRepository portfolioRepo, ContactFormRepository contactFormRepo) {
        this.homeRepo = homeRepo;
        this.aboutUsRepo = aboutUsRepo;
        this.portfolioRepo = portfolioRepo;
        this.contactFormRepo = contactFormRepo;
    }

    public Home getHomeContent() {
        return homeRepo.findAll().stream().findFirst().orElse(null);
    }

    public AboutUs getAboutUs() {
        return aboutUsRepo.findAll().stream().findFirst().orElse(null);
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
}

