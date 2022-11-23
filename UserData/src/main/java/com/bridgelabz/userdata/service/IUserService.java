package com.bridgelabz.userdata.service;

import com.bridgelabz.userdata.dto.UserDTO;
import com.bridgelabz.userdata.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    UserEntity saveData(UserDTO user);

    List<UserEntity> getAllData();

    Optional<UserEntity> getById(int id);

    UserEntity getByEmail(String email);

    UserEntity forgotpassword(UserDTO user, int id);

    UserEntity editData(UserDTO user, String email);

    String addRecord(UserDTO user) throws Exception;


    UserEntity findByToken(String token);

    String loginUser(String email, String password);

    UserEntity getDetailsById(int id);
}
