package org.example.woordenboek.data.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name="woordendb")

public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name = "Dutch")
    private String word;
    @Column(name="English")
    private String translation;

    public WordEntity() {
    }

    public WordEntity(Long id, String word, String translation) {
        this.id = id;
        this.word = word;
        this.translation = translation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordEntity)) return false;
        WordEntity that = (WordEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word);
    }

    @Override
    public String toString() {
        return "WordEntity{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
