package org.example.woordenboek.data.dtos;

import lombok.Value;

@Value
public class WordResponse {
     Long id;
     String word;
     String translation;

}
