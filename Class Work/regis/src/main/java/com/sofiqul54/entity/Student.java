package com.sofiqul54.entity;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Entity
@Table (name = "stu")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotBlank(message = "Enter your valid Email")
    @Column(unique = true)
    private String email;
    @NotBlank(message = "Enter Your Phone No.")
    private String phone;
    @Min(value = 18, message = "Minimum age 18 must")
    private byte age;
    @NotBlank(message = "select your gender")
    private String gender;
    private String[] courseCompleted;
    @NotBlank(message = "select Your Round")
    private String round;
    /*@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-mm-yyyy hh:mm:ss")
    private Date regdate;*/



    public Student() {
    }

    public Student(@NotNull String name, @NotBlank(message = "Enter your valid Email") String email,
                   @NotBlank(message = "Enter Your Phone No.") String phone, @Min(value = 18, message = "Minimum age 18 must") byte age,
                   @NotBlank(message = "select your gender") String gender, @NotBlank(message = "Select your Course") String[] courseCompleted,
                   @NotBlank(message = "select Your Round") String round) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.courseCompleted = courseCompleted;
        this.round = round;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", courseCompleted=" + Arrays.toString(courseCompleted) +
                ", round='" + round + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(gender, student.gender) &&
                Arrays.equals(courseCompleted, student.courseCompleted) &&
                Objects.equals(round, student.round);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, email, phone, age, gender, round);
        result = 31 * result + Arrays.hashCode(courseCompleted);
        return result;
    }

}
