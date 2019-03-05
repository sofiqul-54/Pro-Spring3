package com.sofiqul54.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agency")
public class AgencyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String agnName;
    @Column(nullable = false)
    private String proName;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String mobile;
    private String phone;
    private String fax;
    private String webSite;
    @Column(nullable = false, unique = true)
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date openingDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgnName() {
        return agnName;
    }

    public void setAgnName(String agnName) {
        this.agnName = agnName;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
}
