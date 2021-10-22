package hu.erdok.services;

import hu.erdok.domain.Fajta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FajtaService {

    private List<Fajta> fajtak = new ArrayList<>();
    {
        fajtak.add(new Fajta(1, "Bükk", "zárvatermő"));
        fajtak.add(new Fajta(2, "Fenyő", "nyitvatermő"));
        fajtak.add(new Fajta(3, "Tölgy", "zárvatermő"));
    }

    public List<Fajta> getStaticFajtaList(){
        return fajtak;
    }

    public Fajta getFajtaById(int id){
        for (Fajta fajta : fajtak) {
            if(fajta.getId()==id)
                return fajta;
        }
        return null;
    }


}
