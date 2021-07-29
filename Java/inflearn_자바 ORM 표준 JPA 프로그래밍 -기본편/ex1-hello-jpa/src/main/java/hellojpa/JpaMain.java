package hellojpa;

import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setUsername("member1");
            em.persist(member);
            
            em.flush();
            em.clear();

            Member m = em.getReference(Member.class, member.getId());
            System.out.println("mrefer = " + m.getClass()); // proxy
            Hibernate.initialize(m);
            System.out.println(m.getClass());
            System.out.println("emf.getPersistenceUnitUtil().isLoaded(m) = " + emf.getPersistenceUnitUtil().isLoaded(m));

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }
    
}
