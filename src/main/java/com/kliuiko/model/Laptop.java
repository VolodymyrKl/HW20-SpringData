package com.kliuiko.model;

import com.kliuiko.model.enams.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String model;
    private Manufacturer manufacturer;
    private CPU cpu;
    private int memory;
    private SignOfUsed signOfUsed;
    private TypeOfShell typeOfShell;
    private float price;
    private int year;

    public Laptop(String model, Manufacturer manufacturer, CPU cpu, int memory,
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

    public Laptop() {

    }
}
