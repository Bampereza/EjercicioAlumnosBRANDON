//Brandon Isaias Ampérez Aldana 0909-21-4628
package ejercicioregistrob;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BRANDON
 */
public class EjercicioRegistroB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
         AlumnosA ejerciciosListasB= new AlumnosA();
         EjercicioRegistroB AlumnosA=new EjercicioRegistroB();
         AlumnosB listAlumnosB =new AlumnosB();
         AlumnosCurso listAlumnosB2 =new AlumnosCurso();
         
          int opcion =0;
          
         do{
              System.out.println("-------------------------------------------------------------");
              System.out.println("----Bienvenido al programa de registro de AlumnosBA----------");
              System.out.println("-------------------------------------------------------------");
              System.out.println("Seleccione la opcion de registro que desee utilizar: ");
              System.out.println("{1) Registro de datos con arrays"); 
              System.out.println("{2) Registro de datos con listas"); 
              System.out.println("{3) MostrarHistorial Arrays");
              System.out.println("{4) MostrarHistorial Listas ");
              System.out.println("{0) Salir");
              
              
              System.out.println("Ingrese la opcion que desea usar: ");
                  opcion =sc.nextInt();
                  
              switch(opcion){
                 
                 case 1:
                     
                     int opcionA = 0;
                     
                     do{
                         
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("----Bienvenido usuario seleccione la opcion a registrar: ----");
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("{1) Datos alumnnos");
                       System.out.println("{2) Datos del cursos"); 
                       System.out.println("{0) Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionA =sc.nextInt();
                     
 
              switch(opcionA){

                case 1:
                     String nombreA="";
                     String nombreB="";
                     String correoA="";
                     int numeroB=0;
                     int codigoA=0;
                     
                     ejerciciosListasB.datosAlumnos2(nombreA, nombreB, numeroB, codigoA,correoA);
                     
                         
                      
                          

	          break;
                  
                  case 2:
                   
                      String nombreC="";
                      String descripcionA="";
                      int codigoC=0;
                      int CodigoG=0;
                      

                     ejerciciosListasB.datosCursos2(nombreC, descripcionA, codigoC, CodigoG);
                         
      
	          break;
                  
  
                case 0:
                     
	          break;
                }
              
             }while(opcionA!=0);
   
             break;
             
                case 2:
                    
                     
                     int opcionAB = 0;
                     
                     do{
                         
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("----Bienvenido usuario seleccione la opcion a registrar: ----");
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("{1) Lista alumnno");
                       System.out.println("{2) Listar cursos"); 
                       System.out.println("{0) Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionAB =sc.nextInt();
                     
 
              switch(opcionAB){

                case 1:
                      String nombreA ="";
                      String aleasA="";
                      String correoA="";
                      int telefonoA=0;
                      int codigoA=0;
                      
                     listAlumnosB.listaAlumnos(nombreA, aleasA, correoA,telefonoA,codigoA);
                    
                          

	          break;
                  
                  case 2:
                   
                      String nombreC="";
                      String descripcionA="";
                      int codigoC=0;
                      int CodigoG=0;
                      

                       listAlumnosB2.listaAlumnos2(codigoC, CodigoG,descripcionA,nombreC);
                           
	          break;
                  
   
                case 0:
                     
	          break;
                }
              
             }while(opcionAB!=0);
   
             break;
                     
                 
                case 3:
                  
                           ejerciciosListasB.mostrarDatos();

                 break;
                 
                case 4:
                          listAlumnosB.lista();
                          listAlumnosB2.listaB();
                     
                 break;
                
                 
                case 0:
                              
                 break;
                 
              }
         
         }while(opcion!=0);        
    
         System.out.println("El programa a finalizado");
    }
}
   
    

