package org.example.woordenboek.data.dtos;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class DeleteWordRequest {
    @NotNull
    @Min(1)
    Long id;
}
