package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String indPosts() {
        return "view an individual post";
    }
//    Note: (@PathVariable Long id)

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewCreatePostForm() {
        return "view the form for creating a post";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPosts() {
        return "create a new post";
    }

//    Note: @PostMapping

}
