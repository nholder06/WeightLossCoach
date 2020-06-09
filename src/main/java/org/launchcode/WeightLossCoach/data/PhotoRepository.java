package org.launchcode.WeightLossCoach.data;

import org.launchcode.WeightLossCoach.models.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> { }
