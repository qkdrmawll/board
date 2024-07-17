package com.beyond.board.author.dto;

import com.beyond.board.author.domain.Role;
import lombok.Data;

@Data
public class AuthorDetailResDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Role role;

    public AuthorDetailResDto(Long id, String name, String email, String password, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
