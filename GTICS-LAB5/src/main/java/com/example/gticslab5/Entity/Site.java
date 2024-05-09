package com.example.gticslab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "site")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "siteID")
    private int siteId;
    @Column(name = "SiteName")
    private String firstName;
    @Column(name = "LocationID")
    private int locationID;
    @Column(name = "InstallationDate")
    private Date installationDate;
    @Column(name = "Latitude")
    private String latitude;
    @Column(name = "Longitude")
    private String longitude;


}
