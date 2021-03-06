package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloCardBadgesAttByTypDto {

    @JsonProperty("trello")
    private TrelloCardBadgesAttByTypTrelloDto trello ;
//    private TrelloCardBadgesAttByTypTrelloDto trello ;
}
