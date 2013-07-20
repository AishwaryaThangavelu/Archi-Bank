/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springjpatrial2.config;

import aish.vaishno.springjpatrial2.dao.MusicStoreDaoImpl;
import aish.vaishno.springjpatrial2.pojo.MusicDetails;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aishu
 */
public class Executer {
    
    public static void main(String[] args){
       /* EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("simple-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("connection: "+entityManager);
        List<MusicDetails> musicDetailsList= entityManager.createQuery("select c from MusicDetails c").getResultList();
        System.out.println(musicDetailsList);
         */
        
        MusicStoreDaoImpl musicStoreDao= new MusicStoreDaoImpl();
        System.out.println("********"+musicStoreDao.getMusicList());
                
        
    }
    
}
