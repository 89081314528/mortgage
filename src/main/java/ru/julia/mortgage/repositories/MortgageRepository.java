package ru.julia.mortgage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.mortgage.enteties.Mortgage;

public interface MortgageRepository extends JpaRepository<Mortgage, String> {
}
