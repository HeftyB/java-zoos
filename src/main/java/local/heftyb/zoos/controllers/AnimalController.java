package local.heftyb.zoos.controllers;

import local.heftyb.zoos.models.Zoo;
import local.heftyb.zoos.services.AnimalService;
import local.heftyb.zoos.views.ZooCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController
{
    @Autowired
    AnimalService animalService;

    @GetMapping(value = "/count", produces = {"application/json"})
    public ResponseEntity<?> listAllZoos ()
    {
        List<ZooCounts> zoos = animalService.findAllZooCounts();
        return new ResponseEntity<>(zoos, HttpStatus.OK);
    }
}
