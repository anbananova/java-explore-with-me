package ru.yandex.practicum.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompilationDto {
    private List<EventShortDto> events;

    @NotNull
    private Long id;

    @NotNull
    private boolean pinned;

    @NotNull
    private String title;
}
