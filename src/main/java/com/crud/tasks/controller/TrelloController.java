package com.crud.tasks.controller;

import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.trello.client.TrelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/trello")
@RequiredArgsConstructor
public class TrelloController {

    private final TrelloClient trelloClient;

    @GetMapping("getTrelloBoards")
    public void getTrelloBoards() { // zamianst void ma być List<TrelloBoardDto>

        // GET request
        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();

        trelloBoards.forEach(trelloBoardDto -> {
            System.out.println(trelloBoardDto.getId() + " - " + trelloBoardDto.getName());

            System.out.println("This board contains lists: ");

            trelloBoardDto.getLists().forEach(trelloList -> {
                System.out.println(
                        trelloList.getName() + " - " + trelloList.getId() + " - " + trelloList.isClosed()
                );
            });
        });
/*
        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();
        trelloBoards.stream()
                .filter(trelloBoardDto -> trelloBoardDto.getName().toUpperCase().contains("KODILLA"))
                .filter(trelloBoardDto -> (trelloBoardDto.getId().length()) > 0 )
                .forEach(e->{
                    System.out.println(e.getId() + " - " + e.getName());
                });
*/

        /*trelloBoards.forEach(trelloBoardDto -> {
            System.out.println(trelloBoardDto.getId() + " " + trelloBoardDto.getName());
        });*/
    }
}