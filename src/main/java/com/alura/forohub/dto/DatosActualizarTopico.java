package com.alura.forohub.dto;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull String titulo,
        @NotNull String mensaje
) {
}
