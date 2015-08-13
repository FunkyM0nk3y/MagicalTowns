package com.example.funkym0nk3y.magicaltowns;

/**
 * Created by FunkyM0nk3y on 8/8/15.
 */
public class MagicalTown {
  private String nombre, estado, foto, fiestas, comida;

  public MagicalTown(String nombre, String estado, String foto, String fiestas, String comida) {
    super();
    this.nombre = nombre;
    this.estado = estado;
    this.foto = foto;
    this.fiestas = fiestas;
    this.comida = comida;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEstado() {
    return estado;
  }

  public void setRaza(String estado) {
    this.estado = estado;
  }

  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public String getFiestas() {
    return fiestas;
  }

  public void setFiestas(String fiestas) {
    this.fiestas = fiestas;
  }

  public String getComida() {
    return comida;
  }

  public void setComida(String comida) {
    this.comida = comida;
  }
}