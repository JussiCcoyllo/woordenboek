package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.CreateWordRequest;
import org.example.woordenboek.data.dtos.DeleteWordRequest;
import org.example.woordenboek.data.dtos.UpdateWordRequest;
import org.example.woordenboek.data.dtos.WordResponse;
import org.example.woordenboek.data.entities.WordEntity;

import java.util.List;

public class WordMapperImpl implements WordMapper{
    @Override
    public WordResponse toResponse(WordEntity entity) {
        return null;
    }

    @Override
    public WordEntity toEntity(CreateWordRequest req) {
        return null;
    }

    @Override
    public WordEntity toEntity(UpdateWordRequest req) {
        return null;
    }

    @Override
    public WordEntity toEntity(DeleteWordRequest req) {
        return null;
    }

    @Override
    public WordResponse toEntity(WordEntity ent) {
        return null;
    }

    @Override
    public List<WordResponse> toResponses(List<WordEntity> entities) {
        return null;
    }
}
