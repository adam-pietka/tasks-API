package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Data
public class TrelloCardDto {
    private String name ;
    private String description;
    private String pos;
    private String listId;

}
