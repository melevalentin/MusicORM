package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HBUtil;
import music.orm.*;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HBUtil.getSessionFactory();
        Session session = HBUtil.newSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            Groupe groupe = new Groupe("Linkin Park");
            Artiste artiste = new Artiste("Chester Bennington", true);
            Membregroupe membregroupe = new Membregroupe(groupe, artiste);
            groupe.getMembregroupesById().add(membregroupe);
            artiste.getMembregroupesById().add(membregroupe);


            java.util.Date date_util = new java.util.Date();
            java.sql.Date date_sql = new java.sql.Date(date_util.getTime());
            Album album = new Album("Meteora", "Rock", date_sql, (float)10.99, groupe, artiste);

            Morceau morceau = new Morceau("Numb", "127");
            Contenu contenu = new Contenu(morceau, album);
            Vente vente = new Vente(12, 2018, 350000, album);
            album.getVentesById().add(vente);
            album.getContenusById().add(contenu);

            HBUtil.persist(session, album);
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }

        sessionFactory.close();
    }
}