package Readers;

import Models.Car;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public static List<Car> readData() throws IOException, InvalidFormatException {
        List<Car> cars = new ArrayList<>();

        File excelFile = new File(System.getProperty("user.dir") + "/resources/cars.xlsx");

//        FileInputStream file = new FileInputStream(new File("resources/cars.xlsx"));

        Workbook workbook = WorkbookFactory.create(excelFile);

//        Cars Sheet
        Sheet sheet = workbook.getSheetAt(0);

        for (int rn = 1; rn <= sheet.getLastRowNum(); rn++) {
            Row r = sheet.getRow(rn);

            Car car = new Car();

            try {
                car.setName(r.getCell(0).getStringCellValue());
                car.setModel(r.getCell(1).getStringCellValue());
                car.setBrand(r.getCell(2).getStringCellValue());
                car.setPlate(r.getCell(3).getStringCellValue());
                car.setType(r.getCell(4).getStringCellValue());
                car.setFuelType(r.getCell(5).getStringCellValue());
                car.setDoor(r.getCell(6).getNumericCellValue());
                car.setSeat(r.getCell(7).getNumericCellValue());
                car.setGear(r.getCell(8).getNumericCellValue());
            } catch (Exception e) {
//                System.out.println(r.getCell(1) + "#" + rn);
            }

            cars.add(car);
        }
//        workbook.close();

        return cars;
    }
}
