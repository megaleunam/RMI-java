import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
     
public class Cliente {
  public static void main(String args[]) {
    try{
      ORB orb = ORB.init(args,null);
      // obtener una referencia a NameService
      org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
      // las siguientes lineas nos permiten obtener una ref a un objeto remoto
      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
      // nombre del obj remoto
      String nombre = "ClienteRemoto";
      ClienteRemoto.ClienteRem impl =ClienteRemoto.ClienteRemHelper.narrow(ncRef.resolve_str(nombre));
      System.out.println(impl.Saludar("Irene"));
    }catch (Exception e) {
      System.out.println("ERROR : " + e);
      e.printStackTrace(System.out);
    }
  }
}