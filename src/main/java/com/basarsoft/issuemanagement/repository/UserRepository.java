package com.basarsoft.issuemanagement.repository;

import com.basarsoft.issuemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String userName);

}
