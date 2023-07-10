package Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "orden")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrdenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orden_id;
    private Integer orden_cantidaddeproducto;
    private Date orden_fecha;
    private Integer producto_id;
    private Integer cliente_id;

    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;

    //@ManyToOne
    //@JoinColumn(name = "cliente_id")
    //private ClienteEntity ordenAsignado;
}
