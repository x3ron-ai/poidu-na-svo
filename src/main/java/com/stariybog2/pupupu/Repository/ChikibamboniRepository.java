package com.stariybog2.pupupu.Repository;
import com.stariybog2.pupupu.Models.Chikibamboni;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ChikibamboniRepository {
    AtomicInteger idCounter = new AtomicInteger(1);
    ArrayList<Chikibamboni> chikibambonis = new ArrayList<>();

    public ArrayList<Chikibamboni> getChikibambonis() {
        return chikibambonis;
    }

    public Chikibamboni getChikibamboniById(int id) {
        return chikibambonis.stream().filter(chikibamboni -> chikibamboni.getId() == id).findFirst().orElse(null);
    }

    public boolean addChikibamboni(Chikibamboni chikibamboni) {
        chikibamboni.setId(idCounter.getAndIncrement());
        chikibambonis.add(chikibamboni);
        return true;
    }

    public boolean editChikibamboni(Chikibamboni chikibamboni) {
        for (int i = 0; i < chikibambonis.size(); i++) {
            if (chikibambonis.get(i).getId() == chikibamboni.getId()) {
                chikibambonis.set(i, chikibamboni);
                return true;
            }
        }
        return false;
    }

    public boolean deleteChikibamboni(int id) {
        return chikibambonis.removeIf(skiridjinjonji -> skiridjinjonji.getId() == id);
    }
}
