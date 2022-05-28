//Brandon Isaias Ampérez Aldana 0909-21-4628
package ejercicioregistrob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author BRANDON
 */

public class AlumnosB {
    
   /* ArrayList<AlumnosB> listAlumnos = new ArrayList();*/
     List<AlumnosB> listAlumnos = new ArrayList<AlumnosB>();
    
    
     Scanner sc= new Scanner(System.in);
    
     
    int[] vector;
    private double[] matriz;
    private int indiceVector;
    String listaA;
    String verLista;
    int verLista2;
        
     
     String verNombreA;
     String verNombreB;
     String addAlumnosB;
     
      //constructor

    int numeroAB;
    String nombreA;
    String aleasA;
    String correoA;
    int telefonoA;
    int codigoA;
    int codigoC;
    String nombreC;
    int codigoG;
    String descripcionA;


    
    public AlumnosB() {
        
    }
    
    
    public AlumnosB(String nombreA, String aleasA, String correoA, int telefonoA, int codigoA) {
       
        this.nombreA = nombreA;
        this.aleasA = aleasA;
        this.correoA=correoA;
        this.telefonoA=telefonoA;
        this.codigoA=codigoA;
    }

    public int getCodigoG() {
        return codigoG;
    }

    public void setCodigoG(int codigoG) {
        this.codigoG = codigoG;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    
    
    public int getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }
    
    
    

    public int getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(int telefonoA) {
        this.telefonoA = telefonoA;
    }
    

    public String getCorreoA() {
        return correoA;
    }

    public void setCorreoA(String correoA) {
        this.correoA = correoA;
    }
    
    

    public String getAleasA() {
        return aleasA;
    }

    public void setAleasA(String aleasA) {
        this.aleasA = aleasA;
    }
    
    
       public int getNumeroAB() {
        return numeroAB;
    }

    public void setNumeroAB(int numeroAB) {
        this.numeroAB = numeroAB;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(int codigoA) {
        this.codigoA = codigoA;
    }
    
    
    
    public void listaAlumnos(String nombreA, String aleasA, String correoA, int telefonoA, int codigoA){
        
                        System.out.println("-----------------------------------------");  
                        System.out.println("-----Ingrese el nombre del alumno: ------");
                        System.out.println("-----------------------------------------"); 
                         nombreA= sc.next();
                         
                        System.out.println("--------------------------------------");  
                        System.out.println("-----Ingrese el aleas del alumno: ----");
                        System.out.println("--------------------------------------");
                         aleasA = sc.next();
                         
                        System.out.println("--------------------------------------");  
                        System.out.println("-----Ingrese el correo del alumno: ----");
                        System.out.println("--------------------------------------");
                         correoA = sc.next();
                         
                        System.out.println("--------------------------------------");  
                        System.out.println("-----Ingrese el telefono del alumno: ----");
                        System.out.println("--------------------------------------");
                         telefonoA = sc.nextInt();
                         
                        System.out.println("--------------------------------------");  
                        System.out.println("-----Ingrese el codigo del alumno: ----");
                        System.out.println("--------------------------------------");
                         codigoA = sc.nextInt();
                         
                         
        
        listAlumnos.add(new AlumnosB(nombreA,aleasA,correoA, telefonoA, codigoA));
       
        //return verLista;
    }
    
    public void lista(){

        System.out.println("----------------------------");
        System.out.println("-------Lista Alumnos--------");
        System.out.println("----------------------------");
        System.out.println("");
        //recorido for por índice
        for (int i=0; i<listAlumnos.size(); i++) {
            System.out.println("Nombre del Alumno es: " + listAlumnos.get(i).getNombreA());
            System.out.println("Aleas del Alumno es: " + listAlumnos.get(i).getAleasA());
            System.out.println("El correo del Alumno es: " + listAlumnos.get(i).getCorreoA());
            System.out.println("El telefono del Alumno es: " + listAlumnos.get(i).getTelefonoA());
            System.out.println("El codigo del Alumno es: " + listAlumnos.get(i).getCodigoA());
        }
    }
        
}
 
    
    
      
   


   
  


        
        
    








