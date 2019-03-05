package com.sofiqul54.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pilgrim")
public class Pilgrim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private long accountNumber;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String fatherName;
    @Column(nullable = false)
    private String motherName;
    @Column(nullable = false)
    private String gender;
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(nullable = false)
    private String nid;
    @Column(nullable = false)
    private String maritalStatus;
    @Column(nullable = false)
    private String spouseName;
    @Column(nullable = false)
    private String occupation;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String district;
    private double bookingAmount;
    private double balanceAmount;


    @ManyToOne
    @JoinColumn(name = "pk_id", nullable = false)
    private Ppackage ppackage;

    @ManyToOne
    @JoinColumn(name = "gl_id", nullable = false)
    private Groupleader groupleader;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Ppackage getPpackage() {
        return ppackage;
    }

    public void setPpackage(Ppackage ppackage) {
        this.ppackage = ppackage;
    }

    public Groupleader getGroupleader() {
        return groupleader;
    }

    public void setGroupleader(Groupleader groupleader) {
        this.groupleader = groupleader;
    }
}
