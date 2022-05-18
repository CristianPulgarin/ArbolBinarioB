
package ArbolBinarioDeBusqueda;


public class Nodo {
    
    private int dato;
    Nodo ligaD,ligaI;
    Nodo padre;
    

    public Nodo(int dato){
        this.dato=dato;
        ligaD=null;
        ligaI=null;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    
    
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLigaD() {
        return ligaD;
    }

    public void setLigaD(Nodo ligaD) {
        this.ligaD = ligaD;
    }

    public Nodo getLigaI() {
        return ligaI;
    }

    public void setLigaI(Nodo ligaI) {
        this.ligaI = ligaI;
    }

    public boolean esHoja(){
        return(ligaD==null && ligaI==null);
    }
    
    
}
