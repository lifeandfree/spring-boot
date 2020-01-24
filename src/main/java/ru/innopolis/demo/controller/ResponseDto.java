package ru.innopolis.demo.controller;

/**
 * ResponseDto.
 *
 * @author lifeandfree
 */
public class ResponseDto {

    private String name;

    public ResponseDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
