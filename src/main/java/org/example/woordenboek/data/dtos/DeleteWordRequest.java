package org.example.woordenboek.data.dtos;


import lombok.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Value
public class DeleteWordRequest {
    @NotNull
    @Min(1)
    Long id;
}
