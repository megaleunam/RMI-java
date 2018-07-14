import ClienteRemoto.*;

public class ClienteRemImpl extends ClienteRemPOA
{
	public ClienteRemImpl(){}
	public String Saludar(String nombre,String apellido,String cedula){
        return "Hola!, "+nombre +" "+apellido+"su cedula es : "+cedula;
    }
}