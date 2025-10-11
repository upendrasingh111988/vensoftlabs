package com.vensoftlabs.repository;

import com.vensoftlabs.model.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactUs, Long> {
}
