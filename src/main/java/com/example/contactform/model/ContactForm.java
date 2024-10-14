/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */

package com.example.contactform.model;

public class ContactForm {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String company;
    private Services services;
    private String description;

    // Getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public Services getServices() { return services; }
    public void setServices(Services services) { this.services = services; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public static class Services {
        private boolean obm;
        private boolean virtualAssistant;
        private boolean consulting;
        private boolean retailSupport;
        private boolean unsure;

        // Getters and setters
        public boolean isObm() { return obm; }
        public void setObm(boolean obm) { this.obm = obm; }

        public boolean isVirtualAssistant() { return virtualAssistant; }
        public void setVirtualAssistant(boolean virtualAssistant) { this.virtualAssistant = virtualAssistant; }

        public boolean isConsulting() { return consulting; }
        public void setConsulting(boolean consulting) { this.consulting = consulting; }

        public boolean isRetailSupport() { return retailSupport; }
        public void setRetailSupport(boolean retailSupport) { this.retailSupport = retailSupport; }

        public boolean isUnsure() { return unsure; }
        public void setUnsure(boolean unsure) { this.unsure = unsure; }
    }
}