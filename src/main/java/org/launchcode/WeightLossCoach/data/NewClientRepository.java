package org.launchcode.WeightLossCoach.data;

import org.bson.types.ObjectId;
import org.launchcode.WeightLossCoach.models.NewClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NewClientRepository extends MongoRepository<NewClient,String> {
    NewClient findBy_id(ObjectId _id);
}