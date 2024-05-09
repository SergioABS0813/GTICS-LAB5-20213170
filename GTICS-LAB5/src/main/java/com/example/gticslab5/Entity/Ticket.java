package com.example.gticslab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TicketID")
    private int ticketId;
    @Column(name = "SiteID")
    private int siteId;
    @Column(name = "TechnicianID")
    private int technicianId;
    @Column(name = "Status")
    private String status;
    @Column(name = "OpenedDate")
    private String openedDate;
    @Column(name = "ClosedDate")
    private String closeDate;
}
