/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercarch;

/**
 *
 * @author Nestor Luque
 */
public class Estudiante {
    private String nombEstu ;
    private String apellEstu;
    private String edad;
    private String Id ;

    public Estudiante() {
    }

    public Estudiante(String nombEstu, String apellEstu, String edad, String Id) {
        this.nombEstu = nombEstu;
        this.apellEstu = apellEstu;
        this.edad = edad;
        this.Id = Id;
    }

    Estudiante(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombEstu() {
        return nombEstu;
    }

    public void setNombEstu(String nombEstu) {
        this.nombEstu = nombEstu;
    }

    public String getApellEstu() {
        return apellEstu;
    }

    public void setApellEstu(String apellEstu) {
        this.apellEstu = apellEstu;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
     
    
    
}
