package pl.dom133.Zjazd_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Optional;


@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public Car buildCar(String model, String marka) {
        Car car = new Car(5, 2021, 4, 1, model, "Yelow", marka, "");
        return carRepository.save(car);
    }

    public Car findCarById(Long id) {
        Optional<Car> byId = carRepository.findById(id);
        if(byId.isPresent()) {
            return byId.get();
        } else {
            return null;
        }
    }

    public void addotionalWheel(Car car) {
        if(car.getWheels() < 5) {
            car.setWheels(car.getWheels() + 1);
        }
    }

    public void addExtraSeat(Car car) {
        if(car.getSeat() < 8) {
            car.setSeat(car.getSeat() + 1);
        }
    }

    public String convertModel(Car car) {
        return car.getModel().toUpperCase(Locale.ROOT);
    }

    public String convertMarka(Car car) { return car.getMark().toLowerCase(Locale.ROOT); }

    public void upgradeAccessory(Car car, int accessory) { car.setAccessoryType(accessory); }

    public void rePaint(Car car, String color) {
        car.setColor(color);
    }

    public void changeVin(Car car, String vin) {
        car.setVin(vin);
    }
}
