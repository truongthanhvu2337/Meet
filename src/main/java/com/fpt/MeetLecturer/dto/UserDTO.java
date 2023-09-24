package com.fpt.MeetLecturer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private int id;
    private String name;
    private String password;
    private String email;
    private int role;
}
