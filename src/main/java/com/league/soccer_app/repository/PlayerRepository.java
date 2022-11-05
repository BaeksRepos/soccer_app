package com.league.soccer_app.repository;

import com.league.soccer_app.model.PlayerModel;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Component
@Repository
public class PlayerRepository implements RepositoryInterface {
    @Autowired
    private SqlSession sqlSession;

    protected static final String packageName = "com.league.soccer_app.repository";

    @Override

    public boolean insertPlayer(PlayerModel player) {

        sqlSession.insert("insertPlayer", player);

        return false;
    }

    @Override
    public ArrayList<PlayerModel> selectPlayers(int playerId) {
        return null;
    }

    @Override
    public ArrayList<PlayerModel> selectPlayers(String playerName) {
        return null;
    }

    @Override
    public boolean deletePlayer(int playerId) {
        return false;
    }

    @Override
    public boolean deletePlayer(String playerName) {
        return false;
    }
}
