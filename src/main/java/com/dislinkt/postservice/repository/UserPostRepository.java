package com.dislinkt.postservice.repository;

import com.dislinkt.postservice.model.UserPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost, Long> {
    List<UserPost> findByUsernameInOrderByPostDateDesc(List<String> names);
}
