package com.poolsawat.api.gsb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poolsawat.api.gsb.entity.Profile;
import com.poolsawat.api.gsb.repository.ProfileRepository;

@RestController
@RequestMapping(path="/profile")
public class MainController {
	
	@Autowired
	private ProfileRepository profileRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String fname, @RequestParam String lname,@RequestParam Integer age) {

		Profile n = new Profile();
		n.setFname(fname);
		n.setLname(lname);
		n.setAge(age);
		profileRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Profile> getAllUsers() {
		return profileRepository.findAll();
	}
}