package com.springboot.blog.service;

import com.springboot.blog.payload.LoginDto;
import com.springboot.blog.payload.RegisterDto;

public interface AuthServiceForLogin {

    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
