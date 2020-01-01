package com.sample.common.repository;

import com.sample.common.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Repositoryのテスト実行クラス
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    /**
     * テスト前処理
     */
    @Before
    public void setTestData() {
        User testUser = new User();
        testUser.setUserId( "test01" );
        testUser.setUserName( "テスト01" );
        testUser.setPassword( "pass01" );
        testUser.setUserRole( "TEST" );

        testEntityManager.persist( testUser );
    }

    /**
     * テスト実行
     */
    @Test
    public void test() {

        Optional<User> testUser = userRepository.findById( "test01" );
        assertTrue( testUser.isPresent() );
    }
}
