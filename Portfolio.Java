package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

/**
 * Represents a Portfolio entity in the system. Each portfolio is associated with
 * a client and contains details about the date of creation.
 */
@Entity  // Specifies that the class is an entity and is mapped to a database table.
public class Portfolio {

    @Id  // Specifies the primary key of an entity.
    @GeneratedValue()  // Provides for the specification of generation strategies for the values of primary keys.
    private long portfolioId;

    // Defines a many-to-one association between Portfolio and Client. 
    // Indicates that multiple portfolios can be associated with a single client.
    @ManyToOne  
    private Client client;

    @Column(nullable = false)  // Specifies that the 'creationDate' should be included in the database table as a column, and also that it's mandatory.
    private String creationDate;

    /**
     * Default constructor. It is needed by JPA for entity creation.
     */
    protected Portfolio() {

    }

    /**
     * Parameterized constructor to initialize a portfolio entity.
     * @param client - Client associated with the portfolio.
     * @param creationDate - The date the portfolio was created.
     */
    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    /**
     * @return portfolio's ID.
     */
    public Long getPortfolioId() {
        return portfolioId;
    }

    /**
     * @return Client associated with the portfolio.
     */
    public Client getCLient() {
        return client;
    }

    /**
     * Set or update the Client associated with the portfolio.
     * @param client - New client.
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return Creation date of the portfolio.
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Set or update the creation date of the portfolio.
     * @param creationDate - New creation date.
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
