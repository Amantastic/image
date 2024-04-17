package com.nidhi.kyc.KYC.Dto;

import com.nidhi.kyc.KYC.Enum.Category;
import com.nidhi.kyc.KYC.Enum.Education;
import com.nidhi.kyc.KYC.Enum.Gender;
import com.nidhi.kyc.KYC.Enum.Religion;
import lombok.Data;

@Data
public class KycDetailsDto {

    private String firstName;
    private String lastName;
    private String fatherName;
    private String fatherLastName;
    private String email;
    private Long phoneNumber;
    private Education education;
    private Gender gender;
    private Religion religion;
    private Category category;
    private String occupation;
    private Long alternatePhoneNumber;
    private String nomineeFirstName;
    private String nomineeLastName;
    private Long nomineePhoneNumber;
    private String relationWithNominee;
    private Integer monthlyIncome;
    private Integer numberOfFamilyMembers;
    private String roleInFamily;
}

