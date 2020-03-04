package com.example.Twtheek.Service;

import com.example.Twtheek.DTO.CertificateDTO;
import com.example.Twtheek.DTO.UserDTO;
import com.example.Twtheek.Model.Certificate;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ServiceCertificate {
    public Certificate addCertificate(Certificate certificate);
    public List<Certificate> getCertificate();
    public void deleteCertificate (int id);
    public Certificate uploadCertificate (MultipartFile file);
    public List<CertificateDTO> getAllCertificate();
    public CertificateDTO getCertificate(int id);
}
