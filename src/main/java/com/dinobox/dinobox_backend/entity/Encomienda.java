package com.dinobox.dinobox_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "encomiendas")
public class Encomienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "remitente")
    private String remitente;

    @Column(name = "destinatario")
    private String destinatario;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "codigo_seguimiento", unique = true)
    private String codigoSeguimiento;

    @Column(name = "estado")
    private String estado;

    // Constructor vacío
    public Encomienda() {}

    // Constructor 
    public Encomienda(String remitente, String destinatario, String direccion, String codigoSeguimiento, String estado) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.codigoSeguimiento = codigoSeguimiento;
        this.estado = estado;
    }

    // Getters y Setters 
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRemitente() { return remitente; }
    public void setRemitente(String remitente) { this.remitente = remitente; }

    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCodigoSeguimiento() { return codigoSeguimiento; }
    public void setCodigoSeguimiento(String codigoSeguimiento) { this.codigoSeguimiento = codigoSeguimiento; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
