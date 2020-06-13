package tr.com.burakgul.issuemanagement.service;

import tr.com.burakgul.issuemanagement.dto.UserDto;
import tr.com.burakgul.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save (UserDto user);
    UserDto getById(Long id);
    TPage<UserDto> getAllPageable (Pageable pageable);
}
