package org.example.woordenboek.data.respositories;

import org.example.woordenboek.data.entities.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<WordEntity, Long> {
    List<WordRepository> findWordsByWordAndTranslation(String word, String translation);
}
