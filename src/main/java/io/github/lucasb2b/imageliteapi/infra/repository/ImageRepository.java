package io.github.lucasb2b.imageliteapi.infra.repository;

import io.github.lucasb2b.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
