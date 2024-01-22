// ShipmentDetails.java
package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "shipment_id")
    private String shipmentId;
    @Column(name = "shipmentAddress")
    private String shipmentAddress;
    @Column(name = "billAddress")
    private String billAddress;
}
