package com.crud.tasks.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Data
public class TrelloCardDto {
    private String name ;
    private String description;
    private String pos;
    private String listId;

    @Value("${trello.api.endpoint.prod}")
    private String trelloApiEndpoint;
    @Value("${trello.app.key}")
    private String trelloAppKey;
    @Value("${trello.app.token}")
    private String trelloToken;


}
