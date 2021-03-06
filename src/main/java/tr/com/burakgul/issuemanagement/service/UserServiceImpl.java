package tr.com.burakgul.issuemanagement.service;

import tr.com.burakgul.issuemanagement.dto.UserDto;
import tr.com.burakgul.issuemanagement.model.User;
import tr.com.burakgul.issuemanagement.repository.UserRepository;
import tr.com.burakgul.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository,ModelMapper modelMapper){
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto save(UserDto user) {
        User userDB = modelMapper.map(user,User.class);
        if(userDB.getEmail() == null){
            throw new IllegalArgumentException("not null");
        }
        userRepository.save(userDB);
        return modelMapper.map(userDB,UserDto.class);
    }

    @Override
    public UserDto getById(Long id) {
        User u = userRepository.getOne(id);
        return modelMapper.map(u,UserDto.class);
    }

    @Override
    public TPage<UserDto> getAllPageable(Pageable pageable) {
        Page<User> data = userRepository.findAll(pageable);
        TPage<UserDto> response = new TPage<UserDto>();
        response.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), UserDto[].class)));
        return response;
    }
}
