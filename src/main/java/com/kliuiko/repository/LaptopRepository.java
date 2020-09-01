package com.kliuiko.repository;

import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.Manufacturer;
import com.kliuiko.model.enams.SignOfUsed;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@ComponentScan
public interface LaptopRepository extends CrudRepository<Laptop, Long> {
    Laptop save(Laptop laptop);

    List<Laptop> findAll();

    Optional<Laptop> findById(Long id);

    List<Laptop> findAllByManufacturer(Manufacturer manufacturer);

//    List<Laptop> findByMemoryGreaterThan();

    List<Laptop> findAllBySignOfUsed(SignOfUsed signOfUsed);

}
