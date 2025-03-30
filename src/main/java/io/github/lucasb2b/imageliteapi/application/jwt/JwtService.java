package io.github.lucasb2b.imageliteapi.application.jwt;

import io.github.lucasb2b.imageliteapi.domain.AccessToken;
import io.github.lucasb2b.imageliteapi.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public AccessToken generateToken(User user){
        return new AccessToken("");
    }
}
