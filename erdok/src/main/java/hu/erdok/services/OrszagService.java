package hu.erdok.services;

import hu.erdok.domain.Fajta;
import hu.erdok.domain.Orszag;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrszagService {

    private List<Orszag> orszagok = new ArrayList<>();
    {
        orszagok.add(new Orszag(1, "Magyarország", 93000));
        orszagok.add(new Orszag(2, "Ausztria", 84000));
        orszagok.add(new Orszag(3, "Lengyelország", 165000));
    }

    public List<Orszag> getStaticOrszagList(){
        return orszagok;
    }

    public Orszag getOrszagById(int id){
        for (Orszag orszag : orszagok) {
            if(orszag.getId()==id)
                return orszag;
        }
        return null;
    }


}
