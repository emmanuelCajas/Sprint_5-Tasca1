package cat.itacademy.barcelonactiva.cajas.emmanuel.s05.t01.n02.model.dto;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FlorDTO {

    public static List<String> paises = new ArrayList<>(Arrays.asList("Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden"));

    private long pk_FlorID;

    private String nomFlor;

    private String paisFlor;

    private String tipoFlor;

    public FlorDTO() {
    }

    public FlorDTO(String nomFlor, String paisFlor) {
        this.nomFlor = nomFlor;
        this.paisFlor = paisFlor;
        setTipoFlor();

    }

    public static List<String> getPaises() {
        return paises;
    }

    public static void setPaises(List<String> paises) {
        FlorDTO.paises = paises;
    }

    public long getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(long pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
    }

    public String getNomFlor() {
        return nomFlor;
    }

    public void setNomFlor(String nomFlor) {
        this.nomFlor = nomFlor;
    }

    public String getPaisFlor() {
        return paisFlor;
    }

    public void setPaisFlor(String paisFlor) {
        this.paisFlor = paisFlor;
        setTipoFlor();
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor() {
        if (paises.contains(getPaisFlor())){
            this.tipoFlor="UE";
        }else {
            this.tipoFlor="NO UE";
        }
    }
}
