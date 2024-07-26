
package com.wipro.doctorsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.doctorsapp.entity.Doctor;
import com.wipro.doctorsapp.service.DoctorService;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

	@Autowired
	private DoctorService<?> doctorService;

	@GetMapping("/all")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}

	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable Long id) {
		return doctorService.getDoctorById(id);
	}

	@PostMapping("/")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctorService.createDoctor(doctor);
	}

	@PutMapping("/{id}")
	public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
		return doctorService.updateDoctor(id, doctor);
	}

	@DeleteMapping("/{id}")
	public void deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);
	}

}