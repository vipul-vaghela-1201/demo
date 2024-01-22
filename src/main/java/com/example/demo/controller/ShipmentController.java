package com.example.demo.controller;

import com.example.demo.model.Shipment;
import com.example.demo.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shipments")
@CrossOrigin(origins = "http://localhost:3000")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{shipmentId}")
    public ResponseEntity<List<Shipment>> getShipmentById(@PathVariable String shipmentId) {
        List<Shipment> shipments = shipmentService.getShipmentByShipmentId(shipmentId);
        return ResponseEntity.ok(shipments);
    }

    @PostMapping
    public ResponseEntity<List<Shipment>> createShipment(@RequestBody List<Shipment> shipments) {
        List<Shipment> createdShipment = shipmentService.createShipment(shipments);
        return new ResponseEntity<>(createdShipment, HttpStatus.CREATED);
    }

}
