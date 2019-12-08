package com.burakgulonline.issuemanagement.service;

import com.burakgulonline.issuemanagement.dto.UserDto;
import com.burakgulonline.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save (UserDto user);
    UserDto getById(Long id);
    TPage<UserDto> getAllPageable (Pageable pageable);
}
