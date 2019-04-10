package com.example.user.remember_me.ModeloDAO.Interface;

import com.example.user.remember_me.ModeloVO.UserVO;

public interface IUserDAO {
    // Buscar por id
    UserVO getUser();
   // add User
    boolean addUser(UserVO user);
    int updateUser(UserVO user);
}
