package com.kliuiko.repository;

import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Slf4j
public class IndexDataBase {

    @Bean
    CommandLineRunner initDataBase(LaptopRepository laptopRepository) {
        return args -> {
            log.info(String.valueOf(laptopRepository.saveAll(addProduct())));
        };
    }

    public List<Laptop> addProduct() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("MacBook", Manufacturer.APPLE, CPU.INTEL, 32, SignOfUsed.NONE, TypeOfShell.PLASTIC, 1000, 2015));
        laptops.add(new Laptop("Inspirion", Manufacturer.DELL, CPU.INTEL, 16, SignOfUsed.INSIGNIFICANT, TypeOfShell.METAL, 840, 2010));
        laptops.add(new Laptop("H25", Manufacturer.HP, CPU.AMD, 32, SignOfUsed.NOTICEABLE, TypeOfShell.GOLD, 1200, 2017));
        laptops.add(new Laptop("G-84", Manufacturer.APPLE, CPU.AMD, 128, SignOfUsed.INSIGNIFICANT, TypeOfShell.ALUMINUM, 950, 2015));
        laptops.add(new Laptop("Future", Manufacturer.APPLE, CPU.AMD, 64, SignOfUsed.INSIGNIFICANT, TypeOfShell.PLASTIC, 1100, 2011));
        laptops.add(new Laptop("R47", Manufacturer.HUAWEI, CPU.INTEL, 8, SignOfUsed.NONE, TypeOfShell.ALUMINUM, 840, 2012));
        laptops.add(new Laptop("Innovation", Manufacturer.SAMSUNG, CPU.INTEL, 32, SignOfUsed.NONE, TypeOfShell.PLASTIC, 950, 2018));
        laptops.add(new Laptop("IdeaPad", Manufacturer.LENOVO, CPU.AMD, 32, SignOfUsed.NOTICEABLE, TypeOfShell.METAL, 1019, 2019));
        laptops.add(new Laptop("Pavilion", Manufacturer.HP, CPU.INTEL, 128, SignOfUsed.NONE, TypeOfShell.PLASTIC, 1500, 2020));
        laptops.add(new Laptop("G5", Manufacturer.APPLE, CPU.INTEL, 32, SignOfUsed.NONE, TypeOfShell.ALUMINUM, 1000, 2012));
        laptops.add(new Laptop("Vostro", Manufacturer.DELL, CPU.INTEL, 8, SignOfUsed.NOTICEABLE, TypeOfShell.ALUMINUM, 740, 2010));
        laptops.add(new Laptop("IdeaPad", Manufacturer.LENOVO, CPU.AMD, 16, SignOfUsed.NONE, TypeOfShell.ALUMINUM, 999, 2013));
        return laptops;
    }
}
