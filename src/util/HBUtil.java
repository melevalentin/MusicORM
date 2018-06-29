package util;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Copyright Mathieu MULOT
 * @author Mathieu MULOT
 *
 */

public class HBUtil {

    private static final SessionFactory sessionFactory = getSessionFactory();

    public static SessionFactory getSessionFactory() {
        Configuration config = new Configuration();
        SessionFactory sessionFactory = config.configure().buildSessionFactory();
        return sessionFactory;
    }

    public static Session newSession() {
        return sessionFactory.openSession();
    }

    public static void persist(Session session, Object obj) {
        System.out.println("persisting instance");
        try {
            session.persist(obj);
            System.out.println("persist successful");
        } catch (RuntimeException re) {
            System.out.println("persist failed");
            throw re;
        }
    }

    public static Integer save(Session session, Object obj) {
        System.out.println("saving instance");
        try {
            System.out.println("save successful");
            return (Integer)session.save(obj);
        } catch (RuntimeException re) {
            System.out.println("save failed");
            throw re;
        }
    }

    public static void saveOrUpdate(Session session, Object obj) {
        System.out.println("saving or updating instance");
        try {
            session.saveOrUpdate(obj);
            System.out.println("save or update successful");
        } catch (RuntimeException re) {
            System.out.println("save or update failed");
            throw re;
        }
    }

    public static void update(Session session, Object obj) {
        System.out.println("updating instance");
        try {
            session.update(obj);
            System.out.println("update successful");
        } catch (RuntimeException re) {
            System.out.println("update failed");
            throw re;
        }
    }

    public static Object merge(Session session, Object obj) {
        System.out.println("merging instance");
        try {
            Object result = session.merge(obj);
            System.out.println("merge successful");
            return result;
        } catch (RuntimeException re) {
            System.out.println("merge failed");
            throw re;
        }
    }

    public static void lock(Session session, Object obj) {
        System.out.println("locking instance");
        try {
            session.lock(obj, LockMode.NONE);
            System.out.println("lock successful");
        } catch (RuntimeException re) {
            System.out.println("lock failed");
            throw re;
        }
    }

    public static void delete(Session session, Object obj) {
        System.out.println("deleting instance");
        try {
            session.delete(obj);
            System.out.println("delete successful");
        } catch (RuntimeException re) {
            System.out.println("delete failed");
            throw re;
        }
    }

    public static void evict(Session session, Object obj) {
        System.out.println("evicting instance");
        try {
            session.evict(obj);
            System.out.println("evict successful");
        } catch (RuntimeException re) {
            System.out.println("evict failed");
            throw re;
        }
    }

    public static Object getById(Session session, String className, java.lang.Integer id) {
        System.out.println("getting instance with id: " + id);
        try {
            Object obj = session.get(className,id);
            if (obj == null) {
                System.out.println("get successful, no instance found");
            } else {
                System.out.println("get successful, instance found");
            }
            return obj;
        } catch (RuntimeException re) {
            System.out.println("get failed");
            throw re;
        }
    }


    public static Object loadById(Session session, String className, java.lang.Integer id) {
        System.out.println("loading instance with id: " + id);
        try {
            Object obj = session.load(className,id);
            System.out.println("load successful");
            return obj;
        } catch (RuntimeException re) {
            System.out.println("load failed");
            throw re;
        }
    }
}
