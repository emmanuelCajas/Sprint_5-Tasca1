package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.dto.SucursalDTO;

import java.util.List;

public interface SucursalService {

     List<SucursalDTO> getAllSucursal();
     void save(SucursalDTO sucursalDto);
     void updateSucursal(SucursalDTO sucursalDto);
     SucursalDTO getSucursalById(Integer id);
     void deleteSucursal(Integer id);

}
