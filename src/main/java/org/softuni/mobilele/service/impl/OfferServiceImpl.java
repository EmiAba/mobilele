package org.softuni.mobilele.service.impl;

import org.softuni.mobilele.model.dto.CreateOfferDto;
import org.softuni.mobilele.repository.OfferRepository;
import org.softuni.mobilele.service.OfferService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;


    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public UUID createOffer(CreateOfferDto createOfferDto) {
        //todo create offer
            throw new UnsupportedOperationException(" ");
    }
}
