package org.seckill.service;

import org.seckill.entity.User;

import javax.jms.Destination;

public interface UserAccountService {
	void register(User user);

	void login(User user);

	void sendMsgForLogin(Destination destination,final User user);
}
