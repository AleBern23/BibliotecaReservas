/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtubeex;

/**
 *
 * @author SG701-17
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    
    //declaramos atributos de clase servicio
    ThirdPartyYouTubeClass service;
    
    @Override
    public void listVideo() {
        System.out.println("Ejecutando Proxy: ListVideo\n");
        if (service==null) 
            service=new ThirdPartyYouTubeClass();
        service.listVideo();
    }

    @Override
    public String getInfo(int ID) {
        System.out.println("Ejecutando Proxy: Info\n");
        if (service==null) 
            service=new ThirdPartyYouTubeClass();
        return service.getInfo(ID);
    }

    @Override
    public void downloadVideo(int ID) {
        System.out.println("Descargando video: " + ID);
        if (service==null) 
            service=new ThirdPartyYouTubeClass();
        service.downloadVideo(ID);
    }
    
}
