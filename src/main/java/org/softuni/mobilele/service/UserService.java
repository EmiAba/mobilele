package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.UserLoginDto;
import org.softuni.mobilele.model.dto.UserRegistrationDTO;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);

    boolean loginUser(UserLoginDto userLoginDto);

    void logoutUser();
}
