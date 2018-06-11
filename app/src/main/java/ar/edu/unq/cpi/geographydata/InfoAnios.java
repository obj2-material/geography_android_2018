package ar.edu.unq.cpi.geographydata;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.cpi.geographydata.databinding.ActivityInfoAniosBinding;

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
        // y aqui vamos. Usamos una clase anónima, análogo a lo que hacemos con Wicket.
        listaAnios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView listaAnios, View viewFilaClickeada, int position, long id) {
                CharSequence anio = ((TextView)viewFilaClickeada).getText();
                String mensaje = "Se eligió " + anio;
                Toast toast = Toast.makeText(InfoAnios.this, mensaje, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }

}
