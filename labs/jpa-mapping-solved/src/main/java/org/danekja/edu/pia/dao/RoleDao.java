package org.danekja.edu.pia.dao;

import java.util.Set;

import org.danekja.edu.pia.domain.Role;

/**
 * DAO interface for the Role entity
 *
 * Date: 26.9.15
 *
 * @author Jakub Danek
 */
public interface RoleDao extends GenericDao<Role, Long> {

    /**
     *
     * @param username username of the user in scope
     * @return set of roles associated with the given user
     */
    Set<Role> findByUser(String username);

}
