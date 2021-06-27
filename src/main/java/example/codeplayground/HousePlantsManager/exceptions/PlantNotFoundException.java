package example.codeplayground.HousePlantsManager.exceptions;

public class PlantNotFoundException extends RuntimeException {
    public PlantNotFoundException(String message) {
        super(message);
    }
}
