package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.services;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.dto.FlorDTO;

import java.util.List;

public interface FlorService {

    List<FlorDTO> getAllFlor();
    void save(FlorDTO florDTO);
    void updateFlor(FlorDTO florDTO);
    FlorDTO getFlorById(Long id);
    void deleteFlor(Long id);

}
