package org.example.woordenboek.data.dtos;

import lombok.Value;

@Value
public class CreateWordRequest {
     String word;
     String translation;
}
