package com.example.eCabCardio.service.implementation;


import com.example.eCabCardio.model.dto.PatientDto;
import com.example.eCabCardio.repository.UserRepository;
import com.example.eCabCardio.service.PatientService;
import jakarta.transaction.Transactional;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class PatientServiceImplementation implements PatientService {

    private final UserRepository userRepository;
    @Override
    public List<PatientDto> getAllPatients() {
        return null;
    }
}
