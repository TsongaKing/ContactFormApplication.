/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */

package com.example.contactform.service;

import com.example.contactform.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(ContactForm contactForm) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@yourdomain.com");
        message.setTo("your-email@example.com"); // Replace with your email
        message.setSubject("New Contact Form Submission");
        message.setText(
            "Name: " + contactForm.getFirstName() + " " + contactForm.getLastName() + "\n" +
            "Email: " + contactForm.getEmail() + "\n" +
            "Phone: " + contactForm.getPhone() + "\n" +
            "Company: " + contactForm.getCompany() + "\n" +
            "Services: " + getServicesString(contactForm.getServices()) + "\n" +
            "Description: " + contactForm.getDescription()
        );

        mailSender.send(message);
    }

    private String getServicesString(ContactForm.Services services) {
        StringBuilder sb = new StringBuilder();
        if (services.isObm()) sb.append("Administrative services, ");
        if (services.isVirtualAssistant()) sb.append("Web Development, ");
        if (services.isConsulting()) sb.append("Social Media Management, ");
        if (services.isRetailSupport()) sb.append("Content Creation, ");
        if (services.isUnsure()) sb.append("Unsure, ");
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "None selected";
    }
}