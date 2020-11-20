package com.lego.dpt.be.prototype.pojo;

public class Inventory {

    private final String sku;

    private final String location;

    private final int qty;

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