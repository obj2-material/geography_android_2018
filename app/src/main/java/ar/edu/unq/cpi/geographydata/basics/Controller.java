package ar.edu.unq.cpi.geographydata.basics;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.support.v7.app.AppCompatActivity;

import ar.edu.unq.cpi.geographydata.view.InfoAnios;

public class Controller<T extends AppCompatActivity> extends BaseObservable {
    private T activity;

    public Controller(T act) { this.activity = act; }

    public T getActivity() { return activity; }

    public void saltarAActividad(Class<? extends AppCompatActivity> newActivityClass) {
        Intent jumpIntent = new Intent(this.getActivity().getBaseContext(), newActivityClass );
        this.getActivity().getBaseContext().startActivity(jumpIntent);
    }
}
