package com.ms.user.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@Getter
@Setter

public class EmailDto {
    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;
}
