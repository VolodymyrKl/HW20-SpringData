package com.kliuiko.controller;

import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.SignOfUsed;
import com.kliuiko.model.enams.Manufacturer;
import com.kliuiko.service.LaptopServiceImpl;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/laptop")
@NoArgsConstructor
@Data
public class LaptopController {

    private LaptopServiceImpl laptopServiceImpl;

    @Autowired
    public LaptopController(LaptopServiceImpl laptopServiceImpl) {
        this.laptopServiceImpl = laptopServiceImpl;
    }

    @PostMapping("/save")
    public Laptop save(@RequestBody Laptop laptop) {
        return laptopServiceImpl.save(laptop);
    }

    @GetMapping("/findall")
    public List<Laptop> findAll() {
        return laptopServiceImpl.findAll();
    }

    @GetMapping("/findbyid/{id}")
    public Optional<Laptop> findById(@PathVariable Long id) {
        return laptopServiceImpl.findById(id);
    }

    @GetMapping("/findbymanuf/{manufacturer}")
    public List<Laptop> findByManufacturer(@PathVariable Manufacturer manufacturer) {
        return laptopServiceImpl.findByManufacturer(manufacturer);
    }

    @GetMapping(path = "/findused/{signOfUsed}")
    public List<Laptop> findByManufacturer(@PathVariable SignOfUsed signOfUsed) {
        return laptopServiceImpl.findAllBySignOfUsed(signOfUsed);
    }
    @GetMapping(path = "/findbymemory/{value}")
    public List<Laptop> findByMemory(@PathVariable int value) {
        return laptopServiceImpl.findByMemoryGreaterThan(value);
    }
}
