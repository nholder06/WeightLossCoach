package org.launchcode.WeightLossCoach.data;

import org.launchcode.WeightLossCoach.models.TestimonialClient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestimonialClientRepository extends MongoRepository<TestimonialClient, String> {
}
