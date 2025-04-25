package edu.ICET.repository;

import edu.ICET.dto.User;
import edu.ICET.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findAllById(Integer id);
}
