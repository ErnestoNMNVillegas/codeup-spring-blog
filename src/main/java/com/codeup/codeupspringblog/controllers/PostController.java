package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String posts(Model model) {
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post(1, "Test Post", "Really cool post!");
        Post post2 = new Post(2, "Second Post", "Also cool post!");
        posts.add(post1);
        posts.add(post2);
        System.out.println("posts = " + posts.toString());
        model.addAttribute("posts", posts);
        return "posts/index";
    }


    @GetMapping("/posts/{id}")
    public String indPosts(@PathVariable long id, Model model) {
        Post post = new Post(id, "Test Post", "Really cool post!");
        model.addAttribute("post", post);
        return "posts/show";
    }

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

//

}
