package com.league.soccer_app.controller;

import com.league.soccer_app.model.PlayerModel;
import com.league.soccer_app.repository.PlayerRepository;
import com.league.soccer_app.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @RequestMapping(value = "insertPlayer", method = RequestMethod.POST)
    @ResponseBody
    public PlayerModel insertPlayers(@RequestBody PlayerModel player){

        PlayerService service = new PlayerService(repository);

        service.insertPlayer(player);

        return player;
    }
}
