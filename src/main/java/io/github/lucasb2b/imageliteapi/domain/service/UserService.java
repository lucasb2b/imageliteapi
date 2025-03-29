package io.github.lucasb2b.imageliteapi.domain.service;

import io.github.lucasb2b.imageliteapi.domain.AccessToken;
import io.github.lucasb2b.imageliteapi.domain.entity.User;

public interface UserService {
    User getByEmail(String email);
    User save(User user);
    AccessToken authenticate(String email, String password);
}
