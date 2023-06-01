package dev.asheep.charitymanagementapp.service;

import dev.asheep.charitymanagementapp.models.Donation;
import dev.asheep.charitymanagementapp.repositories.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationServiceImpl implements DonationService{
    @Autowired
    private DonationRepository donationRepository;

    @Override
    public Donation createDonation(Donation donation) {
        return donationRepository.save(donation);
    }
}