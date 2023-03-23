package com.meme.repositories;

import com.meme.domain.Meme;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MemeRepository extends MongoRepository<Meme, String> {

}
