package com.example.mongoexam;

public class Jugador {
 private  int idJugador;
 private String nombre;
 private  String apellidoP;
 private  String apellidoM;
 private  int numeroJ;
 private   String posicion;
 private String equipo;

    public Jugador() {
    }

    public Jugador(int idJugador, String nombre, String apellidoP, String apellidoM, int numeroJ, String posicion, String equipo) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.numeroJ = numeroJ;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getNumeroJ() {
        return numeroJ;
    }

    public void setNumeroJ(int numeroJ) {
        this.numeroJ = numeroJ;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", nombre='" + nombre + '\'' +
                ", apellidoP='" + apellidoP + '\'' +
                ", apellidoM='" + apellidoM + '\'' +
                ", numeroJ=" + numeroJ +
                ", posicion='" + posicion + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
