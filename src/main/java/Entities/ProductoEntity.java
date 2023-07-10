package Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producto_id;
    private String producto_nombre;
    private Integer producto_precio;
    private String producto_descripcion;
    private String producto_categoria;
    private Integer producto_cantidad;
}
