package com.example.Twtheek.Model;


import ch.qos.logback.core.status.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "certificate")
public class Certificate {

    @Id
    private int certificateId;
    @Column(name = "certificateName")
    private String certificateName;
    @Column
    private String type;
    @Column
    private String describtion;
    @Column
    private Date date;
    @Column
    private String status;
    @Column
    private String document;
    @Column(name = "CertificateDoc")
    @Lob
    private byte[] certificateDoc;

    public Certificate(String certificateName,String type,byte[] certificateDoc){
        this.certificateName=certificateName;
        this.type=type;
        this.certificateDoc=certificateDoc;

    }

    public byte[] getCertificateDoc() {
        return certificateDoc;
    }

    public void setCertificateDoc(byte[] certificateDoc) {
        this.certificateDoc = certificateDoc;
    }



    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String isType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }


}
