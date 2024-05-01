package edu.iu.otiwari.c322finalbackend.repository;

import edu.iu.otiwari.c322finalbackend.model.Color;
import edu.iu.otiwari.c322finalbackend.model.Flower;
import edu.iu.otiwari.c322finalbackend.model.Occasion;
import edu.iu.otiwari.c322finalbackend.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class InsertFlowers implements CommandLineRunner {
    @Autowired
    FlowersRepository flowersRepository;

    @Override
    public void run(String... args) throws Exception {
        flowersRepository.saveAll(Arrays.asList(
                new Flower("Lemonade", 54.0F, Type.MIXED, Occasion.THANKYOU , Color.YELLOW),
                new Flower("The Angels", 54.0F, Type.TULIPS, Occasion.MOTHERSDAY , Color.RED),
                new Flower("Sierra Sunset", 54.0F, Type.ROSES, Occasion.THANKYOU , Color.RED),
                new Flower("Unbreakable", 59.0F, Type.MIXED, Occasion.THANKYOU , Color.MIXED),
                new Flower("Casablanca", 59.0F, Type.LILIES, Occasion.BIRTHDAY , Color.MIXED)
        ));
    }
}
