package com.mai.projects.plm.security.jwt.model;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}