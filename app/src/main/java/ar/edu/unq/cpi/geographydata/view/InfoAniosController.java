package ar.edu.unq.cpi.geographydata.view;

import android.databinding.BaseObservable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.cpi.geographydata.model.Anio;

public class InfoAniosController extends BaseObservable {
    private AppCompatActivity activity;
    private List<Anio> anios;

    public InfoAniosController(AppCompatActivity theActivity) {
        super();
        this.activity = theActivity;
        this.anios = this.crearAnios();
    }

    public ArrayAdapter<Anio> getListaAniosAdapter() {
        return new ArrayAdapter<Anio>(this.activity, android.R.layout.simple_list_item_1, this.crearAnios());
    }

    private List<Anio> crearAnios() {
        List<Anio> anios = new ArrayList<>();
        for (int anio = 2000; anio <= 2050; anio++) {
            anios.add(new Anio(anio));
        }
        return anios;
    }

    public Anio getAnio(int position) { return this.anios.get(position); }
}
