/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajo_en_clase_3;

import com.mycompany.trabajo_en_clase_3.controlador.Agenda;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Trabajo_en_Clase_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op1 = 0;
        
        Agenda agenda = new Agenda();
      
        while (op1 != 4) {
            op1= agenda.Menu();
            switch (op1) {
                case 1:
                    agenda.AgregarContacto();
                   
                    break;
                case 2:
                    agenda.BuscarContacto();

                    break;
                case 3:
                    agenda.EliminarContacto();

                    break;

            }

        }
    }
}
