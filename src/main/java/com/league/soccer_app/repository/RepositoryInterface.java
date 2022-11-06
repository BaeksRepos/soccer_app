package com.league.soccer_app.repository;

import com.league.soccer_app.model.PlayerModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface RepositoryInterface {
    boolean insertPlayer(PlayerModel player);
    ArrayList<PlayerModel> selectPlayers(int playerId);
    List<Map<String, Object>> selectPlayers(String playerName);
    boolean deletePlayer(int playerId);
    boolean deletePlayer(String playerName);
}
