package com.meme.repositories;

import com.meme.domain.CategoriaMeme;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CategoriaMemeRepository extends MongoRepository<CategoriaMeme, String> {

}
