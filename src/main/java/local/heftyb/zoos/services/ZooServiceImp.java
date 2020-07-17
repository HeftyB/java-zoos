package local.heftyb.zoos.services;

import local.heftyb.zoos.models.Zoo;
import local.heftyb.zoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ZooServiceImp implements ZooService
{
    @Autowired
    ZooRepository zoorepo;

    @Override
    public List<Zoo> findAllZoos()
    {
        List<Zoo> zooList = new ArrayList<>();
        zoorepo.findAll().iterator().forEachRemaining(zooList::add);
        return zooList;
    }

    @Override
    public Zoo findZooById(long zooid)
    {
        Zoo z = zoorepo.findById(zooid).orElseThrow(() -> new EntityNotFoundException("Zoo id " + zooid + " Not Found!"));
        return z;
    }

}
