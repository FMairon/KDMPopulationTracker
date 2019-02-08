package kdmpopulationtracker;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;

import kdmpopulationtracker.repository.BaseCharacterRepository;
import kdmpopulationtracker.repository.StarsCharacterRepository;
import kdmpopulationtracker.repository.SunCharacterRepository;

@SpringBootApplication
public class KdmPopulationTrackerApplication {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		SpringApplication.run(KdmPopulationTrackerApplication.class, args);
		BaseCharacterRepository.initializeRepo();
		StarsCharacterRepository.initializeRepo();
		SunCharacterRepository.initializeRepo();
	}

}
