package com.example.demo.email.enums;

public enum Turno {
    TURNO_MANANA, TURNO_TARDE, TURNO_VERSPERTINO;

    public Turno[] getTurnos(){
        return Turno.values();
    }
}
