
import ClienteRemoto.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ClienteRemImpl extends ClienteRemPOA
{
	public ClienteRemImpl(){}
	public String Saludar(String nombre,String apellido,String cedula, String fechaNacimiento){
        
        Date fn_date= new Date();
        int edad = 0;
        try {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        fn_date = sdf.parse(fechaNacimiento);
	        Calendar c = new GregorianCalendar();
            c.setTime(fn_date);
            edad = calcularEdad(c);
    	}catch (ParseException e) {
            e.printStackTrace();
        }
        
        return "Hola, "+nombre +" "+apellido+" su cedula es : "+cedula+" edad:"+ Integer.toString(edad) +" a#os"+" avatar:"+generarAvatar(nombre);
    }
	private static int calcularEdad(Calendar fechaNac) {
	    Calendar today = Calendar.getInstance();
	    int diffYear = today.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
	    int diffMonth = today.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
	    int diffDay = today.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
	    // Si está en ese año pero todavía no los ha cumplido
	    if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
	        diffYear = diffYear - 1;
	    }
	    return diffYear;
	}

	private static String generarAvatar(String nombre){
		long  seg = System.currentTimeMillis();
		return nombre + String.valueOf(seg).substring(8,12);
	}


}