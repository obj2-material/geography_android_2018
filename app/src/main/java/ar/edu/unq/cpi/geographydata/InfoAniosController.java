package ar.edu.unq.cpi.geographydata;

import android.databinding.BaseObservable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class InfoAniosController extends BaseObservable {
    private AppCompatActivity activity;

    public InfoAniosController(AppCompatActivity theActivity) {
        super();
        this.activity = theActivity;
    }

    public ArrayAdapter<String> getListaAniosAdapter() {
        return new ArrayAdapter<String>(this.activity, android.R.layout.simple_list_item_1, this.crearAnios());
    }

    private List<String> crearAnios() {
        List<String> anios = new ArrayList<>();
        for (int anio = 2000; anio <= 2050; anio++) {
            anios.add(String.valueOf(anio));
        }
        return anios;
    }

}
