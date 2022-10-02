package org.example;

import org.example.config.ProjectConfig;
import org.example.models.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Nishal");
        comment.setText("Hello there!");
        String result = commentService.publishComment(comment);
        logger.info("The result was " + result);
    }
}