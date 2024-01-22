package com.example.demo.service;

import com.example.demo.model.Shipment;
import com.example.demo.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {
    @Autowired
    private ShipmentRepository shipmentRepository;
    @Override
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
    @Override
    public List<Shipment> getShipmentByShipmentId(String shipmentId) {
        return shipmentRepository.findByShipmentId(shipmentId);
    }
    @Override
    public List<Shipment> createShipment(List<Shipment> shipments) {
        List<Shipment> createdShipments = new ArrayList<>();

        if (!shipments.isEmpty()){
            for (Shipment shipment : shipments) {
                Shipment createdShipment = shipmentRepository.save(shipment);
                createdShipments.add(createdShipment);
            }
        }
        return createdShipments;
    }
}
