package com.beyond.board.author.service;

import com.beyond.board.author.domain.Author;
import com.beyond.board.author.dto.AuthorCreateReqDto;
import com.beyond.board.author.dto.AuthorDetailResDto;
import com.beyond.board.author.dto.AuthorResDto;
import com.beyond.board.author.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    public AuthorResDto authorCreate(AuthorCreateReqDto dto) {
        System.out.println("service");
        Author author = dto.toEntity();
        return authorRepository.save(author).fromAuthor();
    }

    public List<AuthorResDto> authorList() {
        List<AuthorResDto> dtos = new ArrayList<>();
        for (Author author : authorRepository.findAll()) {
            dtos.add(author.fromAuthor());
        }
        return dtos;
    }

    public AuthorDetailResDto authorDetail(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("author가 없습니다."));
        return author.DetfromAuthor();
    }
}
