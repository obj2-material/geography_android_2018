package ar.edu.unq.cpi.geographydata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class InfoAnios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // inicializacion de la Activity
        super.onCreate(savedInstanceState);
        // relacion con el layout
        setContentView(R.layout.activity_info_anios);

        // obtengo la ListView para poder asignarle un adapter
        ListView listaDeAnios = this.findViewById(R.id.listaAnios);

        // asignacion de un Adapter, en este caso usamos uno que la libreria Android
        // nos da listo para usar
        listaDeAnios.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, this.crearAnios()));
    }

    private List<String> crearAnios() {
        List<String> anios = new ArrayList<>();
        for (int anio = 2000; anio <= 2050; anio++) {
            anios.add(String.valueOf(anio));
        }
        return anios;
    }
}
