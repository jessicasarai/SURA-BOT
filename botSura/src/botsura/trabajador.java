/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

/**
 *
 * @author japb1
 */
public class trabajador {
    public String matricula;
    public String correo;
    public String archivo;
    leerArchivo trabajadores;
    //public ArrayList<String> listaMat;
    //Scanner file;
    /**
     *
     * @param matricula
     * @param correo
     */
    
    public trabajador(String matricula, String correo){
        this.archivo="base1.txt";
        this.matricula = matricula;
        this.correo=correo;
        trabajadores= new leerArchivo(archivo);
        
        
    }    
        
    public  void imprimir(){
        trabajadores.imprimirlista();
    } 
    
    
    public boolean identificarse(){
       boolean existe=false;
       int i = 0;
       
       if(i!=-1){
           existe=true;
       }
       
        return existe;
    }
    
    
    //concatenar la nueva matricula
    
    public void actualizarTrabajador(String respuestas){
       String content = "";
       content+= matricula + "," + correo + "," + respuestas;
    }
    
   
    
    public String getMatricula(){
        return matricula;
    }
    
    public String setMatricula(){
        return matricula;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
<<<<<<< HEAD
    
    
    public ArrayList<String> getlistaMat() {
        return listaMat;
    }
    
    public int getlistaMatCounter(){
        return listaMat.size();
    }
    
    
    //esta clase es la unica que elimina y edita el archivo
    public void ActualizarArchivo(int linea, String Actualizacion){
       FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("base1.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < listaMat.size(); i++)
                if(i!=linea){
                pw.println(listaMat.get(i));
                }else{
                    pw.println(Actualizacion +"\n");
                } 
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
    }
    }
    
    
    
    public void closeFile(){
        file.close();
    }    
=======
    public String setCorreo(){
        return this.correo;
    }
>>>>>>> parent of 29ff416... Revert "Merge branch 'rama2'"
    
    
    /*
    //esta clase es la unica que elimina y edita el archivo
    public void ActualizarArchivo(int linea, String Actualizacion){
       FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("base1.txt");
            pw = new PrintWriter(fichero);
                listaMat.set(linea,Actualizacion);
            for (int i = 0; i < listaMat.size(); i++)
               // if(i!=linea){
                pw.println(listaMat.get(i));
                //}else{
                  //  pw.println(Actualizacion +"\n");
                //} 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
    }
    }

*/
}