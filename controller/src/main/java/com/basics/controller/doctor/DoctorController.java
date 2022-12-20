package com.basics.controller.doctor;


import com.basics.model.doctor.Doctors;
import com.basics.service.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping("doctors")
    public List<Doctors> getDoctors(){
        return service.getDoctors();
    }



}
