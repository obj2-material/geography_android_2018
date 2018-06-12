package ar.edu.unq.cpi.geographydata.view;

import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.edu.unq.cpi.geographydata.basics.Controller;
import ar.edu.unq.cpi.geographydata.model.Anio;

public class InfoAniosDosTextosController extends Controller<InfoAniosDosTextos> {
    public InfoAniosDosTextosController(InfoAniosDosTextos act) {
        super(act);
    }

    public SimpleAdapter getListaAniosAdapter() {
        return new SimpleAdapter(
                this.getActivity(),
                this.crearMapaAMostrar(),
                android.R.layout.simple_list_item_2,
                new String[]{"numero", "esBisiesto"},
                new int[]{android.R.id.text1, android.R.id.text2}
        );
    }

    private List<Anio> crearAnios() {
        List<Anio> anios = new ArrayList<>();
        for (int anio = 2000; anio <= 2050; anio++) {
            anios.add(new Anio(anio));
        }
        return anios;
    }

    private List<Map<String,String>> crearMapaAMostrar() {
        List<Anio> anios = this.crearAnios();
        List<Map<String,String>> result = new ArrayList<>();
        for (Anio anio : anios) {
            Map<String,String> infoAnio = new HashMap<>();
            infoAnio.put("numero", "Año " + anio.getNumeroAsString());
            infoAnio.put("esBisiesto", (anio.isBisiesto() ? "es " : "no es ") + "bisiesto");
            result.add(infoAnio);
        }
        return result;
    }

}
