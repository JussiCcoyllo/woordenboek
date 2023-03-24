package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.CreateWordRequest;
import org.example.woordenboek.data.dtos.DeleteWordRequest;
import org.example.woordenboek.data.dtos.UpdateWordRequest;
import org.example.woordenboek.data.dtos.WordResponse;
import org.example.woordenboek.data.entities.WordEntity;
import org.example.woordenboek.data.repositories.WordRepository;

import java.util.List;
import java.util.stream.Collectors;

public class WordMapperImpl implements WordMapper{
    private WordRepository repository;

    @Override
    public WordResponse toResponse(WordEntity entity) {
        WordResponse res = new WordResponse(
            entity.getId(),
            entity.getWord(),
            entity.getTranslation()
        );
        return res;
    }

    @Override
    public WordEntity toEntity(CreateWordRequest req) {
        WordEntity entity = new WordEntity();
        entity.setWord(req.getWord());
        entity.setTranslation(req.getTranslation());
        return entity;
    }

    @Override
    public WordEntity toEntity(UpdateWordRequest req) {
        WordEntity entity = new WordEntity();
        entity.setTranslation(req.getTranslation());
        entity.setWord(req.getWord());
        return entity;
    }

    @Override
    public WordEntity toEntity(DeleteWordRequest req) {
        WordEntity entity = new WordEntity();
        entity.getId();
        return entity;
    }

    @Override
    public WordResponse toEntity(WordEntity ent) {
        WordResponse response = new WordResponse(
                ent.getId(),
                ent.getWord(),
                ent.getTranslation()
        );
        return response;
    }

    @Override
    public List<WordResponse> toResponses(List<WordEntity> entities) {
        return entities.stream().map(this::toResponse).collect(Collectors.toUnmodifiableList());
    }
}
