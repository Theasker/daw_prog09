
package EntidadBancaria;

import java.io.*;

public class Serializadora {
  private ObjectInputStream lectorDeObjetos;
  private ObjectOutputStream escritorDeObjetos;
  private String path;

  public void escribirObjeto(Object objeto) throws FileNotFoundException, IOException{
    escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("clientes.dat"));
    escritorDeObjetos.writeObject(objeto);
    escritorDeObjetos.close();
  }

  public Object leerObjeto(String nombreDelArchivo) throws FileNotFoundException, IOException, ClassNotFoundException{
    lectorDeObjetos = new ObjectInputStream(new FileInputStream(nombreDelArchivo));
    return lectorDeObjetos.readObject();
  }
}
