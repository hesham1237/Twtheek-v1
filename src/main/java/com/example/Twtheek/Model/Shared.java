package com.example.Twtheek.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Shared")
public class Shared {
    @Id
    private int shareId;
    @Column
    private Date shardDate;
    @Column
    private String URL;

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public Date getShardDate() {
        return shardDate;
    }

    public void setShardDate(Date shardDate) {
        this.shardDate = shardDate;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
