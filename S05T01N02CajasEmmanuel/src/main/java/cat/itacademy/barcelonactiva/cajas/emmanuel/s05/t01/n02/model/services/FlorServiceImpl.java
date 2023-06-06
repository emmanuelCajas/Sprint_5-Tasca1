package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.services;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.repository.FlorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlorServiceImpl implements FlorService{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private FlorRepository florRepository;


    @Override
    public List<FlorDTO> getAllFlor() {
        return florRepository.findAll().stream().map(this::mapearDTO).collect(Collectors.toList());
    }

    @Override
    public void save(FlorDTO florDTO) {
        florRepository.save(modelMapper.map(florDTO, FlorEntity.class));
    }

    @Override
    public void updateFlor(FlorDTO florDTO) {
        FlorEntity florEntity = mapearEntidad(florDTO);
        florRepository.save(florEntity);
    }

    @Override
    public FlorDTO getFlorById(Long id) {
        Optional<FlorEntity> optionalSucursal = florRepository.findById(id);
        FlorDTO florDTO= null;
        if (optionalSucursal.isPresent()) {
            florDTO = mapearDTO(optionalSucursal.get());
        }
        return florDTO;
    }

    @Override
    public void deleteFlor(Long id) {
        florRepository.deleteById(id);
    }

    // Convierte entidad a DTO
    private FlorDTO mapearDTO(FlorEntity florEntity) {
        FlorDTO florDTO = modelMapper.map(florEntity, FlorDTO.class);
        return florDTO;
    }

    // Convierte de DTO a Entidad
    private FlorEntity mapearEntidad(FlorDTO florDTO) {
        FlorEntity florEntity = modelMapper.map(florDTO, FlorEntity.class);
        return florEntity;
    }
}
