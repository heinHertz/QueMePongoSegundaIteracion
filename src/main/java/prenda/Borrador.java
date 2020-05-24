package prenda;

import java.util.Objects;

import utiles.MaterialException;



public class Borrador {
	
	 TipoPrenda tipoPrenda;

	 //   Categoria categoria;

	    Material material;

	    Color colorPrimario;

	    Color colorSecundario;
	    
	    Trama trama;
	    

	 public Borrador( TipoPrenda tipoPrenda  )
	 {
		 this.tipoPrenda = Objects.requireNonNull(tipoPrenda, "tipoPrenda es obligatorio");
	       
	 }
	    
	
    public Prenda crearPrenda( TipoPrenda tipoPrenda, Material material, Color colorPrimario,Color colorSecundario, Trama trama) {
    	
    	this.tipoPrenda = Objects.requireNonNull(tipoPrenda, "tipo de prenda es obligatorio");
    			  
    	this.colorPrimario = Objects.requireNonNull(colorPrimario, "color es obligatorio");
    	
    	this.colorSecundario = Objects.requireNonNull(colorSecundario, "color es obligatorio");
    	
    	this.trama = Objects.requireNonNull(trama, "trama es obligatorio");
    	
    	
    	this.material = Objects.requireNonNull(material, "material es obligatorio");
    	
        return new Prenda(tipoPrenda, material, colorPrimario, colorSecundario, trama);
    
    }
    


	public void setTipoPrenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}


//	public void setCategoria(Categoria categoria) {
//		this.categoria = categoria;
//	}


	public void especificarMaterial(Material material) {
		this.material = Objects.requireNonNull(material, "material no debe ser nulo");
		this.validarMaterialConsistenteConTipoDePrenda(material);
		this.material = material;
		
		
		  
	}

	public void validarMaterialConsistenteConTipoDePrenda(Material material) {
		
//		if( !(this.tipoPrenda.categoria.equals(Categoria.SUPERIOR) && material.equals(Material.POLIESTER))
//				
//			|| !(this.tipoPrenda.categoria.equals(Categoria.CALZADO) && material.equals(Material.CUERO))
//				
//			|| !(this.tipoPrenda.categoria.equals(Categoria.INFERIOR) && material.equals(Material.LANA))
//					
//			|| !(this.tipoPrenda.categoria.equals(Categoria.ACCESORIOS) && material.equals(Material.PLASTICO))
//
//		) throw new MaterialException("Debe elegir el material correcto ");
//		
		
		
		switch(this.tipoPrenda.categoria) {
		  case SUPERIOR:
			 System.out.println("superior"); //if( !(material.equals(Material.POLIESTER) || material.equals(Material.LANA))
		    break;
		  case INFERIOR:
			  
			  System.out.println("inf"); 
		   
		    break;
		  case CALZADO: 
			  System.out.println("calzaod"); 
			  
			  break;
			  
		  case ACCESORIOS:
			  
			  System.out.println("accese"); 
			  
			  break;
		//  default:  throw new MaterialException("Debe elegir el material correcto ");
		}
		
	}
	

	
	public void especificarColorPrimariol(Color colorPrimario) {
		this.colorPrimario = Objects.requireNonNull(colorPrimario, "colorPrimario es obligatorio");
	 }
	


	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	
    
    
}
