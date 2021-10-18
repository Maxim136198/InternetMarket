package by.itstep.internetMarket.repository;

import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collections;
import java.util.List;

import static by.itstep.internetMarket.dao.HibernateConfiguration.sessionFactory;

public abstract class GenericRepository <T,R> {

    private Class<T> entityType;
    protected Session session;

    public GenericRepository(Class<T> entityType) {
        this.entityType = entityType;
    }

    public T create(T entity){
        return create(Collections.singletonList(entity)).get(0);
    }

    public List<T> create(List<T> entities){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (T t: entities){
            session.save(t);
        }
        session.flush();
        session.getTransaction().commit();
        session.close();
        return entities;
    }

    public T find(R id){
        session = sessionFactory.openSession();
        return session.find(entityType,id);
    }

    public List<T> findAll(){
        session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entityType);
        Root<T> entityRoot = criteriaQuery.from(entityType);
        List<T> queryResult = session.createQuery(criteriaQuery.select(entityRoot))
                .getResultList();
        session.close();
        return queryResult;
    }

    public T update(T entity){
        return update(Collections.singletonList(entity)).get(0);
    }

    public List<T> update(List<T> entities){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (T t: entities){
            session.update(t);
        }
        session.flush();
        session.getTransaction().commit();
        session.close();
        return entities;
    }

    public void delete(T entity){
        delete(Collections.singletonList(entity));
    }

    public void delete(List<T> entities){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (T t: entities){
            session.remove(t);
        }
        session.flush();
        session.getTransaction().commit();
        session.clear();
        session.close();
    }
}
