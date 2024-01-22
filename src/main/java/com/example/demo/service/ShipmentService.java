package com.example.demo.service;

import com.example.demo.model.Shipment;

import java.util.List;

public interface ShipmentService {
    List<Shipment> getAllShipments();
    List<Shipment> getShipmentByShipmentId(String shipmentId);
    List<Shipment> createShipment(List<Shipment> shipments);
}
