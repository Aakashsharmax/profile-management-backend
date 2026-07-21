package com.aakash.profile_service.service;

import com.aakash.profile_service.model.Profile;
import com.aakash.profile_service.repository.ProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository repository;
    private final CloudinaryService cloudinaryService;

    public ProfileService(ProfileRepository repository,
                          CloudinaryService cloudinaryService) {

        this.repository = repository;
        this.cloudinaryService = cloudinaryService;
    }

    public List<Profile> getAllProfiles() {
        return repository.findAll();
    }

    public Profile getProfileById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteProfile(String id) {
        repository.deleteById(id);
    }

    public Profile saveProfile(String name,
                               String email,
                               String phone,
                               MultipartFile image) throws IOException {

        Profile profile = new Profile();

        profile.setName(name);
        profile.setEmail(email);
        profile.setPhone(phone);

        if (image != null && !image.isEmpty()) {
            String imageUrl = cloudinaryService.uploadImage(image);
            profile.setProfileImage(imageUrl);
        }

        return repository.save(profile);
    }
}