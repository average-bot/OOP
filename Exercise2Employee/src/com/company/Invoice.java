package com.company;

public class Invoice implements IPayable {

    private String invoiceNumber;
    private int quantity;
    private double pricePerItem;

    public Invoice(String invoiceNumber, int quantity, double pricePerItem) {
        this.invoiceNumber = invoiceNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public String toString(){
        return ("The invoice number:  " + invoiceNumber
                + "\n number of items: " + quantity
                + "\n Price per item: " + pricePerItem
              );
    }
}
