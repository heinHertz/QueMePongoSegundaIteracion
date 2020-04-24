package main.java.prenda;

import main.java.utiles.*;

import java.util.Objects;

public class Prenda {

    TipoPrenda tipoPrenda;

    Categoria categoria;

    Material material;

    Color colorPrimario;

    Color colorSecundario;

    Trama trama;


    public Prenda( TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario,Categoria categoria){


        if( !tipoPrenda.getCategoria().equals(categoria)  ||
                categoria.equals(null) ||
                material.equals(null) ||
                colorPrimario.equals(null) )
            throw new PrendaException( "Debe ingresar una Prenda con los datos Correctos)");
        else
        {
            this.tipoPrenda =  tipoPrenda;

            this.categoria = categoria;

            this.material = material;

            this.colorPrimario = colorPrimario;

            this.colorSecundario = colorSecundario;

        }

    }

    public void setColorSecundario(Color colorSecundario) {
        if(   colorSecundario.equals(null)  )
            throw new ColorException("Color Secundario ya Asignado");
        else
            this.colorSecundario = colorSecundario;
    }

    public boolean prendaPerteneceACategoria(Categoria categoria){
        if(this.getCategoria().equals(categoria))
            return true;
        else return false;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public Color getColorPrimario() {
        return this.colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void restablecerEstadoAnterior(Prenda prenda){

        return this;


    }

    public Prenda guardarBorrador(){

        return this;

    }


    // ESTO SIRVE SI AL COMPARAR DOS OBJETOS PRENDA , SON IGUALES SI TIENEN LAS MISMAS ATRIBUTOS CON LOS MISMOS VALORES
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prenda)) return false;
        Prenda prenda = (Prenda) o;
        return  tipoPrenda.equals(prenda.tipoPrenda) &&
                colorPrimario.equals(prenda.colorPrimario) &&
                Objects.equals(colorSecundario, prenda.colorSecundario) &&
                material == prenda.material;
    }





}



