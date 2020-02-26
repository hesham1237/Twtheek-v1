package com.example.Twtheek.Controllar;

import com.example.Twtheek.Model.Certificate;
import com.example.Twtheek.Service.ServiceCertificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("Certificate")
public class CertificateControllar {

    @Autowired
    private ServiceCertificate serviceCertificate;

    @PostMapping(value = "addCertificate")
    public Certificate addCertificate(@RequestBody Certificate certificate){
        return serviceCertificate.addCertificate(certificate);
    }
    @PostMapping(value = "uploadCertificate")
    public Certificate uploadCertificate(@RequestParam("file")MultipartFile file){
        Certificate certificate =serviceCertificate.uploadCertificate(file);
        return certificate;
    }
    @GetMapping(value = "getCertificate")
    public List<Certificate> getCertificate(){
        return serviceCertificate.getCertificate();
    }

    @DeleteMapping(value = "{certificateId}")
    public String deleteCertificate(@PathVariable("certificateId") int id){
        serviceCertificate.deleteCertificate(id);
        return "Is Deleted successfully!!";

    }
}
