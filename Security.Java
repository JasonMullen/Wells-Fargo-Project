package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

/**
 * Represents a Security entity in the system. This entity stores details about
 * securities which are part of a portfolio.
 */
@Entity  // Specifies that the class is an entity and is mapped to a database table.
public class Security {

    @Id  // Specifies the primary key of an entity.
    @GeneratedValue()  // Provides for the specification of generation strategies for the values of primary keys.
    private long securityId;

    // Defines a many-to-one association between Security and Portfolio.
    // Indicates that multiple securities can be associated with a single portfolio.
    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)  // Specifies that the 'name' should be included in the database table as a column, and also that it's mandatory.
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private float quantity;

    /**
     * Default constructor. It is needed by JPA for entity creation.
     */
    protected Security() {

    }

    /**
     * Parameterized constructor to initialize a security entity.
     * @param portfolio - Portfolio associated with the security.
     * @param name - Name of the security.
     * @param category - Category of the security.
     * @param purchasePrice - Purchase price of the security.
     * @param purchaseDate - Date the security was purchased.
     * @param quantity - Quantity of the security.
     */
    public Security(Portfolio portfolio, String name, String category, float purchasePrice, String purchaseDate, float quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    /**
     * @return security's ID.
     */
    public long getSecurityId() {
        return securityId;
    }

    /**
     * @return Portfolio associated with the security.
     */
    public Portfolio getPortfolio() {
        return portfolio;
    }

    /**
     * Set or update the Portfolio associated with the security.
     * @param portfolio - New portfolio.
     */
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    /**
     * @return Name of the security.
     */
    public String getName() {
        return name;
    }

    /**
     * Set or update the name of the security.
     * @param name - New name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Category of the security.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Set or update the category of the security.
     * @param category - New category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return Purchase price of the security.
     */
    public float getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Set or update the purchase price of the security.
     * @param purchasePrice - New purchase price.
     */
    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @return Date the security was purchased.
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Set or update the purchase date of the security.
     * @param purchaseDate - New purchase date.
     */
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * @return Quantity of the security.
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Set or update the quantity of the security.
     * @param quantity - New quantity.
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
