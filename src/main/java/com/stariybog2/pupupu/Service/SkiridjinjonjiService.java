package com.stariybog2.pupupu.Service;

import com.stariybog2.pupupu.Models.Skiridjinjonji;
import com.stariybog2.pupupu.Repository.SkiridjinjonjiRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SkiridjinjonjiService {
    SkiridjinjonjiRepository skiridjinjonjiRepository;

    public SkiridjinjonjiService(SkiridjinjonjiRepository skiridjinjonjiRepository) {
        this.skiridjinjonjiRepository = skiridjinjonjiRepository;
    }

    public ArrayList<Skiridjinjonji> getAll() {
        return skiridjinjonjiRepository.getSkiridjinjonjis();
    }

    public Skiridjinjonji getSkiridjinjonjiById(int id) {
        return skiridjinjonjiRepository.getSkiridjinjonjiById(id);
    }

    public boolean addSkiridjinjonji(Skiridjinjonji skiridjinjonji) {
        return skiridjinjonjiRepository.addSkiridjinjonji(skiridjinjonji);
    }

    public boolean editSkiridjinjonji(Skiridjinjonji skiridjinjonji) {
        return skiridjinjonjiRepository.editSkiridjinjonji(skiridjinjonji);
    }

    public boolean deleteSkiridjinjonji(int id) {
        return skiridjinjonjiRepository.deleteSkiridjinjonji(id);
    }
}
