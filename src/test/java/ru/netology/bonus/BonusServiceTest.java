package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void calculate(String cases, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}

//    @ParameterizedTest
//    @CsvSource(value = {"'registered user, bonus under limit',100060,true,30",
//            "'registered user, bonus over limit',100000060,true,500",
//            "'unregistered user, bonus under limit',100060,false,10",
//            "'unregistered user, bonus over limit',100000060,false,500"}
//    )
//    void calculate(String cases, long amount, boolean registered, long expected) {
//        BonusService service = new BonusService();
//        long actual = service.calculate(amount, registered);
//        assertEquals(expected, actual);
//    }
//}