/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.musicstorespringjpa.executer;

import aish.vaishno.musicstorespringjpa.dao.IMusicStoreDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author Aishu
 */
public class Executer {
    
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        IMusicStoreDao musicStoreDao=(IMusicStoreDao) applicationContext.getBean("MusicCollections");
        System.out.println("MusicList: \n"+musicStoreDao.getMusicList());
    }
}
