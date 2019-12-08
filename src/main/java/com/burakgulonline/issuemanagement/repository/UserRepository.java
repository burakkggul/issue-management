package com.burakgulonline.issuemanagement.repository;

import com.burakgulonline.issuemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String userName);

}
