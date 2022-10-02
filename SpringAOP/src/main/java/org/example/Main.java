package org.example;

import org.example.config.ProjectConfig;
import org.example.models.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Nishal");
        comment.setText("Hello there!");
        commentService.publishComment(comment);
    }
}