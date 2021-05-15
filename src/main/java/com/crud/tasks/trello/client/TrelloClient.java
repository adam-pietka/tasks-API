package com.crud.tasks.trello.client;

import com.crud.tasks.domain.TrelloBoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TrelloClient {
    private final RestTemplate restTemplate;


    @Value("${trello.api.endpoint.prod}")
    private String trelloApiEndpoint;
    @Value("${trello.app.username}")
    private String trelloUsername;
    @Value("${trello.app.key}")
    private String trelloAppKey;
    @Value("${trello.app.token}")
    private String trelloToken;

    public List<TrelloBoardDto> getTrelloBoards() {
//        URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/adampietka2/boards")
//        URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/" + trelloUsername + "/boards")
//                .queryParam("key", trelloAppKey)
//                .queryParam("token", trelloToken)
//                .queryParam("fields", "name,id")
//                .build()
//                .encode()
//                .toUri();

        TrelloBoardDto[] boardsResponse = restTemplate.getForObject(buildUri(), TrelloBoardDto[].class);
//        TrelloBoardDto[] boardsResponse = restTemplate.getForObject(url, TrelloBoardDto[].class);

        return Optional.ofNullable(boardsResponse)
                .map(Arrays::asList)
                .orElse(Collections.emptyList());

    }
    private URI buildUri(){
        URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/" + trelloUsername + "/boards")
                .queryParam("key", trelloAppKey)
                .queryParam("token", trelloToken)
                .queryParam("fields", "name,id")
                .build()
                .encode()
                .toUri();

        return url;

    }
}

/*    public List<TrelloBoardDto> getTrelloBoards() {
        TrelloBoardDto[] boardsResponse = restTemplate.getForObject(
//                "https://api.trello.com/1/members/adampietka2/boards",
                trelloApiEndpoint + "members/adampietka2/boards" + "?key=" + trelloAppKey + "&token=" + trelloToken,
                TrelloBoardDto[].class);
    }*/
/*        if (boardsResponse !=null){
            return Arrays.asList(boardsResponse);
        }

        return Collections.emptyList(); // todo*/

