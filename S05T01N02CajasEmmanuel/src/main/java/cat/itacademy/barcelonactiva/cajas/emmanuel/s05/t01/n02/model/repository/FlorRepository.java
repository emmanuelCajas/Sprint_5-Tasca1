package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.repository;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.domain.FlorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlorRepository extends JpaRepository<FlorEntity, Long> {

}
