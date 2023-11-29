package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;
import org.softuni.mobilele.model.enums.ModelCategoryEnum;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {
    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategoryEnum category;


    @ManyToOne
    public BrandEntity brand;

    public ModelEntity() {
    }


    public String name() {
        return name;
    }

    public ModelEntity setName(String name) {
        this.name = name;
        return  this;
    }

    public ModelCategoryEnum category() {
        return category;
    }

    public ModelEntity setCategory(ModelCategoryEnum category) {
        this.category = category;
        return this;
    }

    public BrandEntity brand() {
        return brand;
    }

    public ModelEntity setBrand(BrandEntity brand) {
        this.brand = brand;
        return this;
    }
}
