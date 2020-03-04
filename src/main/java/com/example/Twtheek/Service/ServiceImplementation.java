package com.example.Twtheek.Service;

import com.example.Twtheek.DTO.CertificateDTO;
import com.example.Twtheek.DTO.ObjectMapperUtils;
import com.example.Twtheek.DTO.UserDTO;
import com.example.Twtheek.Model.Certificate;
import com.example.Twtheek.Model.User;
import com.example.Twtheek.Repositry.Repositry_Certificate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ServiceImplementation implements ServiceCertificate{
    @Autowired
    private Repositry_Certificate rs;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return rs.save(certificate);
    }

    @Override
    public List<Certificate> getCertificate() {
        return rs.findAll();
    }

    @Override
    public void deleteCertificate(int id) {
        rs.deleteById(id);

    }

    @Override
    public Certificate uploadCertificate(MultipartFile file) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try{
            Certificate certificate = new Certificate(fileName,file.getContentType(),file.getBytes());
            return rs.save(certificate);

        }
        catch (IOException e){
            return null;
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<CertificateDTO> getAllCertificate() {
        List<Certificate> certificates = rs.findAll();
        List<CertificateDTO> certificateDTOS = ObjectMapperUtils.mapAll(certificates, CertificateDTO.class);
        return certificateDTOS;
    }

    @Override
    public CertificateDTO getCertificate(int id) {
        Certificate certificate = rs.findById(id).get();
        CertificateDTO certificateDTO = modelMapper.map(certificate, CertificateDTO.class);
        return certificateDTO;
    }
}
