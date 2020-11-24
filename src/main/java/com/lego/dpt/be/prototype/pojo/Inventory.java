package com.lego.dpt.be.prototype.pojo;

public class Inventory {

    private String sku;

    private String location;

    private int qty;

    public Inventory() {
    }

    public Inventory(String sku, String location, int qty) {
        this.sku = sku;
        this.location = location;
        this.qty = qty;
    }

    public String getSku() {
        return sku;
    }

    public String getLocation() {
        return location;
    }

    public int getQtyAvailable() {
        return qty;
    }
}