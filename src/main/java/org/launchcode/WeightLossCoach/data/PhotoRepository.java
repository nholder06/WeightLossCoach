package org.launchcode.WeightLossCoach.data;

import org.launchcode.WeightLossCoach.models.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.validation.constraints.Null;

public interface PhotoRepository extends MongoRepository<Photo, Null> { }
