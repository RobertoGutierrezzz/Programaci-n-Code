
package com.mycompany.ccodigo;


import java.util.Calendar;

public class Principal {

    public static void main(String[] args) {
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2023, 10, 13);
        
        final int monto=5;
        //ProfesorInterino(Calendar fechacomienzoInterinidad, String IdProfesor, String nombre, String apellidos, int edad) {
        //ProfesorTitutar(String IdProfesor, String nombre, String apellidos, int edad) {
        ProfesorInterino prof1 = new ProfesorInterino(fecha1, "Pi1", "Juan", "Aragón", 44);
        ProfesorTitular prof2 = new ProfesorTitular("Pt1", "Carlos", "Perez", 50);

        ProfesorInterino prof3 = new ProfesorInterino(fecha1, "Pi1", "Juan", "Aragón", 44);
        ProfesorTitular prof4 = new ProfesorTitular("Pt1", "Carlos", "Perez", 50);

        ListaProfesores listaProf = new ListaProfesores();
        listaProf.AddProfesor(prof1);
        listaProf.AddProfesor(prof2);
        listaProf.AddProfesor(prof3);
        listaProf.AddProfesor(prof4);

        listaProf.ImprimirLista();

        System.out.println("Importe total de la nómina:C$ " + listaProf.ImporteNomina());

    }
}