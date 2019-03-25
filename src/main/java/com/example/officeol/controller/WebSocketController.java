package com.example.officeol.controller;

//import com.example.officeol.service.MyWebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WebSocketController {
    @RequestMapping(value = "/websocket/{userId}/{fileId}")
    public String websocket(@PathVariable("userId") String userId, @PathVariable("fileId") String fileId, Model model) {
       try{
           model.addAttribute("userId",userId);
           model.addAttribute("fileId",fileId);
           return "websocket";
       }catch (Exception e){
           e.printStackTrace();
           return "error";
       }
    }

    //http://localhost:8080/ws
  //  @MessageMapping("/welcome")//浏览器发送请求通过@messageMapping 映射/welcome 这个地址。
    //服务器端有消息时,会订阅@SendTo 中的路径的浏览器发送消息。
//    @SendTo("/topic/getResponse")
//    public Response say(Message message) throws Exception {
//        Thread.sleep(100);
//        if (ws.findKeySheet(message) == null) {
//            ws.addNewSheet(message);
//        }
//        if (ws.findKeyUser(message) == null) {
//            ws.addNewUser(message);
//        }
//        ws.normalOperation(message);
//        ws.display();
//        return ws.sendMessage(message);
//    }
}

