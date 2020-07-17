package local.heftyb.zoos.services;

import local.heftyb.zoos.models.Zoo;
import local.heftyb.zoos.views.ZooCounts;

import java.util.List;

public interface AnimalService
{
    List<ZooCounts> findAllZooCounts();
}
