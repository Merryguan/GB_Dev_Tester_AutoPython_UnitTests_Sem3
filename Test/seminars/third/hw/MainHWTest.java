package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {

    MainHW mainHw;

    @BeforeEach
    void init() { mainHw = new MainHW(); }

    @ParameterizedTest
    @ValueSource(ints={ 2, 10, 100, 0, -2, -10, -100 })
    void checkOddNumber(int n) { assertTrue(mainHw.evenOddNumber(n)); }

    @ParameterizedTest
    @ValueSource(ints = { 1, 11, 101, -1, -11, -101 })
    void checkNotOddNumber(int n) { assertFalse(mainHw.evenOddNumber(n)); }

    @ParameterizedTest
    @ValueSource(ints = { 25, 26, 60, 99, 100 })
    void checkInInterval(int n) { assertTrue(mainHw.numberInInterval(n)); }

    @ParameterizedTest
    @ValueSource(ints = { 24, 101 , 0 })
    void checkNotInInterval(int n) { assertFalse(mainHw.numberInInterval(n)); }

}
