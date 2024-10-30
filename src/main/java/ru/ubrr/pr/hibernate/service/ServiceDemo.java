package ru.ubrr.pr.hibernate.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ubrr.pr.hibernate.domain.Comment;
import ru.ubrr.pr.hibernate.domain.Post;
import ru.ubrr.pr.hibernate.repo.PostRepo;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ServiceDemo {
    private final PostRepo postRepo;

    public void demo() {
        Post post = new Post();
        post.setId(1L);
        post.setTitle("1post");
        postRepo.save(post);

        Post postLazy = postRepo.findById(1L).orElseThrow();
        log.info("Post title: " + postLazy.getTitle());

        postRepo.deleteAll();

        List<Comment> commentsLazy = postLazy.getComments();

        if (commentsLazy != null) {
            log.info("Количество комментов " + commentsLazy.size());
        }
    }
}
