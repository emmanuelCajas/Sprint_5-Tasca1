package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "flores")
@Data
public class FlorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pk_FlorID;

    @Column(nullable = false, length = 60)
    private String nomFlor;

    @Column(nullable = false, length = 60)
    private String paisFlor;


}
