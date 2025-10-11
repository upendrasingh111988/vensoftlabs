package com.vensoftlabs.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contact_us")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactUs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String subject;
    private String message;

}
