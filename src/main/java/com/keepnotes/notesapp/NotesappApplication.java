package com.keepnotes.notesapp;

import com.keepnotes.notesapp.com.keepnotes.notesapp.model.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class NotesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesappApplication.class, args);
	}

	@GetMapping()

	public List<Task> hello() {
		return List.of(
				new Task("Jayan", LocalDate.of(2024, Month.JULY,24),"Loremipsum20","high","Pending","Do it today")
		);
	}

}
