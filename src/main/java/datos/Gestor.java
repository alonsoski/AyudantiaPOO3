package datos;
import modelo.Biblioteca;
import modelo.Libro;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;
import java.util.Date;



import java.io.*;

public class Gestor {
    public static void leerArchivoLibros(Biblioteca biblioteca, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
//Lee cada linea del archivo hasta que la linea sea nula
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(";");
                biblioteca.getLibros().add(new Libro(data[0], data[1], data[2]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
            System.err.println(e);
            e.printStackTrace();
        }
    }

    public static boolean registrarDato(Object objeto, String direccionArchivo) {
        boolean lineaVacia=false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
//Si el documento no es nuevo y tiene registrado datos, se debe
            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }

}