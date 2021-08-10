package com.myapp.backend.controller;

import com.myapp.backend.domain.dto.Result;
import com.myapp.backend.domain.dto.join.JoinDto;
import com.myapp.backend.domain.dto.mypage.ChangePasswordDto;
import com.myapp.backend.domain.dto.mypage.MyPageResultDto;
import com.myapp.backend.domain.entity.User;
import com.myapp.backend.service.JoinService;
import com.myapp.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final int SUCCESS = 1;
    private final int FAIL = -1;

    private UserService userService;

    @Autowired
    public ChatController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<String> retrieveUserProfileImg(@PathVariable String userId) {
        String findUser = userService.retrieveUser(userId).getProfileImg();

        if (findUser != null) {
            return new ResponseEntity<String>(findUser, HttpStatus.OK);
        }
        return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/stateCode/{userId}")
    public ResponseEntity<Integer> retrieveUserStateCode(@PathVariable String userId) {
        System.out.println("상태코드 확인");
        int stateCode = userService.retrieveUser(userId).getStateCode();
        System.out.println(stateCode);
        return new ResponseEntity<Integer>(stateCode, HttpStatus.OK);
    }
}


