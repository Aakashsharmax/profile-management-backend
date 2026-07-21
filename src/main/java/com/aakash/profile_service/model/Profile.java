package com.aakash.profile_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "profiles")
public class Profile {

    @Id
    private String id;

    private String name;
    private String email;
    private String phone;

    private String profileImage;
}