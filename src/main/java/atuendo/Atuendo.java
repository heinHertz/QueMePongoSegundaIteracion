package main.java.atuendo;

import main.java.prenda.Categoria;
import main.java.prenda.Color;
import main.java.prenda.Material;
import main.java.prenda.Prenda;
import main.java.utiles.CategoriaException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Atuendo {

    List<Prenda> prendas = new ArrayList<Prenda>();

    public void agregarPrenda( Prenda prendaNueva){

        if(tieneCategoriaValida(prendaNueva))
            prendas.add(prendaNueva);
        else
            throw new CategoriaException("Debe ingresar al Atuendo una prenda Cuya Categoria esté Disponible");


    }

    public List<Prenda> getPrendas() {   return prendas;    }

    public boolean tieneCategoriaValida(Prenda prendaNueva ){

        return !prendas.stream().anyMatch( p -> p.getCategoria().equals(prendaNueva.getCategoria()) );

    }

    public boolean tieneTodasLasCategorias(){

        if( this.cantidadCategorias() == 4 ) return true; else return  false;

    }

    public long cantidadCategorias(){

        return  (long)prendas.stream()
                .filter( p-> p.getCategoria().equals(Categoria.INFERIOR)
                ||  p.getCategoria().equals(Categoria.SUPERIOR)
                ||  p.getCategoria().equals(Categoria.CALZADO)
                 ||  p.getCategoria().equals(Categoria.ACCESORIOS) )
                .count();

    }



}
