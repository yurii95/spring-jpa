package yutii.kozachok.spring.persistent;

import lombok.extern.slf4j.Slf4j;
import yutii.kozachok.spring.persistent.domain.User;
import yutii.kozachok.spring.persistent.repository.RoleRepository;
import yutii.kozachok.spring.persistent.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@ContextConfiguration(classes = PersistentApplication.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Test
	public void FindUsersByQueryTest() {
		List<User> users = userRepository.findUsersByQuery();
		log.info(users.toString());
	}

	@Test
	public void saveUserTest() {
		User user = TestHelper.buildUser();
		userRepository.save(user);

	}

}
