package pl.dom133.Zjazd_2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarControler {
    private final CarService carService;

    public CarControler(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("info")
    public ResponseEntity<String> getInfoCar() {
        Car car = carService.getCar("Y", "Tesla");
        return ResponseEntity.ok(carService.getCarData(car));
    }
}
