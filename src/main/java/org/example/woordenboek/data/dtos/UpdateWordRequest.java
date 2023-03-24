package org.example.woordenboek.data.dtos;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UpdateWordRequest {
    @NotNull
    @Min(1)
    Long id;
    @NotEmpty
    @Length(min = 1, max = 255)
    String word;
    @NotEmpty
    @Length(min = 1, max = 255)
    String translation;
}
