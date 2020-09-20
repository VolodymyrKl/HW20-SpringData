package com.kliuiko.repository;

import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Long> {
    List<Laptop> findAll();

    Optional<Laptop> findById(Long id);

    List<Laptop> findAllByManufacturer(Manufacturer manufacturer);

    List<Laptop> findByMemoryGreaterThan(int value);

    List<Laptop> findAllBySignOfUsed(SignOfUsed signOfUsed);

}
