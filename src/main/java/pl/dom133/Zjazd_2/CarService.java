package pl.dom133.Zjazd_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarService {

    @GetMapping("/car")
    public Car cars() {
        return new Car(5, 2021, 4, 1,
                "Model 3", "black", "Tesla");
    }

    public void print(Car car) {
        System.out.println(car);
    }

    public void addotionalWheel(Car car) {
        if(car.getWheels() < 5) {
            car.setWheels(car.getWheels() + 1);
        }
    }

    //Co to serwis i restcontroller, poczytac o wstrzykiwaniu zaleznosci.
}
