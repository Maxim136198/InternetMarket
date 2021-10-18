package by.itstep.internetMarket.repository;

import by.itstep.internetMarket.entity.User;
import org.hibernate.Session;

import javax.persistence.Query;
import static by.itstep.internetMarket.dao.HibernateConfiguration.sessionFactory;

public class UserRepository extends GenericRepository<User, Long> {

    private Session session;

    public UserRepository() {
        super(User.class);
    }

    public User findUserByName(String name) {
        session = sessionFactory.openSession();
        Query query = session.createQuery(
                "SElECT p FROM User p WHERE p.name = :name", User.class);
        query.setParameter("name", name);
        User user = (User) query.getSingleResult();
        session.close();
        return user;
    }
}

