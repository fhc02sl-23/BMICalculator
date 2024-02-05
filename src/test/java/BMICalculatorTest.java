import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator bmiCalcHerrLitrop;
    BMICalculator bmiCalcFrauLitrop;

    @org.junit.jupiter.api.BeforeEach
    void setUp(TestInfo info) {
        bmiCalcFrauLitrop = new BMICalculator("Unbekannt", "Unbekannt", 170, 65, 'w');
        bmiCalcHerrLitrop = new BMICalculator("Simon", "Litrop", 172, 70,'m');
        System.out.println("---Start---");
        System.out.println(info.getDisplayName());
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("---End---");
    }

    @Test
    @DisplayName("Constructor Test")
    void constructorTest() {
        //Frau Litrop
        Assertions.assertEquals("Unbekannt", bmiCalcFrauLitrop.getFirstname());
        Assertions.assertEquals("Unbekannt", bmiCalcFrauLitrop.getLastname());
        Assertions.assertEquals(170, bmiCalcFrauLitrop.getBodyHeight());
        Assertions.assertEquals(65, bmiCalcFrauLitrop.getBodyWeight());
        Assertions.assertEquals('w', bmiCalcFrauLitrop.getGender());

        //Herr Litrop
        Assertions.assertEquals("Simon", bmiCalcHerrLitrop.getFirstname());
        Assertions.assertEquals("Litrop", bmiCalcHerrLitrop.getLastname());
        Assertions.assertEquals(172, bmiCalcHerrLitrop.getBodyHeight());
        Assertions.assertEquals(70, bmiCalcHerrLitrop.getBodyWeight());
        Assertions.assertEquals('m', bmiCalcHerrLitrop.getGender());
    }

    @Test
    @DisplayName("calculateBMITest")
    void calculateBMI() {
        Assertions.assertEquals(22.49, bmiCalcFrauLitrop.calculateBMI());
        Assertions.assertEquals(23.66, bmiCalcHerrLitrop.calculateBMI());
    }

    @Test
    @DisplayName("calculateBMICategoryTest")
    void calculateBMICategory() {
        Assertions.assertEquals(0, bmiCalcFrauLitrop.calculateBMICategory());
        Assertions.assertEquals(0, bmiCalcHerrLitrop.calculateBMICategory());
    }

    @Test
    @DisplayName("getBMICategoryNameTest")
    void getBMICategoryName() {
        Assertions.assertEquals("Normalgewicht", bmiCalcFrauLitrop.getBMICategoryName());
        Assertions.assertEquals("Normalgewicht", bmiCalcHerrLitrop.getBMICategoryName());
    }
}