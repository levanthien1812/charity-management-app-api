package dev.asheep.charitymanagementapp.models;

import jakarta.persistence.*;

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

//    used for category money
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transfer_id")
    private TransferFrom transfer;

//    used for category item
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private ItemFrom item;
}
