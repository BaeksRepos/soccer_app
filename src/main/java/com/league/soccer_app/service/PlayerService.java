package com.league.soccer_app.service;

import com.league.soccer_app.model.PlayerModel;
import com.league.soccer_app.repository.PlayerRepository;
import com.league.soccer_app.repository.RepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PlayerService {
    private RepositoryInterface repository;

    public PlayerService(RepositoryInterface repositoryInterface){
        this.repository = repositoryInterface;
    }

    public void insertPlayer(PlayerModel player){
        int a = this.repository.insertPlayer(player);
        System.out.println("id: " + a);

    }

    public List<Map<String, Object>> selectPlayer(String playerName){
        return this.repository.selectPlayers(playerName);
    }

}
