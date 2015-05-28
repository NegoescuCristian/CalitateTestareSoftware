package licenta.persistence.dao.impl;

import licenta.persistence.dao.UserDao;
import licenta.persistence.entities.UserDetailsEntity;
import licenta.persistence.entities.UserEntity;

/**
 * Created by churmuzache on 5/27/15.
 */
public class UserDetailsDao extends AbstractDaoImpl<UserDetailsEntity>implements UserDao {
    public UserDetailsDao(){
        super(UserDetailsEntity.class);
    }
}
