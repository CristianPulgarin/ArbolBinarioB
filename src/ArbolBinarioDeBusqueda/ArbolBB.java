
package ArbolBinarioDeBusqueda;

import static java.nio.file.Files.size;
import javax.swing.JOptionPane;


public class ArbolBB {
    
    Nodo raiz;
    int altura;
    
    public ArbolBB(){
        raiz=null;
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public String RecInOrden(Nodo R,String salida){
        if(R!=null){
            salida=RecInOrden(R.getLigaI(),salida);
            salida=salida+R.getDato()+" ";
            salida=RecInOrden(R.getLigaD(),salida);
                   
        }
    return salida;
    }
    
    public String RecPreOrden(Nodo R,String salida){
        if(R!=null){
            salida+=R.getDato()+" ";
            salida=RecPreOrden(R.getLigaI(),salida);
            salida=RecPreOrden(R.getLigaD(),salida);
                   
        }
    return salida;
    }
    
     public String RecPostOrden(Nodo R,String salida){
        if(R!=null){
           
            salida=RecPostOrden(R.getLigaI(),salida);
            salida=RecPostOrden(R.getLigaD(),salida);
            salida+=R.getDato()+" ";        
        }
    return salida;
    }
     
     
     
    
     
     public void InsertarABB(int dato){
         Nodo p=raiz,ant=null,x;
         boolean sw=false;
         
         while(p!=null && sw==false){
             ant=p;
             if(dato>p.getDato()){
                 p=p.getLigaD();
             }
             else{
                 if(dato<p.getDato()){
                     p=p.getLigaI();
                 }
                 else{
                     sw=true;
                 }
             }
         }
         if(sw==true){
             JOptionPane.showMessageDialog(null,"El dato ya existe");
         }
         else{
             x=new Nodo(dato);
             if(raiz==null){
                 raiz=x;
             }
             else{
                 if(dato<ant.getDato()){
                     ant.setLigaI(x);
                 }
                 else{
                     ant.setLigaD(x);
                 }
             }
         }
     }
     
     
     public void MostrarHijosDato(Nodo R,int dato){
         if(R!=null){
             if(R.getDato()==dato){
                 if(R.getLigaI()!=null && R.getLigaD()!=null){
                     JOptionPane.showMessageDialog(null,"Hijo izquierdo "+R.getLigaI().getDato()+ " Hijo derecho "+R.getLigaD().getDato());
                 }
                 if(R.getLigaI()!=null && R.getLigaD()==null){
                     JOptionPane.showMessageDialog(null,"Hijo izquierdo "+R.getLigaI().getDato()+ " No tiene hijo derecho ");
                 }
                 if(R.getLigaI()==null && R.getLigaD()!=null){
                     JOptionPane.showMessageDialog(null,"No tiene hijo izquierdo "+ " Hijo derecho "+R.getLigaD().getDato());
                 }
                 if(R.getLigaI()==null && R.getLigaD()==null){
                     JOptionPane.showMessageDialog(null,"No tiene hijos");
                 }
             }
             MostrarHijosDato(R.getLigaI(),dato);
             MostrarHijosDato(R.getLigaD(),dato);
         }
     }
     
     
     
     
    ////
     public void PadreDelDato(Nodo R, int dato){
         Nodo p=R, ant=null;
         
         while(p.getDato()!=dato){
             ant=p;
             if(dato>p.getDato()){
                 p=p.getLigaD();
             }
             else{
                 if(dato<p.getDato()){
                     p=p.getLigaI();
             }
         }
     }
         if(R.getDato()==dato){
             JOptionPane.showMessageDialog(null, "LA RAIZ NO TIENE UN PADRE");
         }
         else{
             JOptionPane.showMessageDialog(null, "El padre del "+ dato + " es "+ ant.getDato());
        }
    }
    
     
    
     
     
     public void HermanoDato(Nodo R, int dato)
    {
        Nodo p = R,ant=null;
        
        if(R.getDato()==dato)
        {
        JOptionPane.showMessageDialog(null,"LA RAIZ NO TIENE NINGUN HERMANO");    
        }
        else
        {
        while(p.getDato()!=dato)
        {
            ant=p;
            
            if(dato>p.getDato())
            {
                p=p.getLigaD();
            }
            else
            {
                if(dato<p.getDato())
                { 
                    p=p.getLigaI();
                }
            }
        }
        
        if(p.getDato()!=dato)
        {
        JOptionPane.showMessageDialog(null,"EL NUMERO NO ES VALIDO");      
        }
        else
        {
        if(p.getDato()==dato)
        {
          if(ant.getLigaI()==p)
          {
          JOptionPane.showMessageDialog(null,"El hermano de "+ dato +" es el "+ ant.getLigaD().getDato() );     
          }
          else
          {
              if(ant.getLigaI()==null)
              {
              JOptionPane.showMessageDialog(null,"El dato "+ dato +" no tiene hermanos al lado izquierdo"); 
              }
              else
              {
               if(ant.getLigaD()==p)
                  {
                  JOptionPane.showMessageDialog(null,"El hermano de "+ dato +" es el "+ ant.getLigaI().getDato() );     
                  }
                  else
                  {
                      if(ant.getLigaD()==null)
                      {
                      JOptionPane.showMessageDialog(null,"El "+ dato +" no tiene hermanos al lado derecho"); 
                      }
                  }    
             }
           }
         }
       }
     }
   }  
     
    public int Altura(Nodo R, int dato)
    {
    int Altura=0;

    if(R==null)
    {
       
    }
    else
    {
        if(dato==R.getDato())
        {
           Altura=Altura+1;  
        }
        else
        {
            if(dato<R.getDato())
            {
                Altura=Altura(R.getLigaI(), dato)+1;
            }
            else
            {
                if(dato>R.getDato())
                {
                    Altura= Altura(R.getLigaD(), dato)+1;
                }
            }
        } 
      }    
    return Altura;
    }
     


    
     
      public int NivelDelDato(Nodo R, int dato)
    {
    int NivelDelDato=0;

    if(R==null)
    {
       
    }
    else
    {
        if(dato==R.getDato())
        {
           NivelDelDato=NivelDelDato+0;  
        }
        else
        {
            if(dato<R.getDato())
            {
                NivelDelDato=NivelDelDato(R.getLigaI(), dato)+1;
            }
            else
            {
                if(dato>R.getDato())
                {
                    NivelDelDato=NivelDelDato(R.getLigaD(), dato)+1;
                }
            }
        } 
      }    
    return NivelDelDato;
    }
     
    
      
      
      
     
      ////
      
       public String NivelDelosDatos(Nodo R, int nivel,String salida)
    {
        if(R!=null)
        {
            if(nivel==nivel)
            {
                salida=salida+R.getDato()+" | ";   
                salida=NivelDelosDatos(R.getLigaI(), (nivel-1), salida);
                salida=NivelDelosDatos(R.getLigaD(), (nivel-1), salida);
            }
        }
        return salida;
    }
      
      
      ////
      
      
      
     
     public void MostrarPadreDeUnDato(int dato){
     Nodo p=raiz, ant=null;
        boolean sw=false;
        
        if(raiz==null){
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }
        else{
            while(p!=null && sw==false){
                if(p.getDato()==dato){
                    ant=p;
                    System.out.println(ant);
                }
                
               
            }
    
    
     }
     }



public boolean BuscarDato(int dato){
         
         Nodo auxiliar=raiz;
         
         while(dato!=auxiliar.getDato()){
             if(dato<auxiliar.getDato()){
                 auxiliar=auxiliar.getLigaI();
             }
             else{
                 auxiliar=auxiliar.getLigaD();
             }
             if(auxiliar==null){
                 return false;
             }
         }
         return true;
     }
     
     
  
    public boolean eliminar(int dato) {
		if (raiz == null) {
			return false;
		}

                
                Nodo p = raiz;
		Nodo padre = raiz;
                
		
		boolean izquerda = true;

		while (p.getDato() != dato) {
			padre = p;
			if (dato < p.getDato()) {
				izquerda = true;
				p = p.getLigaI();
			}
			else {
				izquerda = false;
				p = p.getLigaD();
			}
			if (p == null) {
				return false;
			}
		}

		if (p.getLigaI() == null && p.getLigaD() == null) {
			if (p == raiz) {
				raiz = null;
			}
			else if (izquerda) {
				padre.setLigaI(null);
			}
			else {
				padre.setLigaD(null);
			}
		}
		else if(p.getLigaD() == null) {
			if (p == raiz) {
				raiz = p.getLigaI();
				raiz.setPadre(null);
			}
			else if (izquerda) {
				padre.setLigaI(p.getLigaI());
				p.setPadre(padre);
			}
			else {
				padre.setLigaD(p.getLigaI());
				p.setPadre(padre);
			}
		}
		else if(p.getLigaI() == null) {
			if (p == raiz) {
				raiz = p.getLigaD();
				raiz.setPadre(null);
			}
			else if (izquerda) {
				padre.setLigaI(p.getLigaD());
				p.setPadre(padre);
			}
			else {
				padre.setLigaD(p.getLigaD());
				p.setPadre(padre);
			}
		}
		else {
			Nodo successorParent = p;
			Nodo successor = p;
			Nodo current = p.getLigaD();
			while (current != null) {
				successorParent = successor;
				successor = current;
				current = current.getLigaI();
			}
			if (successor != p.getLigaD()) {
				successorParent.setLigaI(successor.getLigaD());
				successor.setLigaD(p.getLigaD());
				p.setPadre(successor);
			}

			if (p == raiz) {
				raiz = successor;
				raiz.setPadre(null);
			}
			else if (izquerda) {
				padre.setLigaI(successor);
				successor.setPadre(padre);
			}
			else {
				padre.setLigaD(successor);
				successor.setPadre(padre);
			}

			successor.setLigaI(p.getLigaI());
			p.setPadre(successor);
		}
		

		return true;
	}
     
     
}
     

