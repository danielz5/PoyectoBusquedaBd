package com.edutecno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Comuna;

@Repository
public interface ComunaRepository extends JpaRepository<Comuna, Integer> {

}
