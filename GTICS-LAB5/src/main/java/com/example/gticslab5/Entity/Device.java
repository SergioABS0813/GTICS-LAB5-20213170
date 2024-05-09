package com.example.gticslab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeviceID")
    private int deviceId;
    @Column(name = "DeviceName")
    private String deviceName;
    @Column(name = "DeviceType")
    private String deviceType;
    @Column(name = "Model")
    private String model;
    @Column(name = "SerialNumber")
    private String serialNumber;
    @Column(name = "SiteID")
    private int siteId;
}
