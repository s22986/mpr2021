package pl.dom133.Zjazd_2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("build")
    public ResponseEntity<Car> addCar(@RequestParam String model, @RequestParam String marka) {
        return ResponseEntity.ok(carService.buildCar(model, marka));
    }

    @GetMapping("findPath/{id}")
    @ResponseBody
    public ResponseEntity<Car> findCar(@PathVariable String id) {
        return ResponseEntity.ok(carService.findCarById(Long.valueOf(id)));
    }
}
