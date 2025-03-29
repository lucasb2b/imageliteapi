package io.github.lucasb2b.imageliteapi.application.users;

import io.github.lucasb2b.imageliteapi.domain.AccessToken;
import io.github.lucasb2b.imageliteapi.domain.entity.User;
import io.github.lucasb2b.imageliteapi.domain.exception.DuplicatedTupleException;
import io.github.lucasb2b.imageliteapi.domain.service.UserService;
import io.github.lucasb2b.imageliteapi.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public User save(User user) {
        var possibleUser = getByEmail(user.getEmail());
        if(possibleUser != null){
            throw new DuplicatedTupleException("User already exists!");
        }

        return userRepository.save(user);
    }

    @Override
    public AccessToken authenticate(String email, String password) {
        return null;
    }
}
