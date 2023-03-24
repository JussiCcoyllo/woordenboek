package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.CreateWordRequest;
import org.example.woordenboek.data.dtos.DeleteWordRequest;
import org.example.woordenboek.data.dtos.UpdateWordRequest;
import org.example.woordenboek.data.dtos.WordResponse;
import org.example.woordenboek.data.entities.WordEntity;

import java.util.List;

public interface WordMapper {
    WordResponse toResponse(WordEntity entity);

    WordEntity toEntity(CreateWordRequest req);
    WordEntity toEntity(UpdateWordRequest req);
    WordEntity toEntity(DeleteWordRequest req);

    WordResponse toEntity(WordEntity ent);
    List<WordResponse> toResponses(List<WordEntity> entities);
}
