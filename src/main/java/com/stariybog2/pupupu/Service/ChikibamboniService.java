package com.stariybog2.pupupu.Service;

import com.stariybog2.pupupu.Models.Chikibamboni;
import com.stariybog2.pupupu.Repository.ChikibamboniRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChikibamboniService {
    ChikibamboniRepository chikibamboniRepository;

    public ChikibamboniService(ChikibamboniRepository chikibamboniRepository) {
        this.chikibamboniRepository = chikibamboniRepository;
    }

    public ArrayList<Chikibamboni> getAll() {
        return chikibamboniRepository.getChikibambonis();
    }

    public Chikibamboni getChikibamboniById(int id) {
        return chikibamboniRepository.getChikibamboniById(id);
    }

    public boolean addChikibamboni(Chikibamboni chikibamboni) {
        return chikibamboniRepository.addChikibamboni(chikibamboni);
    }

    public boolean editChikibamboni(Chikibamboni chikibamboni) {
        return chikibamboniRepository.editChikibamboni(chikibamboni);
    }

    public boolean deleteChikibamboni(int id) {
        return chikibamboniRepository.deleteChikibamboni(id);
    }
}
