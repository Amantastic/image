package com.nidhi.kyc.KYC.Dto;

import lombok.Data;

@Data
public class IdentityDocsDto {
    private Long aadharNumber;
    private String aadharImageFront;
    private String aadharImageBack;
    private Long panNumber;
    private String panImage;
    private Long accountNumber;
    private Long ifscCode;
    private String bankName;
    private String passbookImage;
    private Long voterIdNo;
    private String voterIdImageFront;
    private String voterIdImageBack;

}
