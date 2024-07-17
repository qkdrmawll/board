package com.beyond.board.author.dto;

import com.beyond.board.author.domain.Role;
import lombok.Data;

@Data
public class AuthorResDto {
    private Long id;
    private String name;
    private String email;
    private Role role;

    public AuthorResDto(Long id, String name, String email, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }
}
