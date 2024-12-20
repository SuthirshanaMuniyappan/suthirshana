package reports;



import org.junit.After;
import org.junit.Before;

import io.cucumber.java.Scenario;

public class Report {

	@Before
	public void beforeScenerio(Scenario scenerio) {
		System.out.println("Starting scenerio: " + scenerio.getName());
	}

	@After
	public void afterScenerio(Scenario scenerio) {
		if (scenerio.isFailed()) {
			System.out.println("Scenerio failed: " + scenerio.getName());
		} else {
			System.out.println("Scenerio passed: " + scenerio.getName());
		}
	}		
}
