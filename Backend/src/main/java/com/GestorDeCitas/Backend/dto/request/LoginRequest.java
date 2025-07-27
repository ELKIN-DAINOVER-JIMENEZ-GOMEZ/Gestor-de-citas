package com.GestorDeCitas.Backend.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank
    private String username;// Esto es para indicar que no puede estar en blanco

    @NotBlank
    private String password;

}
