package main.java.prenda;

import main.java.utiles.CategoriaException;
import main.java.utiles.ColorException;
import main.java.utiles.MaterialException;
import main.java.utiles.TipoPrendaException;

import java.util.Objects;

public class Prenda {

    TipoPrenda tipoPrenda;

    Categoria categoria;

    Material material;

    Color colorPrimario;

    Color colorSecundario;

    public Prenda( TipoPrenda tipoPrenda, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario){


        this.setTipoPrenda( tipoPrenda, categoria );

        this.setCategoria(categoria);

        this.setMaterial(material);

        this.setColorPrimario( colorPrimario);

        this.colorSecundario = colorSecundario;


    }

    public void setTipoPrenda(TipoPrenda tipoPrenda, Categoria categoria) {
        if(!tipoPrenda.getCategoria().equals(categoria))
            throw new TipoPrendaException( "Las Prendas deben Corresponder Con su Tipo De Prenda. (Ej, una remera no puede ser calzado)");
        else
            this.tipoPrenda = tipoPrenda;
    }

    public void setCategoria(Categoria categoria) {
        if(categoria.equals(null))
            throw new CategoriaException("Categoria NUll, debe asignar Una Categoria correcta");
       else
           this.categoria = categoria;
    }

    public void setMaterial(Material material ) {
        if(material.equals(null) )
            throw new MaterialException("Material NUll, debe asignar Un Material Correcto");
        else
            this.material = material;
    }


    public void setColorPrimario(Color colorPrimario) {
        if(  colorPrimario.equals(null)   )
            throw new ColorException("Color NUll, debe asignar Un Color Primario");
        else
             this.colorPrimario = colorPrimario;
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



