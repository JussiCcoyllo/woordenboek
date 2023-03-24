package org.example.woordenboek.data.respositories;

import org.example.woordenboek.data.entities.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<WordEntity, Long> {

}
