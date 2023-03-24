package org.example.woordenboek.data.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DeleteWordRequest {
    @NotNull
    @Min(1)
    Long id;
}
