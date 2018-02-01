package springboot.animated.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static springboot.animated.banner.TerminalColors.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		for(String bg : ALL_BACKGROUNDS) {
			for(String fg: ALL_FOREGROUNDS) {
				System.out.println(bg + fg + "---+ TEST +---" + COLOR_RESET);
			}
		}

	}
}
