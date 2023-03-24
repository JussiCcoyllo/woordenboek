package org.example.woordenboek.data.dtos;

import lombok.Data;
import org.example.woordenboek.data.entities.WordEntity;

@Data
public class CreateWordRequest {
     Long id;
     String word;
     String translation;
}
