package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import com.codeup.codeupspringblog.models.User;
import com.codeup.codeupspringblog.repositories.PostRepository;
import com.codeup.codeupspringblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }


    @GetMapping("/posts")
    public String posts(Model model) {
//        ArrayList<Post> posts = new ArrayList<>();
//        Post post1 = new Post(1, "Test Post", "Really cool post!");
//        Post post2 = new Post(2, "Second Post", "Also cool post!");
//        posts.add(post1);
//        posts.add(post2);
//        model.addAttribute("posts", posts);
        model.addAttribute("posts", postDao.findAll());

        return "posts/index";
    }


    @GetMapping("/posts/{id}")
    public String indPosts(@PathVariable long id, Model model) {
//        Post post = new Post(id, "Test Post", "Really cool post!");
//        model.addAttribute("post", post);
        model.addAttribute("post", postDao.findAdById(id));
        return "posts/show";
    }



    @GetMapping("/posts/create")
    public String viewCreatePostForm() {
//        model.addAttribute("post", new Post());
        return "posts/create";
    }
    //How will constructor know which field in html goes to which object property?  There is no req parem to specify


    @PostMapping("/posts/create")
    public String createPosts(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body) {
        User user = userDao.findUserById(1);
        Post post = new Post(
                title,
                body, user);
        postDao.save(post);
        return "redirect:/posts";
    }


}
