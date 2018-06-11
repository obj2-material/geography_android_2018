package ar.edu.unq.cpi.geographydata;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }

}
