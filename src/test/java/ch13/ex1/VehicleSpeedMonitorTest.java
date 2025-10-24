package ch13.ex1;

import org.example.ch13.ex1.VehicleSpeedMonitor2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VehicleSpeedMonitorTest {

    @Test
    void GIVEN_aCarWithinTheSpeedLimit_RETRUN_speedIsOk(){
        String result = VehicleSpeedMonitor2.testSpeed("car", 50);
        assertEquals("Speed OK", result);
    }

    @Test
    void GIVEN_aCarOverTheSpeedLimit_RETRUN_speeding(){
        String result = VehicleSpeedMonitor2.testSpeed("car", 180);
        assertEquals("Speeding", result);
    }

    @Test
    void GIVEN_aBusWithinTheSpeedLimit_RETRUN_speedIsOk(){
        String result = VehicleSpeedMonitor2.testSpeed("bus", 20);
        assertEquals("Speed OK", result);
    }

    @Test
    void GIVEN_aBusOverTheSpeedLimit_RETRUN_speeding(){
        String result = VehicleSpeedMonitor2.testSpeed("bus", 90);
        assertEquals("Speeding", result);
    }

    @Test
    void GIVEN_aBikeWithinTheSpeedLimit_RETRUN_speedIsOk(){
        String result = VehicleSpeedMonitor2.testSpeed("bike", 59);
        assertEquals("Speed OK", result);
    }

    @Test
    void GIVEN_aBikeOverTheSpeedLimit_RETRUN_speeding(){
        String result = VehicleSpeedMonitor2.testSpeed("bike", 61);
        assertEquals("Speeding", result);
    }

    @Test
    void GIVEN_anUnknownVehicle_RETURN_unknownVehicleType(){
        String result = VehicleSpeedMonitor2.testSpeed("carr", 100);
        assertEquals("Unknown vehicle type", result);
    }

    @Test
    void GIVEN_aCarAndANegativeSpeed_RETURN_exiting(){
        String result = VehicleSpeedMonitor2.testSpeed("car", -1);
        assertEquals("Exiting system...", result);
    }

    @Test
    void GIVEN_aCarWithMaximSpeedLimit_RETRUN_speedIsOk(){
        String result = VehicleSpeedMonitor2.testSpeed("car", 100);
        assertEquals("Speed OK", result);
    }

    @Test
    void GIVEN_aCarWith0SpeedLimit_RETRUN_speedIsOk(){
        String result = VehicleSpeedMonitor2.testSpeed("car", 0);
        assertEquals("Speed OK", result);
    }

    @Test
    void GIVEN_aCarWithCaps_RETRUN_speedIsOk(){
        String result = VehicleSpeedMonitor2.testSpeed("CAR", 0);
        assertEquals("Speed OK", result);
    }

}
