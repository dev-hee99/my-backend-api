package com.devhee.mybackendapi.cotroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class apiController {
    @RequestMapping(value = "/api/helloworld",method = RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public String helloworld(){
        return "HelloWorld";
    }

    @GetMapping("/run")
    public String test(){
        return "서버가 정상적으로 운영됩니다.";
    }
}
