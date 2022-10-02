package com.springbook;

import com.springbook.config.ProjectConfig;
import com.springbook.model.Comment;
import com.springbook.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Jane");
        comment.setText("Hello there!!");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
        commentService.editComment(comment);
        commentService.deleteComment(comment);

    }

}