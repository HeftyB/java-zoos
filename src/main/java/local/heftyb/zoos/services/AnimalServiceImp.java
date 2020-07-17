package local.heftyb.zoos.services;

import local.heftyb.zoos.models.Zoo;
import local.heftyb.zoos.repository.AnimalRepository;
import local.heftyb.zoos.repository.ZooRepository;
import local.heftyb.zoos.views.ZooCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class AnimalServiceImp implements AnimalService
{
    @Autowired
    AnimalRepository animalrepo;

    @Autowired
    ZooRepository zoorepo;

    @Override
    public List<ZooCounts> findAllZooCounts()
    {
        return animalrepo.findAllZooCounts();
    }
}
