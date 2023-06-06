package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n03.model.services;


import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n03.model.dto.FlowerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FlowerService {


    @Value("${spring.external.service.base-url}")
    private String basePath;

    private final RestTemplate restTemplate;

    public List<FlowerDTO> getFlower(){
        FlowerDTO[] response = restTemplate.getForObject(basePath+"/getAll", FlowerDTO[].class);
        return Arrays.asList(response);
    }

    public void saveFlower(FlowerDTO flowerDTO){
        restTemplate.postForEntity(basePath+"/add", flowerDTO, FlowerDTO.class);
    }

    public void updateFlower(FlowerDTO flowerDTO){
        restTemplate.put(basePath+"/update", flowerDTO);
    }

    public void deleteFlower(Integer id){
        restTemplate.delete(basePath+"/delete/"+id);
    }

    public FlowerDTO getFlowerById(Integer id) {
        FlowerDTO flowerDTO = restTemplate.getForObject(basePath+"/getOne/"+id, FlowerDTO.class);
        return flowerDTO;
    }

}
