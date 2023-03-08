package com.eCommerce.springeCommerce.Model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Producto {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private Double precio;
    private int cantidad;

}
