package com.example.project3.controller;


         import com.example.project3.model.CarShop;
         import com.example.project3.model.CarShopService;
         import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;
        import java.util.Optional;

@RestController
@RequestMapping(path = "api/carshop")
public class CarShopController {
    private CarShopService CarShopService;

    @Autowired
    public CarShopController(CarShopService CarShopService) {
        this.CarShopService = CarShopService;
    }

    @GetMapping
    public List<CarShop> getBootcamps() {
        return CarShopService.getCarShops();
    }

    @PostMapping(path = "add")
    public void registerNewBootcamp(@RequestBody CarShop CarShop){
        CarShopService.addNewCarShop(CarShop);
    }

}