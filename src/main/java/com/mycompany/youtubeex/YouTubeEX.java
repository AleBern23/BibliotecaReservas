/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtubeex;

import java.util.Scanner;

/**
 *
 * @author SG701-17
 */
public class YouTubeEX {

    public static void main(String[] args) {
        CachedYouTubeClass proxy = new CachedYouTubeClass();
        Scanner in = new Scanner(System.in);
        int opc;
        
        while(true){
        System.out.println("Ingrese una de las siguientes opciones: \n"
                + "1. Listar videos\n"
                + "2. Obtener informacion de un video\n"
                + "3. Descargar video\n"
                + "4. Salir");
        opc = in.nextInt();
        switch(opc){
            case 1:
                proxy.listVideo();
                break;
            case 2:
                int ID;
                System.out.print("Ingrese el ID del video: ");
                ID = in .nextInt();
                System.out.println(proxy.getInfo(ID));
                break;
            case 3:
                int ID2;
                System.out.print("Ingrese el ID del video: ");
                ID2 = in .nextInt();
                proxy.downloadVideo(ID2);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion invalida :( . Ingrese un valor entre 1 y 4!");
                break;
        }
    }
    }
}
