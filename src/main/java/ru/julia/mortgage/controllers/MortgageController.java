package ru.julia.mortgage.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.mortgage.dto.MortgageDto;
import ru.julia.mortgage.enteties.Mortgage;
import ru.julia.mortgage.service.MortgageService;

import java.util.List;

@RestController
public class MortgageController {
    @RequestMapping("/{name}")
    public String hello(@PathVariable String name) {
        if (name.equals("Julia")) {
            return "hello, Julia";
        } else {
            return "hello";
        }
    }

    @RequestMapping("/conditions")
    public String condtions() {
        return "9,6%" + "<br/>" + " 1800 000";
    }

    private final MortgageService mortgageService;

    public MortgageController(MortgageService mortgageService) {
        this.mortgageService = mortgageService;
    }

    @RequestMapping("/showAll")
    public List<MortgageDto> showAll() {
        return mortgageService.findAllPerson();
    }

    @RequestMapping("/findByPassport/{passportNumber}")
    public MortgageDto findbyPassport(@PathVariable String passportNumber) {
        return mortgageService.findByNumber(passportNumber);
    }
}
