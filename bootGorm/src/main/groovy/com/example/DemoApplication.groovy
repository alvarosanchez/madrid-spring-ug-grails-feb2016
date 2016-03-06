package com.example

import grails.persistence.Entity
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@SpringBootApplication
class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run DemoApplication, args
	}
}

@Entity
class Team {
	String name
}

@Component
@Transactional
class BootStrap implements CommandLineRunner {

	@Override
	void run(String... args) throws Exception {
		println()
		new Team(name: "Real Madrid C.F.").save()
		Team barcelona = new Team(name: "F.C. Barcelona").save()

		println Team.list()

		barcelona.delete(flush: true)
		assert Team.count() == 1
		println()
	}
}
