package com.bobo.repository.primary;

import com.bobo.domain.primary.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhouyongbo on 2016/9/30.
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Integer>{
}
