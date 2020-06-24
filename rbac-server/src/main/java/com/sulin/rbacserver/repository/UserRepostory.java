package com.sulin.rbacserver.repository;

import com.sulin.rbacserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostory extends JpaRepository<User,Long> {
}
