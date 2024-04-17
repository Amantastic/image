package com.nidhi.kyc.KYC.Entity;

import com.nidhi.kyc.KYC.Enum.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
@Entity
@Data
@Validated
public class KycDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Kyc_id;
    private String first_name;
    private String last_name;
    private String Father_name;
    private String father_last_name;
    @Email(message = "Invalid email address")
    private String email;
    private Long Phn_no;
    private Education eduction;
    private Gender gender;
    private Religion religion;
    private Category category;
    private String occupation;
    private Long alternate_phn_no;
    private String nominee_First_Name;
    private String Nominee_last_name;
    private Long nominee_Phn_no;
    private String relation_with_nominee;
    private Integer monthly_Income;
    private Integer no_of_family_member;
   private String who_are_you_in_the_family;




}


