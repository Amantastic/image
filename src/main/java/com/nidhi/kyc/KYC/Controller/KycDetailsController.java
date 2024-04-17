package com.nidhi.kyc.KYC.Controller;

import com.nidhi.kyc.KYC.Dto.KycDetailsDto;
import com.nidhi.kyc.KYC.Service.KycDetailsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:8081/")
public class KycDetailsController {

    @Autowired  
    private KycDetailsServiceImp kycDetailsServiceImp;

    @PostMapping("/kycdetails")
    public ResponseEntity<KycDetailsDto> saveKycDetails(@RequestBody KycDetailsDto kycDetailsDTO) {
        KycDetailsDto savedKycDetailsDTO = kycDetailsServiceImp.saveKycDetails(kycDetailsDTO);
        return new ResponseEntity<>(savedKycDetailsDTO, HttpStatus.CREATED);
    }
}
