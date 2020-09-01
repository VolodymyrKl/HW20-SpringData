package com.kliuiko.service;

import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.Manufacturer;
import com.kliuiko.model.enams.SignOfUsed;

import java.util.List;

public interface LaptopService {
    List<Laptop> findAll();

    //    Optional<Laptop> findById(Long id);
    List<Laptop> findAllByManufacturer(Manufacturer manufacturer);

//    List<Laptop> findByMemoryGb16GreaterThan();

    List<Laptop> findAllBySignOfUsed(SignOfUsed signOfUsed);

}
