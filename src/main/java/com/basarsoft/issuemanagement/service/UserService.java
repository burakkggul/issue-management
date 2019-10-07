package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.dto.UserDto;
import com.basarsoft.issuemanagement.model.User;
import com.basarsoft.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save (UserDto user);
    UserDto getById(Long id);
    TPage<UserDto> getAllPageable (Pageable pageable);
}
