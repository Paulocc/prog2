import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class A002 {
  public static void main (String[] args) {
    
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    Calendar calendario = Calendar.getInstance();
    System.out.println("Data:" + df.format(calendario.getTime()));

    Date dataHoraAtual = new Date();
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    System.out.println("Hora: "+ hora);
  }
}
