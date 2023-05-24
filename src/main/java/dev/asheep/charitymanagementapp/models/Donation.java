package dev.asheep.charitymanagementapp.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne()
    @JoinColumn(name = "donor_id")
    private Donor donor;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne()
    @JoinColumn(name = "event_id")
    private Event event;

    private Number Amount;
    private Date Time;
}
