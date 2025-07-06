package com.devtkms.awsec2rdsspringbootdemo;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @Override
    public String toString() {
        return "UserEntity{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}