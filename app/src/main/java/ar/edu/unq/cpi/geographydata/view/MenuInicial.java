package ar.edu.unq.cpi.geographydata.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ar.edu.unq.cpi.geographydata.R;
import ar.edu.unq.cpi.geographydata.databinding.ActivityMenuInicialBinding;

public class MenuInicial extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        // inicializacion de la Activity y del controller
        super.onCreate(savedInstanceState);
        MenuInicialController controller = new MenuInicialController(this);

        ActivityMenuInicialBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_menu_inicial);
        binding.setController(controller);
    }
}