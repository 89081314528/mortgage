package ru.julia.mortgage.service;

import ru.julia.mortgage.dto.MortgageDto;

import java.util.List;

public interface MortgageService {
    public MortgageDto findByNumber(String passportNumber);
    public List<MortgageDto> findAllPerson();
}
