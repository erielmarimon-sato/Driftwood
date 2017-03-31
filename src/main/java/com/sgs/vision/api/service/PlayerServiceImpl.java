package com.sgs.vision.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Player;
import com.sgs.vision.storage.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired private PlayerRepository playerRepository;

    @Override
    public Player createPlayer(String name, String username, String password) {
        
        Player player = new Player();
        player.setName(name);
        player.setUsername(username);
        // comment out to encrypt password
        // password = DigestUtils.md5DigestAsHex(password.getBytes());
        player.setPassword(password); 
        player.setTotalGoals(0);
        player.setTotalAssists(0);
        player.setTotalGames(0);
        player.setEffectiveness(0);
        player.setActive(true);
        player.setPlayingSince(new Date());
        player.setLastDayPlayed(new Date());
        
        return playerRepository.save(player);
    }

    @Override
    public List<PlayerDto> getPlayers(String name, String username, boolean active) {
        // TODO Auto-generated method stub
        List<PlayerDto> players = playerRepository.search(name, username, active);
        return players;
    }

    @Override // should throw PlayerNotFound
    public PlayerDto getPlayer(String id) throws Exception {
        PlayerDto player = playerRepository.findByPlayerId(id);
        if(player == null) throw new Exception("Player not found");
        return player;
    }

    @Override
    public Player updatePlayer(
            String id,
            String name, 
            String username, 
            String totalGoals, 
            String assists, 
            String totalGames,
            String effectiveness, 
            String lastDayPlayed) {
        
        System.out.println("Updating player with id : " + id);
        
        return playerRepository.updatePlayer(id, name, username, 
                totalGoals, assists, totalGames, effectiveness, lastDayPlayed);
    }
    
}
