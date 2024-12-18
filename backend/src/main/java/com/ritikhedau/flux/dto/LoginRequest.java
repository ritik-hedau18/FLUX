package com.ritikhedau.flux.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
// minor tweak: update verification rules and configs
