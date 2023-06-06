package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.controllers;

import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.services.SucursalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class SucursalController {

    @Autowired
    SucursalServiceImpl serviceImpl;

    @GetMapping("/")
    public String getAllSucursal(Model modelo){
        List<SucursalDTO> listaSucursal = serviceImpl.getAllSucursal();
        modelo.addAttribute("listaSucursal",listaSucursal);
        return "index";
    }


    @RequestMapping("/nuevo")
    public String mostrarFormularioDeRegistarSucursal(Model modelo){
        Sucursal sucursal = new Sucursal();
        modelo.addAttribute("sucursal",sucursal);
        return "nuevo_sucursal";
    }

    @RequestMapping(value = "/guardar",method = RequestMethod.POST)
    public String guardarProducto(@ModelAttribute("sucursal") SucursalDTO sucursalDTO){
        serviceImpl.save(sucursalDTO);
        return "redirect:/";
    }


    @RequestMapping("/editar/{id}")
    public ModelAndView mostrarFormularioDeEditarSucursal(ModelAndView modelo, @PathVariable(name= "id") Integer id){
        SucursalDTO sucursal = serviceImpl.getSucursalById(id);
        modelo.addObject("sucursal",sucursal);
        modelo.setViewName("editar_sucursal");

        return modelo;
    }

    @RequestMapping("/obtener/{id}")
    public ModelAndView mostrarFormularioDeObtenerPorId(@PathVariable(name= "id") Integer id){
        ModelAndView modelo = new ModelAndView("obtener_sucursal");
        SucursalDTO sucursal = serviceImpl.getSucursalById(id);
        modelo.addObject("sucursal",sucursal);

        return modelo;
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarSucursal(@PathVariable("id") Integer id){
        serviceImpl.deleteSucursal(id);
        return "redirect:/";
    }




}
