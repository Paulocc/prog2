import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.Duration;
import java.time.Instant;


public class A002 {
  public static void main (String[] args) {
    
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd-");
    Calendar calendario = Calendar.getInstance();
    //System.out.println("Data:" + df.format(calendario.getTime()));

    Date dataHoraAtual = new Date();
    String hora = new SimpleDateFormat("HH-mm-ss a").format(dataHoraAtual);
    System.out.println(df.format(calendario.getTime()) + hora);
    

    Calendar dataCadastro = Calendar.getInstance();
    dataCadastro.set(2022, 1, 1);
    Calendar hoje = Calendar.getInstance();

    //calcula diferença
    int meses = (hoje.get(Calendar.YEAR) * 12 + hoje.get(Calendar.MONTH))
        - (dataCadastro.get(Calendar.YEAR) * 12 + dataCadastro.get(Calendar.MONTH));

        System.out.println("Diferença de meses: "+ meses);

    




//System.out.println(hoje.compareTo(dataCadastro));
int guarda = hoje.compareTo(dataCadastro);
hoje.add(Calendar.DATE, 1);

if(guarda == 1){
    System.out.println("Data: "+ df.format(hoje.getTime()) + " é maior");
}
    

  }
}
