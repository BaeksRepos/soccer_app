package com.league.soccer_app.repository;

import com.league.soccer_app.model.PlayerModel;

import java.util.ArrayList;

public interface RepositoryInterface {
    boolean insertPlayer(PlayerModel player);
    ArrayList<PlayerModel> selectPlayers(int playerId);
    ArrayList<PlayerModel> selectPlayers(String playerName);
    boolean deletePlayer(int playerId);
    boolean deletePlayer(String playerName);
}
