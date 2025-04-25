package edu.ICET.service.impl;

import edu.ICET.dto.User;
import edu.ICET.entity.UserEntity;
import edu.ICET.repository.UserRepository;
import edu.ICET.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));

    }

    @Override
    public User searchUser(Integer id) {
        mapper.map(repository.findAllById(id), User.class);
        return null;
    }

    @Override
    public void updateUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }


    @Override
    public List<User> getAll() {
        ArrayList<User> userList = new ArrayList<>();
        List<UserEntity> all = repository.findAll();
        all.forEach(userEntity -> {
            userList.add(mapper.map(userEntity, User.class));
        });
        return List.of();
    }
}
