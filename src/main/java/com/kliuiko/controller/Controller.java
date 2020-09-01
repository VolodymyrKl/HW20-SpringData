package com.kliuiko.controller;

import com.kliuiko.exceptions.LaptopException;
import com.kliuiko.model.Laptop;
import com.kliuiko.model.enams.*;
import com.kliuiko.service.LaptopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.validation.Valid;
import java.util.Optional;

@Component
@RestController
@RequestMapping("/home")
@ResponseBody
public class Controller {

    @Autowired
    ServletContext servletContext;
    private LaptopServiceImpl laptopServiceImpl;

    @Autowired
    public Controller(LaptopServiceImpl laptopServiceImpl) {
        this.laptopServiceImpl = laptopServiceImpl;
    }

    public Controller() {
    }

    @GetMapping
    public String index() {
        return "index.html";
    }

    @GetMapping(path = "/findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        laptopServiceImpl.findAll();
        for (Laptop laptops : laptopServiceImpl.findAll()) {
            modelAndView.addObject("laptops", laptopServiceImpl.findAll());
        }
        modelAndView.setViewName("findAll.html");
        return modelAndView;
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("laptop") Laptop laptop,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("model", laptop.getModel());
        model.addAttribute("manufacturer", laptop.getManufacturer());
        //Do Something
        return "newlaptop.html";
    }

    //
//    @Transactional
//    @PostMapping(path = "/save")
//    public String save(@RequestParam("model") String modelq,
//                       @RequestParam("manufacturer") Manufacturer manufacturer,
//                       @RequestParam("cpu") CPU cpu,
//                       @RequestParam("memory") int memory,
//                       @RequestParam("signofused") SignOfUsed signOfUsed,
//                       @RequestParam("typeofshell") TypeOfShell typeOfShell,
//                       @RequestParam("price") float price,
//                       @RequestParam("year") int year, Model model) {
//
//        Laptop laptop = new Laptop(modelq, manufacturer, cpu, memory, signOfUsed,
//                typeOfShell, price, year);
//        model.addAttribute(laptop);
//        laptopServiceImpl.save(laptop);
//        return "save.html";
//    }

    @GetMapping(path = "/findman")
    public String findAllByManufacturer(Model model, @RequestParam(name = "manufacturer", required = false) Manufacturer manufacturer) {
        model.addAttribute("Manufacturer", laptopServiceImpl.findAllByManufacturer(manufacturer));

        laptopServiceImpl.findAllByManufacturer(manufacturer);
        return "findman.html";
    }

    @GetMapping("/laptop/{id}")
    public String findById(@PathVariable Long id) {
        Optional.ofNullable(laptopServiceImpl.findById(id)
                .orElseThrow(() -> new LaptopException(id)));
        return "findbyid.html";
    }

//    @GetMapping(path = "/findmemory")
//    public String findByMemoryGreaterThan() {
//        laptopServiceImpl.findByMemoryGreaterThan();
//        return "findmemory.html";
//    }

    @GetMapping(path = "/findused")
    public String findAllBySignOfUsed(SignOfUsed signOfUsed) {
        laptopServiceImpl.findAllBySignOfUsed(signOfUsed);
        return "findused.html";
    }
}
