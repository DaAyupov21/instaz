package ru.damayupov.instaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.damayupov.instaz.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername (String username);
    Optional<User> findUserByEmail (String email);
    Optional<User> findUserById (Long id);
}
