package com.web.maven.example.demo.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class PersonDto {

private Long id;
@NotBlank
private String name;

@Min(1)
@Max(10)
private int age;
@Pattern(regexp = "^((25[0-5]|(2[0-4]|[0-9]|[1-9]|)(\\.(?!$)|$)){4}$)")
private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
