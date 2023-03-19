package com.meme.repositories;

import com.meme.domain.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<Meme, Long> {

}
