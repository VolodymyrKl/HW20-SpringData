package com.kliuiko.service;

import com.google.common.collect.Lists;
import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.*;
import com.kliuiko.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopServiceImpl implements LaptopService {
    private LaptopRepository laptopRepository;

    @Autowired
    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public List<Laptop> findAll() {
        return Lists.newArrayList(laptopRepository.findAll());
    }


    //    public List<Laptop> findAll() {
//        return laptopRepository.findAll();
//    }
    public List<Laptop> findAllByManufacturer(Manufacturer manufacturer) {
        return laptopRepository.findAllByManufacturer(manufacturer);
    }

    public Optional<Laptop> findById(Long id) {
        return laptopRepository.findById(id);
    }

//    public List<Laptop> findByMemoryGreaterThan() {
//        return laptopRepository.findByMemoryGreaterThan();
//    }

    public List<Laptop> findAllBySignOfUsed(SignOfUsed signOfUsed) {
        return laptopRepository.findAllBySignOfUsed(signOfUsed);
    }
}
