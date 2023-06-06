package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.domain;


import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "sucursal")

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pk_sucursalId;

    @Column(nullable = false, length = 60)
    private String nombreSucursal;

    @Column(nullable = false, length = 60)
    private String paisSucursal;


}
