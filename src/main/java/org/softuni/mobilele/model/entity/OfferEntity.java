package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;
import org.softuni.mobilele.model.enums.EngineEnum;
import org.softuni.mobilele.model.enums.TransmissionEnum;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;
    @Enumerated(EnumType.STRING)
    private EngineEnum engine;
    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmission;
@Column(name="image_url")
    private String imageUrl;

    private long mileage;
    private BigDecimal price;
    private int year;

    @ManyToOne
    private ModelEntity model;

    public String description() {
        return description;
    }

    public EngineEnum engine() {
        return engine;
    }

    public TransmissionEnum transmission() {
        return transmission;
    }

    public String imageUrl() {
        return imageUrl;
    }

    public long mileage() {
        return mileage;
    }

    public BigDecimal price() {
        return price;
    }

    public int year() {
        return year;
    }

    public ModelEntity model() {
        return model;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public OfferEntity setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public OfferEntity setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public OfferEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public OfferEntity setMileage(long mileage) {
        this.mileage = mileage;
        return this;
    }

    public OfferEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public OfferEntity setYear(int year) {
        this.year = year;
        return this;
    }

    public OfferEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }
}
