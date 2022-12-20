package com.basics.dao.doctor;

import com.basics.model.doctor.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctors, Integer> {
}
