package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloCardBadgesDto {

    @JsonProperty("votes")
    private int vote;

    @JsonProperty("attachmentsByType")
    private TrelloCardBadgesAttByTypDto attachments;

}
