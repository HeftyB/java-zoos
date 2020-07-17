package local.heftyb.zoos.services;

import local.heftyb.zoos.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class TelephoneServiceImp implements TelephoneService
{

    @Autowired
    TelephoneRepository telerepo;
}
