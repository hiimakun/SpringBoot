package com.hiimakun.Gallery.controllers;

import com.hiimakun.Gallery.entities.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/")
public class GalleryController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment environment;

    @RequestMapping("/")
    public String home() {
        // This is useful for debugging
        // When having multiple instance of gallery service running at different ports.
        // We load balance among them, and display which instance received the request.
        return "Hello from Gallery Service running at port: " + environment.getProperty("local.server.port");
    }
    @PostMapping("/{id}")
    public Gallery gallery(@PathVariable final int id){
        Gallery gallery = new Gallery();
        gallery.setGalleryId(id);

        List<Object> image = restTemplate.getForObject("http://IMAGE-SERVICE/images/",List.class);
        gallery.setImage(image);

        return gallery;
    }
}
