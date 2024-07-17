package com.beyond.board.author.domain;

import com.beyond.board.author.dto.AuthorDetailResDto;
import com.beyond.board.author.dto.AuthorResDto;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    public Author(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public AuthorResDto fromAuthor(){
        return new AuthorResDto(this.id,this.name,this.email,this.role);
    }
    public AuthorDetailResDto DetfromAuthor(){
        return new AuthorDetailResDto(this.id,this.name,this.email,this.password,this.role);
    }
}
