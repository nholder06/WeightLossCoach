package org.launchcode.WeightLossCoach.data;

import org.launchcode.WeightLossCoach.models.newClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewClientRepository extends MongoRepository<newClient, Integer> {
}
