package com.twowasik_project.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data @Component
public class ShowChatsDto {
    int id;
    String chat_type;
}