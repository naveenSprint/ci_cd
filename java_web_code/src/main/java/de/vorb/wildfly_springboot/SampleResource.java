package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() {
        return "Hello Team! This is a live Session of DevOps Automation of CI | CD by Naveen Kumar Muppala!";
    }

}
