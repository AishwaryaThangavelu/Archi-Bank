/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springhibernatejsonlearning.controller;

import aish.vaishno.springhibernatejsonlearning.service.IMusicService;
import aish.vaishno.springhibernatejsonlearning.transferobject.SongDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Aishu
 */
public class Executer {
    
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aish/vaishno/springhibernatejsonlearning/xmls/beans.xml");
        IMusicService musicService=(IMusicService) applicationContext.getBean("MusicServiceImpl");
        SongDetails songDetails=new SongDetails();
        songDetails.setSongID(1);
        songDetails.setSongName("Munbe Va");
        songDetails.setSongLanguage("Tamil");
        songDetails.setSongType("Melody");
        songDetails.setSinger("Shankar Tucker,Iyer Sisters");
      //  musicService.addNewSong(songDetails);
        
        System.out.println("Song List"+musicService.getAllSongList());
    }
    
}
