package com.certifysphere.springDemo;

public class Payment {
    private String id;
    private String cardNumber;
    private String cvv;
    private String name;
    private String postalCode;

    public void setId(String id) {
        this.id = id;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getId() {
        return id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCvv() {
        return cvv;
    }
    public String getName() {
        return name;
    }
    public String getPostalCode() {
        return postalCode;
    }
    @Override
    public String toString() {
        return "Payment [id=" + id + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", name=" + name + ", postalCode="
                + postalCode + "]";
    }

    

}
