package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import com.codeup.codeupspringblog.models.User;
import com.codeup.codeupspringblog.repositories.PostRepository;
import com.codeup.codeupspringblog.repositories.UserRepository;
import com.codeup.codeupspringblog.services.EmailService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    private final EmailService emailService;

    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailService) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
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
        model.addAttribute("post", postDao.findPostById(id));
        return "posts/show";
    }



    @GetMapping("/posts/create")
    public String viewCreatePostForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }


    @PostMapping("/posts/create")
    public String createPosts(@ModelAttribute Post post) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        post.setUser(user);
        System.out.println("user = " + post.getUser().getId());
        postDao.save(post);
        emailService.prepareAndSend(post);
        return "redirect:/posts";

//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        Post origPost = postDao.findPostById(post.getId());
//        if(user.getId() == origPost.getUser().getId()) {
//            post.setUser(user);
//            postDao.save(post);
//            emailService.prepareAndSend(post);
//        }
//        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable long id, Model model){
//        model.addAttribute("post", postDao.findPostById(id));
//        return "posts/create";

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Post post = postDao.findPostById(id);
        if (user.getId() == post.getUser().getId()) {
            model.addAttribute("post", post);
            return "posts/create";
        } else {
            return "redirect:/posts";
        }
    }



}
