package com.udea;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class MicroservicesUdeaReservationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUdeaReservationsApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init(ReservationRepository repository) {
		return args ->{
			Stream.of("Luis", "Yurani", "Jose", "Alicia").forEach(name -> {
				Reservation reservation = new Reservation();
				reservation.setReservationName(name);;
				repository.save(reservation);
			});
		};
	}
}
