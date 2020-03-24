package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() {
        return "Hello World! This is to showcase DevOps Automation CI CD through Boot Camp by Naveen Kumar Muppala!";
    }

}
