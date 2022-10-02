package org.springbook;

import org.springbook.configuration.ProjectConfig;
import org.springbook.models.Comment;
import org.springbook.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Jane");
        comment.setText("Hello there");
        commentService.publishComment(comment);
        var springComment = context.getBean(Comment.class);
        var com2 = context.getBean(Comment.class);

        System.out.println(com2 == springComment);

    }

}