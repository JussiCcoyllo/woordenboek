package org.example.woordenboek.services.flows;

import org.example.woordenboek.data.dtos.CreateWordRequest;
import org.example.woordenboek.data.dtos.DeleteWordRequest;
import org.example.woordenboek.data.dtos.UpdateWordRequest;
import org.example.woordenboek.data.dtos.WordResponse;
import org.example.woordenboek.data.respositories.WordRepository;
import org.example.woordenboek.services.exceptions.WordException;
import org.example.woordenboek.services.mappers.WordMapperImpl;

import java.util.List;
import java.util.Optional;

public class WordServiceImpl implements WordService{
    private WordRepository wordRepository;
    private WordMapperImpl wordMapper;

    @Override
    public Long createWord(CreateWordRequest req) throws WordException {
        return null;
    }

    @Override
    public Long updateWord(UpdateWordRequest req) throws WordException {
        return null;
    }

    @Override
    public Long deleteWord(DeleteWordRequest req) throws WordException {
        return null;
    }

    @Override
    public List<WordResponse> getAllWords() {
        return null;
    }

    @Override
    public Optional<WordResponse> getWordById(Long id) {
        return Optional.empty();
    }
}
