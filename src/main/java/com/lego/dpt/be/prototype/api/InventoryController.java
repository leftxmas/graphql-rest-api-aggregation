package com.lego.dpt.be.prototype.api;

import com.lego.dpt.be.prototype.pojo.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class InventoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryController.class);

    private static final List<Inventory> inventories = Arrays.asList(
            new Inventory("12345", "Aisle 5", 109),
            new Inventory("67890", "Aisle 1", 10)
    );

    @GetMapping(value = "/inventory/{sku}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Inventory> getInventory(@PathVariable(value = "sku") String sku) {

        List<Inventory> foundInventories = new ArrayList<>();

        for (Inventory inventory : inventories) {
            if (inventory.getSku().equals(sku)) {
                foundInventories.add(inventory);
            }
        }

        return foundInventories;
    }

}
