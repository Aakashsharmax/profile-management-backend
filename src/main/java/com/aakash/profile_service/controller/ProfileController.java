package com.aakash.profile_service.controller;

import com.aakash.profile_service.model.Profile;
import com.aakash.profile_service.service.ProfileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    @GetMapping("/{id}")
    public Profile getProfileById(@PathVariable String id) {
        return profileService.getProfileById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProfile(@PathVariable String id) {
        profileService.deleteProfile(id);
        return "Profile Deleted Successfully";
    }

    @PostMapping(consumes = {"multipart/form-data"})
    public Profile saveProfile(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("phone") String phone,
            @RequestParam(value = "image", required = false) MultipartFile image
    ) throws IOException {

        return profileService.saveProfile(name, email, phone, image);
    }
}