package com.betamartins.controlefinanceiro.repository.user;

import com.betamartins.controlefinanceiro.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByLogin(String login);

}
