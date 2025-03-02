package io.github.lucasb2b.imageliteapi.domain.service;

import io.github.lucasb2b.imageliteapi.domain.entity.Image;
import io.github.lucasb2b.imageliteapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Image save(Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);
}
