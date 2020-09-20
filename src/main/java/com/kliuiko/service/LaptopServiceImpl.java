package com.kliuiko.service;

import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.SignOfUsed;
import com.kliuiko.model.enams.Manufacturer;
import com.kliuiko.repository.LaptopRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    public Optional<Laptop> findById(Long id) {
        return laptopRepository.findById(id);
    }

    public List<Laptop> findByManufacturer(Manufacturer manufacturer) {
        return laptopRepository.findAllByManufacturer(manufacturer);
    }

    public List<Laptop> findByMemoryGreaterThan(int value) {
        return laptopRepository.findByMemoryGreaterThan(value);
    }

    public List<Laptop> findAllBySignOfUsed(SignOfUsed signOfUsed) {
        return laptopRepository.findAllBySignOfUsed(signOfUsed);
    }
}


