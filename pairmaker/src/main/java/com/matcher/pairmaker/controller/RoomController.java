package com.matcher.pairmaker.controller;

import com.matcher.pairmaker.model.Room;
import com.matcher.pairmaker.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public Room createRoom(){
        return roomService.createRoom();
    }

}
