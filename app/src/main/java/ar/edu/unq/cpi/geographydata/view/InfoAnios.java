package ar.edu.unq.cpi.geographydata.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import ar.edu.unq.cpi.geographydata.R;
import ar.edu.unq.cpi.geographydata.databinding.ActivityInfoAniosBinding;
import ar.edu.unq.cpi.geographydata.model.Anio;

public class InfoAnios extends AppCompatActivity {

    InfoAniosController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // inicializacion de la Activity y del controller
        super.onCreate(savedInstanceState);
        controller = new InfoAniosController(this);

        // configuramos el binding entre controller, activity y el layout
        ActivityInfoAniosBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_info_anios);
        binding.setController(this.controller);

        // agregamos un listener para cuando se hace click sobre una fila en el list view
        // para esto me tenqo que conseguir una referencia al listView
        ListView listaAnios = this.findViewById(R.id.listaAnios);
        // y aqui vamos. ¡Se puede usar una función!!,
        // análogo a lo en Wicket hacemos con una clase anónima.
        listaAnios.setOnItemClickListener((listView, viewFilaClickeada, position, id) -> {
            Anio anio = controller.getAnio(position);
            String mensaje = "El año " + anio.getNumeroAsString()
                    + (anio.isBisiesto() ? " es " : " no es ")
                    + "bisiesto ";
            Toast toast = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT);
            toast.show();
        });

    }

}
