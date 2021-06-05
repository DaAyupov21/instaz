package ru.damayupov.instaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.damayupov.instaz.entity.Comment;
import ru.damayupov.instaz.entity.Post;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost (Post post);
    Comment findByIdAndUserId(Long commentId, Long userId);
;}
