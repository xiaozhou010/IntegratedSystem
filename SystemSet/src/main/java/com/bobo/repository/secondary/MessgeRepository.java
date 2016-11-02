package com.bobo.repository.secondary;

import com.bobo.domain.secondary.Messge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhouyongbo on 2016/9/30.
 */
@Repository
public interface MessgeRepository extends JpaRepository<Messge,Integer>{
}
