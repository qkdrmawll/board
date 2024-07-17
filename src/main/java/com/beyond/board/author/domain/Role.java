package com.beyond.board.author.domain;

public enum Role {
    USER("USER"),
    ADMIN("ADMIN");

    String role;

    Role(String role) {
        this.role = role;
    }

    public String value() {
        return role;
    }
}
