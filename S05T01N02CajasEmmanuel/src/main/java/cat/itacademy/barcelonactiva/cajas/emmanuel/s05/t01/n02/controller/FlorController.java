package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.controller;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.services.FlorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/flower"})
public class FlorController {

    @Autowired
    FlorServiceImpl florServiceImpl;

    @GetMapping({"/getAll"})
    public ResponseEntity<List<FlorDTO>> getAllFlowers() {
        List<FlorDTO> florDTO = this.florServiceImpl.getAllFlor();
        return !florDTO.isEmpty() ? new ResponseEntity(florDTO, HttpStatus.OK) : new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PutMapping({"/update"})

    public ResponseEntity<String> updateFlower(@RequestBody FlorDTO florDTO) {
        try {
            this.florServiceImpl.updateFlor(florDTO);
            return ResponseEntity.ok("Flower updated successfully.");
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update flower: " + var3.getMessage());
        }
    }

    @PostMapping({"/add"})
    public ResponseEntity<String> saveFlower(@RequestBody FlorDTO florDTO) {
        try {
            this.florServiceImpl.save(florDTO);
            return ResponseEntity.ok("Flower saved successfully.");
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save flower.");
        }
    }

    @GetMapping({"/getOne/{id}"})
    public ResponseEntity<FlorDTO> getFlowerById(@PathVariable Long id) {
        FlorDTO flowerDto = this.florServiceImpl.getFlorById(id);
        return flowerDto != null ? new ResponseEntity(flowerDto, HttpStatus.OK) : new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping({"/delete/{id}"})
    public ResponseEntity<String> deleteFlower(@PathVariable Long id) {
        try {
            this.florServiceImpl.deleteFlor(id);
            return ResponseEntity.ok("Flower deleted successfully.");
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete flower: " + var3.getMessage());
        }
    }
}
