package com.sofiqul54.entity;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "student1")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 30, message = "Enter Your Name")
    private String name;

    @NotBlank(message = "Select Your Gender")
    private String gender;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank (message = "Select Your Round")
    private String round;

    @NotBlank(message = "Select Your Course")
    private String Course;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regiDate;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifiedDate=new Date();

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;


    public Student() {
    }

    public Student(@NotNull @Size(min = 2, max = 30, message = "Enter Your Name") String name, @NotBlank(message = "Select Your Gender") String gender, @NotBlank @Email String email, @NotBlank(message = "Select Your Round") String round, @NotBlank(message = "Select Your Course") String course, Date regiDate, Date lastModifiedDate, Date birthDate) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.round = round;
        Course = course;
        this.regiDate = regiDate;
        this.lastModifiedDate = lastModifiedDate;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public Date getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Date regiDate) {
        this.regiDate = regiDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", round='" + round + '\'' +
                ", Course='" + Course + '\'' +
                ", regiDate=" + regiDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(email, student.email) &&
                Objects.equals(round, student.round) &&
                Objects.equals(Course, student.Course) &&
                Objects.equals(regiDate, student.regiDate) &&
                Objects.equals(lastModifiedDate, student.lastModifiedDate) &&
                Objects.equals(birthDate, student.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, email, round, Course, regiDate, lastModifiedDate, birthDate);
    }
}
