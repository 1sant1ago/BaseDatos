/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

/**
 *
 * @author Hogar
 */
public class BaseDatos {
    
    private static frmformulario formulario;
    private static Persona persona[];
    private static int contador; 
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        formulario=new frmformulario();
        persona=new Persona[100];
        
        for (int i = 0; i < 100; i++){
            persona[i]=new Persona(); 
        }
        contador=0;
        formulario.setVisible(true);
    }
    
    public static void guardar(String n, String a, String c, int cel){
        
        persona[contador].setNombre(n);
        persona[contador].setApellido(a);
        persona[contador].setCorreo(c);
        persona[contador].setCelular(cel);
        
        contador++;   
    }
    
    public static void buscar(String bus){
        
         for (int j = 0; j < persona.length; j++){
            if (persona[j].getNombre().equals(bus)){
                formulario.cargardatos(persona[j]);
            }
         }
    
    }
}
