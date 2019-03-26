import Models.Car;
import Readers.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, InvalidFormatException {

        List<Car> cars = ExcelReader.readData();
        Collections.sort(cars);

        for (Car car : cars) {
            car.print();
        }
    }
}
