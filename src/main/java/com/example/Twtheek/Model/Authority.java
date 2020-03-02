package com.example.Twtheek.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Authority")
public class Authority {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorityId;
    @Column(name = "username")
    private String username;
    @Id
    @Column(name = "authority")
    private String authority;
//    @OneToMany(mappedBy = "authority", cascade = CascadeType.ALL)
//    private List<User> auth = new ArrayList<>();

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
//    public List<User> getAuth() {
//        return auth;
//    }
//
//    public void setAuth(List<User> auth) {
//        this.auth = auth;
//    }
//}
