package sai.service.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DockerDemoController {

    @GetMapping("/docker/hello")
    public String demoPrint(){
        return "Hello docker";
    }
}
