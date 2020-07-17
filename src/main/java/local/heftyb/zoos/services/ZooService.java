package local.heftyb.zoos.services;

import local.heftyb.zoos.models.Zoo;

import java.util.List;

public interface ZooService
{
    Zoo findZooById(long zooid);

    List<Zoo> findAllZoos();
}
