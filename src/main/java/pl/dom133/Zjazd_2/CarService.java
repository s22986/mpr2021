package pl.dom133.Zjazd_2;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CarService {

    public Car getCar(String model, String mark) {
        if(Objects.equals(model, "Y")) {
            Car tesla = new Car(5, 2021, 4, 1, model, "Black", mark);
            return tesla;
        }

        return null;
    }

    public String getCarData(Car car) {
        return car.toString();
    }

    public void addotionalWheel(Car car) {
        if(car.getWheels() < 5) {
            car.setWheels(car.getWheels() + 1);
        }
    }
}
