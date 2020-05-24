package atuendo;

import prenda.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Atuendo {

    List<Prenda> prendas = new ArrayList<Prenda>();

    public void agregarPrenda( Prenda prendaNueva){

    	prendas.add( Objects.requireNonNull(prendaNueva, "color es obligatorio") );

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
