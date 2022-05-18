package ArbolBinarioDeBusqueda;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main(String[] args) {
        
        
       
         ArbolBB A=new ArbolBB();
        String salida;
        
         
         
        String menu="-----------------MENU--------------\n"+
                "1.Mostrar en InOrden\n"+
                "2. Mostrar en Preorden\n"+
                "3. Mostrar en PostOrden\n"+
                "4. Insertar\n"+
                "5. Mostrar hijos de un dato\n"+
                "6. Eliminar dato\n"+
                "7. Mostrar Altura de un dato\n"+
                "8. Mostrar nivel de un dato dado\n"+
                "9. Mostrar datos que hay en un nivel\n"+
                "10. Hermano de un dato\n"+
                "11. Mostrar padres de un dato\n"+
                "12. Salir\n"+
                
                "Digite la opcion que desee"
                ;
        
       
        
        int dato,opcion=0;
        
       
            
        
        do{
             try {
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
       
            switch(opcion){
                case 1:
                if(A.getRaiz()==null){
                    JOptionPane.showMessageDialog(null,"Arbol vacio");
                }
                else{
                    salida="";
                    A.RecInOrden(A.getRaiz(), salida);
                    JOptionPane.showMessageDialog(null, "Recorrido en Inorden\n"+
                            A.RecInOrden(A.getRaiz(),salida));
                }
                break;
                
                case 2:
                    if(A.getRaiz()==null){
                    JOptionPane.showMessageDialog(null,"Arbol vacio");
                }else{
                        salida="";
                    A.RecPreOrden(A.getRaiz(),salida);
                    JOptionPane.showMessageDialog(null, "Recorrido en PreOrden\n"+
                            A.RecPreOrden(A.getRaiz(),salida));
                    }
                    break;
                case 3:
                   if(A.getRaiz()==null){
                    JOptionPane.showMessageDialog(null,"Arbol vacio");
                }else{
                        salida="";
                    A.RecPostOrden(A.getRaiz(),salida);
                    JOptionPane.showMessageDialog(null, "Recorrido en PostOrden\n"+
                            A.RecPostOrden(A.getRaiz(),salida));
                    }
                    break;
                case 4:
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a insertar"));
                    A.InsertarABB(dato);
                break;
                case 5:
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato"));
                    if(A.getRaiz()==null){
                       JOptionPane.showMessageDialog(null, "Arbol vacio");
                    }
                    else{
                        A.MostrarHijosDato(A.getRaiz(), dato);
                    }
                break;
                
                
                case 6:
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato"));
                    
                    if(A.BuscarDato(dato)==true){
                    A.eliminar(dato);
                            JOptionPane.showMessageDialog(null,"Se elimino un dato");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El dato no existe en el arbol");
                    }
                            break;
                
                case 7:
                    
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato "));
                    
                    if(A.BuscarDato(dato)==true){
                    
                   if(A.Altura(A.getRaiz(), dato)==0)
                {
                JOptionPane.showMessageDialog(null,"El árbol esta vacío");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "La altura del arbol es: "+ A.Altura(A.getRaiz(), dato) );
                
                }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El dato no existe en el arbol");
                    }
                
                break;
                
                
                case 8:
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a insertar"));
                
                    if(A.BuscarDato(dato)==true){
                        
                    
                if(A.getRaiz()==null)
                {
                JOptionPane.showMessageDialog(null,"El árbol esta vacío");
                }
                else
                {
                JOptionPane.showMessageDialog(null,"El nivel del árbol es: " + A.NivelDelDato(A.getRaiz(), dato));
                }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El dato no existe en el arbol");
                    }
                break;
                    
                case 9:
                    
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel"));
                    
                    if(A.BuscarDato(dato)==true){
                if(A.getRaiz()==null) 
                {            
                    JOptionPane.showMessageDialog(null,"EL ARBOL SE ENCUENTRA VACIO");
                }
                else
                {
                    salida="";
                    JOptionPane.showMessageDialog(null,"Datos del nivel\n"+
                    A.NivelDelosDatos(A.getRaiz(), dato, salida));  
                }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El dato no existe en el arbol");
                    }
               
                break; 
                
                case 10:
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato "));
                    
                    if(A.BuscarDato(dato)==true){
                A.HermanoDato(A.getRaiz(), dato);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El dato no existe en el arbol");
                    }
                break;
                   
                    
                case 11:
                    
                    
                      if(A.getRaiz()==null)
                {
                JOptionPane.showMessageDialog(null,"EL ARBOL SE ENCUENTRA VACIO");    
                }
                else
                {
                dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
                
                if(A.BuscarDato(dato)==true){
                A.PadreDelDato(A.getRaiz(), dato);
                }
                
                      else{
                              JOptionPane.showMessageDialog(null,"El dato no se encuentra");
                              }
                }
                break; 
                  
                
       }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "NO ES POSIBLE REALIZAR LA ACCIÓN");

            } 
        }while(opcion!=12);
        
    }
        
        
    }
    
    
    
    

