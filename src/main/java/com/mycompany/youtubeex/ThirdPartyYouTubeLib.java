/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.youtubeex;

/**
 *
 * @author SG701-17
 */
public interface ThirdPartyYouTubeLib {
    public void listVideo();
    public String getInfo(int ID);
    public void downloadVideo(int ID);
}
