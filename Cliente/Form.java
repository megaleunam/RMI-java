
import java.util.Scanner; 

public class Form {
  private String nombre;
  private String apellido;
  private String cedula;
  private String fc_nac;
  private String lugar_nac;
  
  public Form(){}

  public void inicializar() {
    System.out.println ("Empezamos el programa");
    System.out.println ("Por favor introduzca su nombre:");
    String entradaTeclado = "";
    Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
    entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    setNombre(entradaTeclado);
    entradaTeclado = "";
    System.out.println ("Introduzca su apellido:");
    entradaTeclado = entradaEscaner.nextLine ();
    setApellido(entradaTeclado);
    entradaTeclado = "";
    System.out.println ("Introduzca su cedula:");
    entradaTeclado = entradaEscaner.nextLine ();
    setCedula(entradaTeclado);
    entradaTeclado = "";
    System.out.println ("Introduzca su fecha de nacimiento (dd/mm/aa): ");
    entradaTeclado = entradaEscaner.nextLine ();
    setFechaN(entradaTeclado);
    entradaTeclado = "";
    System.out.println ("Introduzca el lugar de nacimiento:");
    entradaTeclado = entradaEscaner.nextLine ();
    setLugarN(entradaTeclado);
    
    System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");

  }

  private void setNombre(String nom){
    nombre = nom;
  }

  private void setApellido(String ape){
    apellido = ape;
  }

  private void setCedula(String ci){
    cedula = ci;
  }

  private void setFechaN(String fc_nacimiento ){
    fc_nac = fc_nacimiento;
  }

  private void setLugarN(String lugar ){
    lugar_nac = lugar;
  }
  public String getNombre(){
    return nombre;
  }
  public String getApellido(){
    return apellido;
  }
  public String getCedula(){
    return cedula;
  }
  public String getFechaN(){
    return fc_nac;
  }
  public String getLugarN(){
    return lugar_nac;
  }
}    
