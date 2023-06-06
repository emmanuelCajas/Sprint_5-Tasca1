package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.repository.SucursalRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class SucursalServiceImpl implements SucursalService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SucursalRepository repository;

    @Override
    public List<SucursalDTO> getAllSucursal() {
        return repository.findAll().stream().map(this::mapearDTO).collect(Collectors.toList());
    }


    @Override
    public void save(SucursalDTO sucursalDto) {
        repository.save(modelMapper.map(sucursalDto, Sucursal.class));
    }

    @Override
    public void updateSucursal(SucursalDTO sucursalDto) {
        Sucursal sucursal = mapearEntidad(sucursalDto);
         repository.save(sucursal);
    }

    @Override
    public SucursalDTO getSucursalById(Integer id) {
        Optional<Sucursal> optionalSucursal = repository.findById(id);
        SucursalDTO sucursalDTO= null;
        if (optionalSucursal.isPresent()) {
            sucursalDTO = mapearDTO(optionalSucursal.get());
        }
        return sucursalDTO;
    }

    @Override
    public void deleteSucursal(Integer id) {
        repository.deleteById(id);
    }

    // Convierte entidad a DTO
    private SucursalDTO mapearDTO(Sucursal sucursal) {
        SucursalDTO sucursalDTO = modelMapper.map(sucursal, SucursalDTO.class);
        return sucursalDTO;
    }

    // Convierte de DTO a Entidad
    private Sucursal mapearEntidad(SucursalDTO sucursalDTO) {
        Sucursal sucursal = modelMapper.map(sucursalDTO, Sucursal.class);
        return sucursal;
    }

}
