package com.ms.user.models;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_USERS")
@Data
@Getter
@Setter

public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String name;
    private String email;


}
