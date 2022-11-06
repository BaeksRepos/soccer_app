package com.league.soccer_app.controller;

import com.league.soccer_app.model.PlayerModel;
import com.league.soccer_app.repository.PlayerRepository;
import com.league.soccer_app.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @RequestMapping(value = "insertPlayer", method = RequestMethod.POST)
    @ResponseBody
    public PlayerModel insertPlayers(@RequestBody PlayerModel player){

        PlayerService service = new PlayerService(repository);

        service.insertPlayer(player);

        System.out.println(111);

        return player;
    }

    @RequestMapping(value = "selectPlayer", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> selectPlayers(@RequestBody String playerName){

        System.out.println(playerName);

        PlayerService service = new PlayerService(repository);
        List<Map<String, Object>> players = service.selectPlayer(playerName);

        return players;
    }
}