package com.antique_store.antique_store.data;

import com.antique_store.antique_store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //changed to authenticate by email address and password. can add username later
    Optional<User> findByEmailAddress(String emailAddress);

    Optional<User> findByVerificationToken(String token);

    boolean existsByEmailAddress(String emailAddress);

    List<User> findByEmailVerifiedTrue();
}
