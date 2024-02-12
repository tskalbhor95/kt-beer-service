package com.springtushar.beerservice.web.controller;

import com.springtushar.beerservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

 /*   private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }
*/
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){
        //create new DTO and return 200
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){

     /*   BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "api/v1/beer"+ savedDto.getId().toString());
*/
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody  BeerDto beerDto){
       /* beerService.updateBeer(beerId, beerDto);*/
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
   /* @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable UUID beerId){
        beerService.deleteById(beerId);

    }*/
}
