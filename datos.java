package programacion.clase12;
import java.util.Random;
import javax.swing.JOptionPane;
public class datos{
    public int cancionid = 0;
    public String titulocancion = "";
    public String autorcancion = "";
    public Double duracioncancion = 0.0;
    public int añocancion = 0;
    datos[] arrcanciones = new datos[10];

    public datos(int cancionid, String titulocancion, String autorcancion, Double duracioncancion,int añocancion){
        this.cancionid = cancionid;
        this.titulocancion = titulocancion;
        this.autorcancion = autorcancion;
        this.duracioncancion = duracioncancion;
        this.añocancion = añocancion;
    }

    public void setcancionid(){
        Random random = new Random();
        cancionid = random.nextInt(10000);
    }
    public int getcancionid(){
        return cancionid;
    }

    public void settitulocancion(){
        titulocancion = JOptionPane.showInputDialog("ingrese el titulo de la cancion: ");
    }
    public String gettitulocancion(){
        return titulocancion;
    }

    public void setautorcancion(){
        autorcancion = JOptionPane.showInputDialog("ingrese el autor de la cancion: ");
    }
    public String getautorcancion(){
        return autorcancion;
    }

    public void setduracioncancion(){
        duracioncancion = Double.parseDouble(JOptionPane.showInputDialog("ingrese la duracion de la cancion \n ejemplo: 1.20"));
    }
    public double getduracioncancion(){
        return duracioncancion; 
    }

    public void setañocancion(){
        añocancion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año de la cancion \n ejemplo:  2012"));
    }
    public int getañocancion(){
        return añocancion;
    }

    public void setguardarcanciones(){
        for(int i = 0;i<10;i++){
            setcancionid();
            setautorcancion();
            settitulocancion();
            setduracioncancion();
            setañocancion();
            arrcanciones[i] = new datos(cancionid, titulocancion, autorcancion, duracioncancion, añocancion);
        }
    }

    public String toString(){
        return "Cancion ID: " + cancionid + "\n Título: " + titulocancion + "\n Autor: " + autorcancion
        + "\n Duración: " + duracioncancion + "\n Año: " + añocancion;
    }

    public void mostrar(){
        for(int i = 0;i<10;i++){
            JOptionPane.showMessageDialog(null,arrcanciones[i].toString());
            }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getañocancion()<2023){
                JOptionPane.showMessageDialog(null,"esta cancion salio antes del año actual: "+arrcanciones[i]);
            }
        }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getañocancion()==2023){
                JOptionPane.showMessageDialog(null,"esta cancion salio en el año actual: "+arrcanciones[i]);
            }
        }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getañocancion()>2023){
                JOptionPane.showMessageDialog(null,"esta cancion salio posteriormente del año actual: "+arrcanciones[i]);
            }
        }
        Double dura = 0.0;
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getduracioncancion()>dura){
            dura = arrcanciones[i].getduracioncancion();
            }
        }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getduracioncancion()==dura){
            JOptionPane.showMessageDialog(null,"cancion con mayor duracion: "+arrcanciones[i]);
            }
        }
        JOptionPane.showMessageDialog(null,"autor de la cancio en la posicion 1: "+arrcanciones[0].getautorcancion());
        
    }
}


    






