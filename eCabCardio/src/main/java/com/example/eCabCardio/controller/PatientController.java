package com.example.eCabCardio.controller;

import com.example.eCabCardio.model.dto.PatientDto;
import com.example.eCabCardio.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @GetMapping("/all")
    public ResponseEntity<List<PatientDto>> getAllPatients(){
        return new ResponseEntity<>(patientService.getAllPatients(), HttpStatus.OK);
    }
}
