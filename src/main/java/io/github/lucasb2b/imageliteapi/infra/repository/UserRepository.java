package io.github.lucasb2b.imageliteapi.infra.repository;

import io.github.lucasb2b.imageliteapi.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
