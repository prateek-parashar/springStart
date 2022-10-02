package org.springbook.dao;

import org.springbook.models.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository{

    @Override
    public void saveComment(Comment comment) {
        System.out.println("Saving the comment in the database by the author " + comment.getAuthor());
    }
}
