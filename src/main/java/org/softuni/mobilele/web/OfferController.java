package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.CreateOfferDto;
import org.softuni.mobilele.model.enums.EngineEnum;
import org.softuni.mobilele.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/offers")
public class OfferController {
    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }


    @GetMapping("/all")
    public String all() {

        return "offers";
    }

    @ModelAttribute("engines")
    public EngineEnum[] engines() {
        return EngineEnum.values();

    }


    @GetMapping("/add")
    public String add(Model model) {

        return "offer-add";
    }


    @PostMapping()
    public String add(CreateOfferDto createOfferDto) {
        offerService.createOffer(createOfferDto);

        return "index";

    }


    @GetMapping("/{uuid}/details")
    public String details(@PathVariable("uuid") UUID uuid) {
        return "details";
    }


}
