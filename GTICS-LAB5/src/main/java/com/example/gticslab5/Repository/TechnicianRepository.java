package com.example.gticslab5.Repository;

import com.example.gticslab5.Entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Integer> {

    @Query(nativeQuery = true, value = "SELECT TechnicianID, FirstName, LastName, Dni, Phone, Age FROM technician")
    List<Technician> listarTecnicos();

}
