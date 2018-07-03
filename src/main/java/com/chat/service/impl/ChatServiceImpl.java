package com.chat.service.impl;

import com.chat.dao.ChatDao;
import com.chat.entity.UserModel;
import com.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatDao chatDaoImpl;

    public boolean checkExist(UserModel user) {
        return chatDaoImpl.checkExist(user);
    }
}
