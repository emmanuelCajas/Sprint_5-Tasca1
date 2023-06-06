package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n01.model.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class SucursalDTO {

    public static List<String> paises = new ArrayList<>(Arrays.asList("Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden"));

    private Integer pk_sucursalId;
    private String nombreSucursal;
    private String paisSucursal;
    private String tipoSucursal;



    public SucursalDTO() {
    }

    public SucursalDTO(String nombreSucursal, String paisSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.paisSucursal = paisSucursal;
        setTipoSucursal();
    }

    public Integer getPk_sucursalId() {
        return pk_sucursalId;
    }

    public void setPk_sucursalId(Integer pk_sucursalId) {
        this.pk_sucursalId = pk_sucursalId;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getPaisSucursal() {
        return paisSucursal;
    }

    public void setPaisSucursal(String paisSucursal) {
        this.paisSucursal = paisSucursal;
        setTipoSucursal();
    }

    public String getTipoSucursal() {
        return tipoSucursal;
    }

    public void setTipoSucursal() {
        if (paises.contains(getPaisSucursal())){
            this.tipoSucursal="UE";
        }else {
            this.tipoSucursal="NO UE";
        }
    }

}
