package com.reminder.app.REST.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDto {

    private String userName;
    private String password;

}

