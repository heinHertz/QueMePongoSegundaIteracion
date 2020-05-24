package prenda;

import java.util.Objects;

//import utiles.CategoriaException;

public class TipoPrenda {

	
	// REMERA, PANTALON, POLLERA, CAMISA_MANGA_CORTA, BLUSA ;
	
	
    Categoria categoria;


    public TipoPrenda( Categoria categoria){

    	this.setCategoria(categoria);
   
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
     
        this.categoria = Objects.requireNonNull(categoria, "no debe Ingresar Categoria Nula");
    }





}
