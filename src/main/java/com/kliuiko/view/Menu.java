package com.kliuiko.view;

import com.kliuiko.controller.Controller;
import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.Manufacturer;
import com.kliuiko.model.enams.SignOfUsed;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class Menu {
    private String menu = "1. Get all laptops" +
            "\n2. Get all laptops in sort by manufacturer " +
            "\n3. Get only laptops with memory more than 16 GB " +
            "\n4. Get all laptops with sign of using" +
            "\n5. Exit from menu";
    private Scanner scanner = new Scanner(System.in);
    private int exit = 0;
    private int choice;

    private Controller controller;
    private Manufacturer manufacturer;
    private SignOfUsed signOfUsed;

    public void show() {
        System.out.println(menu);
        try {
            choice = scanner.nextInt();
            switch (choice) {
//                case 1 -> findAll();
//                case 2 -> findAllByManufacturer(manufacturer);
//                case 3 -> findByMemoryGb16GreaterThan();
                case 4 -> findAllBySignOfUsing(signOfUsed);
                case 5 -> findById();
                case 6 -> System.exit(exit);
                default -> show();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Enter please only numbers and try again.");
        }
    }

//    public void findAll() {
//         controller.findAll();
//    }

//    public List<Laptop> findAllByManufacturer(Manufacturer manufacturer) {
//        System.out.println("Enter please manufacturer, who made laptop: 1. APPLE, 2. SAMSUNG, 3. HUAWEI, 4. HP, 5. DELL, 6. LENOVO");
//        choice = scanner.nextInt();
//        switch (choice) {
//            case 1 -> manufacturer = Manufacturer.APPLE;
//            case 2 -> manufacturer = Manufacturer.SAMSUNG;
//            case 3 -> manufacturer = Manufacturer.HUAWEI;
//            case 4 -> manufacturer = Manufacturer.HP;
//            case 5 -> manufacturer = Manufacturer.DELL;
//            case 6 -> manufacturer = Manufacturer.LENOVO;
//            default -> show();
//        }
//        return controller.findAllByManufacturer(manufacturer);
//    }

//    public List<Laptop> findByMemoryGb16GreaterThan() {
//        return controller.findByMemoryGb16GreaterThan();
//    }

    public void findById() {
        System.out.println("Enter please ID number: ");
        long id = scanner.nextLong();
         controller.findById(id);
    }

    public void findAllBySignOfUsing(SignOfUsed signOfUsed) {
        System.out.println("Enter please type of using: 1. NONE, 2. NOTICEABLE, 3. INSIGNIFICANT\n");
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> signOfUsed = SignOfUsed.NONE;
            case 2 -> signOfUsed = SignOfUsed.NOTICEABLE;
            case 3 -> signOfUsed = SignOfUsed.INSIGNIFICANT;
            default -> show();
        }
         controller.findAllBySignOfUsed(signOfUsed);
    }
}
