package com.basics.service.doctor;


import com.basics.dao.doctor.DoctorRepository;
import com.basicsASDF.model.doctor.Doctors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@RequiredArgsConstructor
@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;


    @PostConstruct
    public void initDoctor(){
        repository.saveAll(Stream.of(new Doctors(101, "John", "Cardiac"),
                                  new Doctors(102, "Peter", "ENT"))
                .collect(Collectors.toList()));
    }

    public List<Doctors> getDoctors(){
        return repository.findAll();
    }




}
