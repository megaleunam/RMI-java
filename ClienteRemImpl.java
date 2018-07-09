import ClienteRemoto.*;

public class ClienteRemImpl extends ClienteRemPOA
{
	public ClienteRemImpl(){}
	public String Saludar(String nombre){
        return "Hola "+nombre;
    }
}