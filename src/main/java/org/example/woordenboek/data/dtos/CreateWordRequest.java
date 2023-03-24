package org.example.woordenboek.data.dtos;

import lombok.Data;

@Data
public class CreateWordRequest {
     String word;
     String translation;
}
