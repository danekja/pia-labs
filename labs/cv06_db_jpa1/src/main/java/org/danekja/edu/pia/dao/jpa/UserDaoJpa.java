package org.danekja.edu.pia.dao.jpa;

import org.danekja.edu.pia.dao.UserDao;
import org.danekja.edu.pia.domain.User;

import javax.persistence.EntityManager;

/**
 * JPA implementation of the UserDao interface
 *
 * Date: 26.9.15
 *
 * @author Jakub Danek
 */
public class UserDaoJpa extends GenericDaoJpa<User, String> implements UserDao {

    /**
     *
     * @param em entity manager to be used by this dao
     */
    public UserDaoJpa(EntityManager em) {
        super(em, User.class);
    }

    @Override
    public User create(User user) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
