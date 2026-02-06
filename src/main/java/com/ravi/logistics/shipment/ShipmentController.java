package com.ravi.logistics.shipment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentController {
    @GetMapping("/shipments/test")
    public String test() {
        return "Shipment service is working";
    }
}
