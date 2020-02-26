package com.example.Twtheek.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Organization")
public class Organization {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int organizationId;
    @Column
    private String organizationName;
    @Column
    private String organizationAddress;
    @Column
    private String contactNumber;
    @OneToMany(mappedBy = "userOrganization", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    public Organization() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }



    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}
