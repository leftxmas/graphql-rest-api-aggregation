package com.lego.dpt.be.prototype.api;

import com.lego.dpt.be.prototype.pojo.PurchaseOrder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PurchaseOrderController {

    private static final List<PurchaseOrder> purchaseOrders = Arrays.asList(
            new PurchaseOrder("12345", "2020-07-01", "2020-07-05", 15),
            new PurchaseOrder("67890", "2020-08-01", "2020-07-05", 10)
    );

    @GetMapping(value = "/purchaseorder/{sku}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PurchaseOrder> getPurchaseOrder(@PathVariable(value = "sku") String sku) {
        List<PurchaseOrder> foundPurchaseOrders = new ArrayList<>();

        for (PurchaseOrder purchaseOrder : purchaseOrders) {
            if (purchaseOrder.getSku().equals(sku)) {
                foundPurchaseOrders.add(purchaseOrder);
            }
        }

        return foundPurchaseOrders;
    }

}
