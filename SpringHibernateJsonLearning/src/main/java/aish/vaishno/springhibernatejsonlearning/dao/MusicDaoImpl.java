/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.springhibernatejsonlearning.dao;

import aish.vaishno.springhibernatejsonlearning.hibernate.HibernateSessionManager;
import aish.vaishno.springhibernatejsonlearning.transferobject.SongDetails;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aishu
 */
public class MusicDaoImpl implements IMusicDao{

    @Override
    public void addSong(SongDetails songDetails) {
        
       
        SessionFactory sessionFactory= HibernateSessionManager.getSessionFactory();
        System.out.println("session Factory: "+sessionFactory);
        Session session=sessionFactory.openSession();
        try{
            Transaction transaction=session.beginTransaction();
            try{
                transaction.begin();
                session.save(songDetails);
                session.flush();
                transaction.commit();
            }catch(HibernateException hb){
                transaction.rollback();
            } 
        }finally{
            session.close();
            HibernateSessionManager.shutdownConnection();
        }
        
         System.out.println("Song has been added");
    }

    @Override
    public List<SongDetails> getSong() {
       // List<SongDetails> songList=new ArrayList<SongDetails>();
        SessionFactory sessionFactory= HibernateSessionManager.getSessionFactory();
        Session session=sessionFactory.openSession();
        try{
        Transaction transaction=session.beginTransaction();
        List<SongDetails> songDetailsList=session.createQuery("select m from SongDetails m").list();
        transaction.commit();
        return songDetailsList;
        }finally{
            session.close();
            HibernateSessionManager.shutdownConnection();
        }
   }
    
    public static void  main(String[] args){
        IMusicDao musicDao=new MusicDaoImpl();
        System.out.println(musicDao.getSong());
    }
}
