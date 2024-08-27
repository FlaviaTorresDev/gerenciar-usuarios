package flavia.dev.GerenciarUsuarios.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import flavia.dev.GerenciarUsuarios.entity.Users;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, Integer> {

    Optional<Users> findByEmail(String email);
}