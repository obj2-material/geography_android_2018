package ar.edu.unq.cpi.geographydata.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ar.edu.unq.cpi.geographydata.R;
import ar.edu.unq.cpi.geographydata.databinding.ActivityInfoAniosBinding;
import ar.edu.unq.cpi.geographydata.databinding.ActivityInfoAniosDosTextosBinding;

public class InfoAniosDosTextos extends AppCompatActivity {

    InfoAniosDosTextosController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // inicializacion de la Activity y del controller
        super.onCreate(savedInstanceState);
        controller = new InfoAniosDosTextosController(this);

        // configuramos el binding entre controller, activity y el layout
        ActivityInfoAniosDosTextosBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_info_anios_dos_textos);
        binding.setController(this.controller);
    }
}
