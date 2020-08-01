package com.govind.Students.entities;

import org.springframework.data.domain.Persistable;

import javax.persistence.*;

@Entity
@Table(name="Students")
public class StudentsEntity implements Persistable<Integer> {

    @Id
    @Column(name="id",nullable=false,precision=0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic
    @Column(name="first_name",nullable = false,length = 250)
    private String firstName;

    @Basic
    @Column(name="last_name",nullable = false,length = 250)
    private String lastName;

    @Basic
    @Column(name="class",nullable = false,length = 250)
    private String classDetails;

    @Basic
    @Column(name="address1",nullable = false,length = 250)
    private String address1;

    @Basic
    @Column(name="address2",nullable = true,length = 250)
    private String address2;

    @Basic
    @Column(name="state",nullable = false,length = 50)
    private String state;

    @Basic
    @Column(name="city",nullable = false,length = 50)
    private String city;

    @Basic
    @Column(name="zip5",nullable = false)
    private Long zip5;

    @Basic
    @Column(name="zip4",nullable = true)
    private Long zip4;

    @Basic
    @Column(name="age",nullable = false)
    private Long age;

    @Basic
    @Column(name="country",nullable = false,length = 50)
    private String country;

    @Basic
    @Column(name="sex",nullable = false,length = 1)
    private String sex;


    @Override
    public boolean isNew() {
        return false;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassDetails() {
        return classDetails;
    }

    public void setClassDetails(String classDetails) {
        this.classDetails = classDetails;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getZip5() {
        return zip5;
    }

    public void setZip5(Long zip5) {
        this.zip5 = zip5;
    }

    public Long getZip4() {
        return zip4;
    }

    public void setZip4(Long zip4) {
        this.zip4 = zip4;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
