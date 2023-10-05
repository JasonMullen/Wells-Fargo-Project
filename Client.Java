package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

/**
 * Represents a Client entity in the system. This entity stores details about
 * clients who are associated with Advisors.
 */
@Entity  // Specifies that the class is an entity and is mapped to a database table.
public class Client {

    @Id  // Specifies the primary key of an entity.
    @GeneratedValue()  // Provides for the specification of generation strategies for the values of primary keys.
    private long clientId;

    // Defines a many-to-one association between Client and Advisor. 
    // Indicates that multiple clients can be associated with a single advisor.
    @ManyToOne  
    private Advisor advisor;

    @Column(nullable = false)  // Specifies that a persistent property or field should be included in the database table as a column, and also that it's mandatory.
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    /**
     * Default constructor. It is needed by JPA for entity creation.
     */
    protected Client() {

    }

    /**
     * Parameterized constructor to initialize a client entity.
     * @param advisor - Advisor associated with the client.
     * @param firstName - First name of the client.
     * @param lastName - Last name of the client.
     * @param address - Address of the client.
     * @param phone - Phone number of the client.
     * @param email - Email address of the client.
     */
    public Client(Advisor advisor, String firstName, String lastName, String address, String phone, String email) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    /**
     * @return client's ID.
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * @return Advisor associated with the client.
     */
    public Advisor getAdvisor() {
        return advisor;
    }

    /**
     * Set or update the Advisor associated with the client.
     * @param advisor - New advisor.
     */
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    /**
     * @return First name of the client.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set or update the client's first name.
     * @param firstName - New first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Last name of the client.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set or update the client's last name.
     * @param lastName - New last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Address of the client.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set or update the client's address.
     * @param address - New address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return Phone number of the client.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set or update the client's phone number.
     * @param phone - New phone number.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return Email address of the client.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set or update the client's email address.
     * @param email - New email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
