package com.maricel.alumnos;

public class User {
    private Integer id;

    private String name;
    private String carrera;
    private String email;
    private String telefono;
    private String ci;

    public User() {
    }

    public User(Integer id, String name, String carrera, String email, String telefono, String ci) {
        this.id = id;
        this.name = name;
        this.carrera = carrera;
        this.email = email;
        this.telefono = telefono;
        this.ci = ci;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setCi(String name) {
        this.ci = ci;
    }
    public String getCi() {
        return ci;
    }
}


