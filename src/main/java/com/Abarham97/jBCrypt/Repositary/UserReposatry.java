package com.Abarham97.jBCrypt.Repositary;

import com.Abarham97.jBCrypt.UserSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposatry extends JpaRepository<UserSite,Long> {

UserSite findByUserName(String userName);

}
