package org.launchcode.WeightLossCoach.data;


import org.launchcode.WeightLossCoach.models.NewClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NewClientRepository extends CrudRepository<NewClient, Integer> {
}