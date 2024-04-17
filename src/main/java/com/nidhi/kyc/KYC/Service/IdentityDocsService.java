package com.nidhi.kyc.KYC.Service;

import com.nidhi.kyc.KYC.Dto.IdentityDocsDto;
import com.nidhi.kyc.KYC.Repo.IdentityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.DocumentType;

import java.io.IOException;

@Service
public class  IdentityDocsService {

    @Autowired
    private IdentityRepo identityRepo;
//
//    public void uploadDocument(MultipartFile frontImage, MultipartFile backImage, DocumentType documentType) throws IOException {
//        String frontImageFileName = documentType.name() + "_front." + getFileExtension(frontImage.getOriginalFilename());
//        String backImageFileName = documentType.name() + "_back." + getFileExtension(backImage.getOriginalFilename());
//
////        Document document = new Document();
//        IdentityDocsDt ocsdto = new IdentityDocsDto();
//    }

}
