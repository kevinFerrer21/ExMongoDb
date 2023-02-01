package it.develhope.ExMongoDb.reposirories;

import it.develhope.ExMongoDb.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
