package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User save (User user);
    User getById(Long id);
    Page<User> getAllPageable (Pageable pageable);
}
