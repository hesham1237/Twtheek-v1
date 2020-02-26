package com.example.Twtheek.Service;

import com.example.Twtheek.Model.Certificate;
import com.example.Twtheek.Repositry.Repositry_Certificate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ServiceImplementation implements ServiceCertificate{

    private Repositry_Certificate rs;

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
}
