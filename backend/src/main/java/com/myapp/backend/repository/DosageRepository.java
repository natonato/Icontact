package com.myapp.backend.repository;

import com.myapp.backend.domain.entity.Dosage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface DosageRepository extends JpaRepository<Dosage, Integer> {

    Dosage findByDosageId(Integer dosageId);

    void deleteByDosageId(Integer dosageId);
}
