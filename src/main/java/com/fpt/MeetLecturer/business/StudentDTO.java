package com.fpt.MeetLecturer.business;

import com.fpt.MeetLecturer.entity.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private int Id;
    private String code;

    private String name;

    private Date dob;

    private String address;

    private String phone;

    private String email;

    private String curriculum;

    private int semester;

    private boolean status;

}
