package com.nidhi.kyc.KYC.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class IdentityDocs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long aadharNumber;
    private String aadharImageFront;
    private String aadharImageBack;
    private String panNumber;
    private String panImage;
    private Long accountNumber;                 
    private Long IFSC_Code;
    private String bankName;
    private String passbookImage;
    private Long voterIdNo;
    private String voterIdImageFront;
    private String voterIdImageBack;

}
