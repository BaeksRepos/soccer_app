package com.league.soccer_app.service;

import com.league.soccer_app.model.PlayerModel;
import com.league.soccer_app.repository.PlayerRepository;
import com.league.soccer_app.repository.RepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private RepositoryInterface repository;

    public PlayerService(RepositoryInterface repositoryInterface){
        this.repository = repositoryInterface;
    }

    public void insertPlayer(PlayerModel player){
        this.repository.insertPlayer(player);

    }

}
