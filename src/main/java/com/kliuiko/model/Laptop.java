package com.kliuiko.model;

import com.kliuiko.model.enams.*;
import lombok.*;

import javax.persistence.*;

@Entity
@Data

@NoArgsConstructor
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String model;
    @Enumerated(EnumType.STRING)
    private Manufacturer manufacturer;
    private String cpu;
    private int memory;
    @Enumerated(EnumType.STRING)
    private SignOfUsed signOfUsed;
    @Enumerated(EnumType.STRING)
    private TypeOfShell typeOfShell;
    private float price;
    private int year;

    public Laptop(String model, Manufacturer manufacturer, String cpu, int memory,
                  SignOfUsed signOfUsed, TypeOfShell typeOfShell, float price, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.memory = memory;
        this.signOfUsed = signOfUsed;
        this.typeOfShell = typeOfShell;
        this.price = price;
        this.year = year;
    }
}
