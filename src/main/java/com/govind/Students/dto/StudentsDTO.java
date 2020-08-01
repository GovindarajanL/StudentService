package com.govind.Students.dto;

import lombok.Getter;
import lombok.Setter;

public class StudentsDTO {
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String classDetails;
    @Getter
    @Setter
    private String address1;
    @Getter
    @Setter
    private String address2;
    @Getter
    @Setter
    private String state;
    @Getter
    @Setter
    private String city;
    @Getter
    @Setter
    private Long zip5;
    @Getter
    @Setter
    private Long zip4;
    @Getter
    @Setter
    private Long age;
    @Getter
    @Setter
    private String country;
    @Getter
    @Setter
    private String sex;
}
