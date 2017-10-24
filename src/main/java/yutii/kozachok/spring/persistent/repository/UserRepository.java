package yutii.kozachok.spring.persistent.repository;

import yutii.kozachok.spring.persistent.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u FROM User u join u.roles r ORDER BY r.name DESC")
    List<User> findUsersByQuery();
}
