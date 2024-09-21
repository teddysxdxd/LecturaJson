/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturajson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

/**
 *
 * @author USUARIO
 */
public class LecturaJson {

    public static void main(String[] args) {
 ObjectMapper map = new ObjectMapper();
        
 Estudiante estudiante = new Estudiante();
 
 estudiante.setNombre("Tedi Castellanos");
 estudiante.setGenero("Hombre");
 estudiante.setSeccion("B");
 estudiante.setCarnet("7690-23-3016");
 
 
 try {
  map.writeValue(new File ("estudiante.txt"), estudiante );
  
 } catch (Exception e){
     System.out.println("Este es el error del metodo json" +e);
 }
 
 try {
     
     Estudiante estudiante2 = map.readValue(new File ("estdiante.txt"), Estudiante.class);
     System.out.println("nombre"+ estudiante2.getNombre());
     System.out.println("canet"+ estudiante2.getCarnet());
     System.out.println("genero"+ estudiante2.getGenero());
     System.out.println("seccion"+ estudiante2.getSeccion());

 } catch (Exception e){
     
 }
    }
    
}
