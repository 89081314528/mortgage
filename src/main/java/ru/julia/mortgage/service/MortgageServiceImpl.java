package ru.julia.mortgage.service;

import org.springframework.stereotype.Service;
import ru.julia.mortgage.dto.MortgageDto;
import ru.julia.mortgage.enteties.Mortgage;
import ru.julia.mortgage.repositories.MortgageRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MortgageServiceImpl implements MortgageService {
    private final MortgageRepository mortgageRepository;

    public MortgageServiceImpl(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }
@Override
    public MortgageDto findByNumber(String passportNumber) {
        Mortgage mortgage = mortgageRepository.findById(passportNumber).orElse(null);
        MortgageDto mortgageDto;
        if (mortgage == null) {
            mortgageDto = new MortgageDto(null, null, null, "не найден человек с таким номером паспорта");
        } else {
            mortgageDto = new MortgageDto(mortgage.getName(), mortgage.getSurname(), mortgage.getMonthlyPayment(), mortgage.getPassport());
        }
        return mortgageDto;
    }
@Override
    public List<MortgageDto> findAllPerson() {
        List<MortgageDto> mortgageDto = new ArrayList<>();
        List<Mortgage> mortgage = mortgageRepository.findAll();
        for (int i = 0; i < mortgage.size(); i++) {
            Mortgage mortgages = mortgage.get(i);
            mortgageDto.add(new MortgageDto(mortgages.getName(), mortgages.getSurname(), mortgages.getMonthlyPayment(),
                    mortgages.getPassport()));
        }
        return mortgageDto;
    }
}
