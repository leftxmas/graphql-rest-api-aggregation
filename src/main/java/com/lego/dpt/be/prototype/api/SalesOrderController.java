package com.lego.dpt.be.prototype.api;

import com.lego.dpt.be.prototype.pojo.SalesOrder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SalesOrderController {

    private static final List<SalesOrder> salesOrders = Arrays.asList(
            new SalesOrder("12345", 1,150, 150),
            new SalesOrder("67890", 3, 50, 150)
    );

    @GetMapping(value = "/salesorder/{sku}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SalesOrder> getSalesOrder(@PathVariable(value = "sku") String sku) {
        List<SalesOrder> foundSalesOrders = new ArrayList<>();

        for (SalesOrder salesOrder : salesOrders) {
            if (salesOrder.getSku().equals(sku)) {
                foundSalesOrders.add(salesOrder);
            }
        }

        return foundSalesOrders;
    }

}
