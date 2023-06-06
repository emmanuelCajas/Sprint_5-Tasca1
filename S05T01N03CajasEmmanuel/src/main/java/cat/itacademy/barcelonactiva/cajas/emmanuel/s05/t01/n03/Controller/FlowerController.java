package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n03.Controller;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n03.model.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n03.model.services.FlowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/flower")
@RequiredArgsConstructor
public class FlowerController {

    private final FlowerService flowerService;

    @GetMapping({"/getAll"})
    public ResponseEntity<List<FlowerDTO>> getAll(){
        return new ResponseEntity<>(flowerService.getFlower(), HttpStatus.OK);
    }

    @GetMapping({"/getOne/{id}"})
    public ResponseEntity<FlowerDTO> getOne(@PathVariable("id") Integer id){
        FlowerDTO flowerDto = this.flowerService.getFlowerById(id);
        return flowerDto != null ? new ResponseEntity(flowerDto, HttpStatus.OK) : new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PostMapping({"/add"})
    @ResponseStatus(HttpStatus.CREATED)
    public void saveFlower(@RequestBody FlowerDTO flowerDTO){
        flowerService.saveFlower(flowerDTO);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFlower(@RequestBody FlowerDTO flowerDTO){
        flowerService.updateFlower(flowerDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlower(@PathVariable("id") Integer id) {
        flowerService.deleteFlower(id);
    }

}
