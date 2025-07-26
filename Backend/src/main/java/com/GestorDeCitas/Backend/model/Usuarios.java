package com.GestorDeCitas.Backend.model;


import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;





@Entity
@Data
@NoArgsConstructor
@ToString

@Table(name = "usuarios",
        uniqueConstraints = {
                // Puedes agregar restricciones únicas aquí si es necesario
                @UniqueConstraint(columnNames = {"username"}),//Esto es para evitar que se repita el nombre de usuario
                @UniqueConstraint(columnNames = {"email"})//Esto es para evitar que se repita el email
        })
public class Usuarios {
     @Id// Esto es para indicar que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank// Esto es para indicar que no puede estar en blanco
   @Size(min = 1, max = 20)// Esto es para indicar el tamaño mínimo y máximo
    private String username;

    @NotBlank
    @Size(min = 1, max = 50)
    @Email// Esto es para indicar que debe ser un email válido
    private String email;

    private String password;



   
    public Usuarios (String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
}
}
