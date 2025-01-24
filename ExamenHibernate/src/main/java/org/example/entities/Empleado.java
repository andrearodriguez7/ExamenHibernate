package org.example.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "nombre", nullable = false)
    private int nombre;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "departamento", nullable = false)
    private String departamento;

}

public Empleado(){

}

public Empleado(String id, int nombre, String email, String departamento) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
    this.departamento = departamento;
}

