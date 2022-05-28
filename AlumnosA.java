//Brandon Isaias Ampérez Aldana 0909-21-4628
package ejercicioregistrob;
import java.util.Scanner;
/**
 *
 * @author BRANDON
 */
public class AlumnosA extends AlumnosB{
    
     String nombreA = "";
     float codigoAA;
     float numeroBA;
     String nombreB = "";
     float codigoCA;
     String nombreCA = "";
     float codigoG;
     String descripcionAA ="";
     String[] vectorDatos;
     private int indiceVector;
     String[] vector;
     private String[] registrarDatos;
     String i="";
     int datosAlumnosB;
     String datosAlumnosBA;
     int datoCursoB;
     String datoCursoBA;
     int codigoA;
     int numeroB;
     int codigoC;
     int CodigoG;
     String correoA;
     
     
      Scanner sc= new Scanner(System.in);
     
     
     //constructor
     public AlumnosA(){
        this.nombreA="";
        this.nombreB="";
        this.codigoA=0;
        this.numeroB=0;
        this.codigoC=0;
        this.CodigoG=0;
        this.correoA="";
        
        vectorDatos = new String [100];//inicializo el vector
         this.indiceVector= 0;  
         this.registrarDatos(i, i, i, i, numeroB, i, i, i, numeroB);
         this.registrarDatos2(i, i, i, i, nombreA, i, i, i, nombreA);
         this.registrarDatos3(i, i, i, i, nombreA, i, i, i, nombreA);
         this.registrarDatos4(i, i, i, i, numeroB, i, i, i, numeroB);
         this.registrarDatos5(i, listaA, i, listaA, listaA);
     }
     
   
     
     public void datosAlumnos2 (String nombreA, String nombreB, int numeroB, int codigoA, String correoA){
         
                        System.out.println("--------------------------------------");  
                        System.out.println("---Ingrese el nombre del alumno: -----");
                        System.out.println("--------------------------------------");
                          nombreA=sc.next();
                         
 
                        System.out.println("---------------------------------------");  
                        System.out.println("-----Ingrese el aleas del alumno: -----");
                        System.out.println("---------------------------------------"); 
                         nombreB=sc.next();
                         
                        System.out.println("-----------------------------------------");  
                        System.out.println("-----Ingrese su numero del telefono: ----");
                        System.out.println("-----------------------------------------"); 
                         numeroB= sc.nextInt();
                         
                        System.out.println("--------------------------------------");  
                        System.out.println("----Ingrese el codigo del alumno: ----");
                        System.out.println("--------------------------------------");
                         codigoA = sc.nextInt();
                         
                         
                        System.out.println("--------------------------------------");  
                        System.out.println("----Ingrese el correo del alumno: ----");
                        System.out.println("--------------------------------------");
                         correoA = sc.next();
                         
                         
                         
            
            this.registrarDatos2("Datos: ","","nombreDeAlumno: ","",nombreA,"......","aleasDeAlumno: ","",nombreB);
            this.registrarDatos("Datos: ","","numeroDeTelefono: ","",numeroB,"......","codigoDeAlumno: ","",codigoA);
            this.registrarDatos5("Datos: ","","correoDelAlumno: ","",correoA);
    
     }
     
       
       
        public void datosCursos2(String nombreC, String descripcionA, int codigoC, int codigoG  ){
            
               
                        System.out.println("-----------------------------------------");  
                        System.out.println("-----Ingrese el nombre de su curso: -----");
                        System.out.println("-----------------------------------------"); 
                         nombreC=sc.next();
 
                      
                        System.out.println("-----------------------------------------");  
                        System.out.println("--------Ingrese su descripcion: ---------");
                        System.out.println("-----------------------------------------"); 
                         descripcionA=sc.next();
                         
                        System.out.println("-----------------------------------------");  
                        System.out.println("-----Ingrese el codigo de su curso: -----");
                        System.out.println("-----------------------------------------"); 
                         codigoC = sc.nextInt();
                         
                        System.out.println("-----------------------------------------");  
                        System.out.println("-----Ingrese el codigo de su grado: -----");
                        System.out.println("-----------------------------------------"); 
                         codigoG = sc.nextInt();
           
               
                         
               this.registrarDatos3("Datos: ","","nombreDelCurso: ","",nombreC,"......","descripcionDelCurso: ","",descripcionA);
                
               this.registrarDatos4("Datos: ","","codigoDelCurso: ","",codigoC,"......","codigoDeGrado: ","",codigoG);
      
       }
     
       
       

    
   public void registrarDatos(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro, String espacio3, String tipo3, String espacio4, int segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
   
   public void registrarDatos2(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro, String espacio3, String tipo3, String espacio4, String segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
   
    public void registrarDatos3(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro, String espacio3, String tipo3, String espacio4, String segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
    
     public void registrarDatos4(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro, String espacio3, String tipo3, String espacio4, int segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
     
     public void registrarDatos5(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
     
      public void mostrarDatos(){
          try{   
              System.out.println(vectorDatos.length);
            for (int i=1; i<vectorDatos.length;i++){
                if(vectorDatos[i]!=null){
                    System.out.println(vectorDatos[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }

       public void almacenarDatos(String numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }

              
       }     



