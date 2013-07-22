/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springjpatrial2.config;

import aish.vaishno.springjpatrial2.dao.IMusicStoreDao;
import aish.vaishno.springjpatrial2.dao.MusicStoreDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
        
       // IMusicStoreDao musicStoreDao= new MusicStoreDaoImpl();
      //  System.out.println("********"+musicStoreDao.getMusicList());
        
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        IMusicStoreDao musicStoreDao=(IMusicStoreDao) applicationContext.getBean("Aishwarya's Music Store Dao");
        System.out.println("****"+musicStoreDao.getMusicList());
                
        
    }
    
}
