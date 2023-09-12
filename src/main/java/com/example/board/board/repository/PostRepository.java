package com.example.board.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

/**
 * 投稿のリポジトリー.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    public Optional<Post> findById(String id);

    List<Post> findAllByOrderByUpdatedDateDesc();

    List<Post> findByDeletedFalseOrderByUpdatedDateDesc();
}