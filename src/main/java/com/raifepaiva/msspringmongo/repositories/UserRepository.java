package com.raifepaiva.msspringmongo.repositories;

import com.raifepaiva.msspringmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
