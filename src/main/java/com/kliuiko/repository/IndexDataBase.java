package com.kliuiko.repository;

import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class IndexDataBase {

    @Bean
    CommandLineRunner initDataBase(LaptopRepository laptopRepository) {
        return args -> log.info(java.lang.String.valueOf(laptopRepository.saveAll(addProduct())));
    }

    public List<Laptop> addProduct() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("MacBook", Manufacturer.Apple, "Intel", 32, SignOfUsed.NONE, TypeOfShell.Plastic, 1000, 2015));
        laptops.add(new Laptop("Inspirion", Manufacturer.Dell, "Intel", 16, SignOfUsed.NOTICEABLE, TypeOfShell.Metal, 840, 2010));
        laptops.add(new Laptop("H25", Manufacturer.HP, "AMD", 32, SignOfUsed.NOTICEABLE, TypeOfShell.GOLD, 1200, 2017));
        laptops.add(new Laptop("G-84", Manufacturer.Apple, "AMD", 128, SignOfUsed.INSIGNIFICANT, TypeOfShell.Aluminum, 950, 2015));
        laptops.add(new Laptop("Future", Manufacturer.Apple, "AMD", 64, SignOfUsed.NONE, TypeOfShell.Plastic, 1100, 2011));
        laptops.add(new Laptop("R47", Manufacturer.Huawei, "Intel", 8, SignOfUsed.NOTICEABLE, TypeOfShell.Aluminum, 840, 2012));
        laptops.add(new Laptop("Innovation", Manufacturer.Samsung, "Intel", 32, SignOfUsed.NONE, TypeOfShell.Plastic, 950, 2018));
        laptops.add(new Laptop("IdeaPad", Manufacturer.Lenovo, "AMD", 32, SignOfUsed.INSIGNIFICANT, TypeOfShell.Metal, 1019, 2019));
        laptops.add(new Laptop("Pavilion", Manufacturer.HP, "Intel", 128, SignOfUsed.NONE, TypeOfShell.Plastic, 1500, 2020));
        laptops.add(new Laptop("G5", Manufacturer.Apple, "Intel", 32, SignOfUsed.NOTICEABLE, TypeOfShell.Aluminum, 1000, 2012));
        laptops.add(new Laptop("Vostro", Manufacturer.Dell, "Intel", 8, SignOfUsed.INSIGNIFICANT, TypeOfShell.Aluminum, 740, 2010));
        laptops.add(new Laptop("IdeaPad", Manufacturer.Lenovo, "AMD", 16, SignOfUsed.INSIGNIFICANT, TypeOfShell.Aluminum, 999, 2013));
        return laptops;
    }
}
