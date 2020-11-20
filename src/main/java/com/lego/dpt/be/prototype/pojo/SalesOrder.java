package com.lego.dpt.be.prototype.pojo;

public class SalesOrder {

    private String sku;

    private int qty;

    private float unitPrice;

    private float totalAmount;

    private int discount;

    public SalesOrder() {
    }

    public SalesOrder(String sku, int qty, float unitPrice, float totalAmount) {
        this.sku = sku;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
    }

    public Product getItem() {
        Product product = new Product();
        product.setSku(sku);
        return product;
    }

    public String getSku() {
        return sku;
    }

    public int getQty() {
        return qty;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
