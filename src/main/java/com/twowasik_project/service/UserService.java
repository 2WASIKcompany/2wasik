package com.twowasik_project.service;

import com.twowasik_project.model.Chat;
import com.twowasik_project.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User findByEmail(String email);

    User findByUsername(String username);

    String getUsersId(String participants, String admin);

    void addTeam(String teamId, String usersId);

    List<Integer> getTeams(String name);

    void addChat(String teamId, String usersId);

    List<Integer> getChats(int id);
}