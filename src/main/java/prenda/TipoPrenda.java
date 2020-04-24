package main.java.prenda;

import main.java.utiles.CategoriaException;

public class TipoPrenda {

    Categoria categoria;

    String nombrePrenda;

    public TipoPrenda(String nombrePrenda , Categoria categoria){

        this.nombrePrenda = nombrePrenda;

        this.setCategoria(categoria);

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getNombrePrenda(){ return nombrePrenda; }

    public void setCategoria(Categoria categoria) {
        if(categoria.equals(null))
            throw new CategoriaException("Categoria NUll, debe asignar Una Categoria correcta");
        else
            this.categoria = categoria;
    }




}
