import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Horario implements GestionArchivoHorario {
    public static final String aaSEPARATOR = ";";
    public static final String aaQUOTE = "\"";

    public void aaShowHorario() throws IOException{
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Horarios\\202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv"));
            

            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(aaSEPARATOR);
                System.out.println(Arrays.toString(fields));

                fields = removeTrailingQuotes(fields);
                System.out.println(Arrays.toString(fields));
                line = br.readLine();
            }
        } catch (Exception e) {
       
        }finally{
            if (null != br) {
                br.close();
            }
        }

    }

    private static String[] removeTrailingQuotes(String[] fields) {

      String result[] = new String[fields.length];

      for (int i=0;i<result.length;i++){
         result[i] = fields[i].replaceAll("^"+aaQUOTE, "").replaceAll(aaQUOTE+"$", "");
      }
      return result;
   }
    
    


}
