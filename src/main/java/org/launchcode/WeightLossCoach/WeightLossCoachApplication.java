package org.launchcode.WeightLossCoach;

//import org.launchcode.WeightLossCoach.models.MongoDbConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(MongoDbConfig.class)
@SpringBootApplication
public class WeightLossCoachApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeightLossCoachApplication.class, args);
	}

}

