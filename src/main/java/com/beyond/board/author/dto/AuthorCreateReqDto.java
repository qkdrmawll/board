package com.beyond.board.author.dto;

import com.beyond.board.author.domain.Author;
import com.beyond.board.author.domain.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorCreateReqDto {
    private String name;
    private String email;
    private String password;
    private String role;

    public Author toEntity() {
        System.out.println("good");
        Role EntityRole;
        if (role.equals("ADMIN")) {
            EntityRole = Role.ADMIN;
        }else {
            EntityRole = Role.USER;
        }
        return new Author(this.name,this.email,this.password,EntityRole);
    }
}
