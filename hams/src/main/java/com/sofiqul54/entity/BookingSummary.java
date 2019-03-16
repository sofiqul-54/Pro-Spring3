package com.sofiqul54.entity;

import javax.persistence.*;

@Entity
public class BookingSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalAmount;

    private double bookingAmount;

    private double dueAmount;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booksummary_pilgrim", nullable = false)
    private Pilgrim pilgrim;//dropdown hobe

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booksummary_package", nullable = false)
    private Ppackage ppackage;//dropdown hobe

}
