package com.example.Twtheek.DTO;

public class CertificateDTO {
    private String certName;
    private String cerType;
    private String cerDescribtion;

    public CertificateDTO(String certName, String cerType, String cerDescribtion) {
        this.certName = certName;
        this.cerType = cerType;
        this.cerDescribtion = cerDescribtion;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCerType() {
        return cerType;
    }

    public void setCerType(String cerType) {
        this.cerType = cerType;
    }

    public String getCerDescribtion() {
        return cerDescribtion;
    }

    public void setCerDescribtion(String cerDescribtion) {
        this.cerDescribtion = cerDescribtion;
    }
}
