package com.big.ssm.controller;

import com.big.ssm.pojo.Room;
import com.big.ssm.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.big.ssm.dao.*;

import java.util.List;


@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomService roomService;
    @RequestMapping("/allroom")
    public ModelAndView getAllRoom(){
        System.out.println(roomService);
        List<Room> list = roomService.getAllRoom();
        ModelAndView modelAndView = new ModelAndView("room");
        modelAndView.addObject("allRoom",list);
        return modelAndView;
    }

//    插入数据的请求
    @RequestMapping("/addroom")
    public ModelAndView addRoom(Room room){
        int flag = roomService.addRoom(room);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView = getAllRoom();
//        modelAndView.addObject("flag",flag);
//        modelAndView.setViewName("addroom");
        return modelAndView;
    }

//    删除页面
    @RequestMapping("/deleteroom")
    public ModelAndView deleteRoom(Room room){
        int result = roomService.deleteRoom(room);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView = getAllRoom();
//        modelAndView.addObject("result",result);
//        modelAndView.setViewName("deleteroom");
        return modelAndView;
    }

    //删除中转
    @RequestMapping("/getdeleteroom")
    public String getDeleteRoomUrl(){
        return "deleteroom";
    }
    //中转页面
    @RequestMapping("/getaddroom")
    public String getAddRoomUrl(){
        return "addroom";
    }
}
