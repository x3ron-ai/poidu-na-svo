package com.stariybog2.pupupu.Repository;
import com.stariybog2.pupupu.Models.Skiridjinjonji;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SkiridjinjonjiRepository {
    AtomicInteger idCounter = new AtomicInteger(1);
    ArrayList<Skiridjinjonji> skiridjinjonjis = new ArrayList<>();

    public ArrayList<Skiridjinjonji> getSkiridjinjonjis() {
        return skiridjinjonjis;
    }

    public Skiridjinjonji getSkiridjinjonjiById(int id) {
        return skiridjinjonjis.stream().filter(skiridjinjonji -> skiridjinjonji.getId() == id).findFirst().orElse(null);
    }

    public boolean addSkiridjinjonji(Skiridjinjonji skiridjinjonji) {
        skiridjinjonji.setId(idCounter.getAndIncrement());
        skiridjinjonjis.add(skiridjinjonji);
        return true;
    }

    public boolean editSkiridjinjonji(Skiridjinjonji skiridjinjonji) {
        for (int i = 0; i < skiridjinjonjis.size(); i++) {
            if (skiridjinjonjis.get(i).getId() == skiridjinjonji.getId()) {
                skiridjinjonjis.set(i, skiridjinjonji);
                return true;
            }
        }
        return false;
    }

    public boolean deleteSkiridjinjonji(int id) {
        return skiridjinjonjis.removeIf(skiridjinjonji -> skiridjinjonji.getId() == id);
    }
}
