package ar.edu.unq.cpi.geographydata.view;

import ar.edu.unq.cpi.geographydata.basics.Controller;

public class MenuInicialController extends Controller<MenuInicial> {
    public MenuInicialController(MenuInicial act) { super(act); }

    public void listaAniosUnTexto() { this.saltarAActividad(InfoAnios.class); }
    public void listaAniosDosTextos() { this.saltarAActividad(InfoAniosDosTextos.class); }
    public void imagenMasTextos() { this.saltarAActividad(ImagenMasTextos.class); }
}
