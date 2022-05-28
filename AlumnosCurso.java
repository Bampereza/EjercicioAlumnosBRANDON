//Brandon Isaias Ampérez Aldana 0909-21-4628
package ejercicioregistrob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BRANDON
 */
public class AlumnosCurso  extends AlumnosB{
    
      Scanner sc= new Scanner(System.in);
      List<AlumnosB> listAlumnos2 = new ArrayList<AlumnosB>();
    
    public AlumnosCurso() {
        
    }
    
    
    public AlumnosCurso(int codigoC, int codigoG, String descripcionA,String nombreC) {
       
        this.nombreC = nombreC;
        this.codigoC=codigoC;
        this.codigoG=codigoG;
        this.descripcionA=descripcionA;    }
    

    
     public void listaAlumnos2(int codigoC, int codigoG, String descripcionA,String nombreC){
        
                        System.out.println("-----------------------------------------");  
                        System.out.println("-----Ingrese el nombre del Curso: ------");
                        System.out.println("-----------------------------------------"); 
                         nombreC= sc.next();
                         
                        System.out.println("--------------------------------------");  
                        System.out.println("-----Ingrese el codigo del Curso: ----");
                        System.out.println("--------------------------------------");
                         codigoC = sc.nextInt();
                           
                        System.out.println("-----------------------------------------");  
                        System.out.println("-----Ingrese el codigo de su Grado: -----");
                        System.out.println("-----------------------------------------"); 
                         codigoG = sc.nextInt();
                         
                        System.out.println("-----------------------------------------");  
                        System.out.println("--------Ingrese su descripcion: ---------");
                        System.out.println("-----------------------------------------"); 
                         descripcionA=sc.next();
                         
                         
        
             listAlumnos2.add(new AlumnosCurso(codigoC,codigoG,descripcionA,nombreC));
       
        //return verLista;
    }
     
     public void listaB(){
        System.out.println("--------------------------");
        System.out.println("-------Lista Curso--------");
        System.out.println("--------------------------");
        System.out.println("");
        //recorido for por índice
        for (int i=0; i<listAlumnos2.size(); i++) {
            System.out.println("Nombre del Curso es: " + listAlumnos2.get(i).getNombreC());
            System.out.println("El codigo del Curso es: " + listAlumnos2.get(i).getCodigoC());
            System.out.println("El codigo del Grado es: " + listAlumnos2.get(i).getNombreC());
            System.out.println("La descripcion es: " + listAlumnos2.get(i).getCodigoC());
        }
}
}
