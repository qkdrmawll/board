package com.beyond.board.author.controller;

import com.beyond.board.author.dto.AuthorCreateReqDto;
import com.beyond.board.author.dto.AuthorDetailResDto;
import com.beyond.board.author.dto.AuthorResDto;
import com.beyond.board.author.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;
    @PostMapping("/author/create")
    public AuthorResDto authorCreate(AuthorCreateReqDto dto) {
        System.out.println("controller");
        return authorService.authorCreate(dto);
    }
    @GetMapping("/list")
    public List<AuthorResDto> authorList() {
        return authorService.authorList();
    }
    @GetMapping("/{id}")
    public AuthorDetailResDto authorDetail(@PathVariable Long id) {
        return authorService.authorDetail(id);
    }
}
