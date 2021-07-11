package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test

    public void ShouldSetRadioStationNumber9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        int expected = 9;
        assertEquals(expected, rad.getCurrentRadioStation());
    }


    @Test
    public void ShouldSetRadioStationNumber0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        assertEquals(expected, rad.getCurrentRadioStation());
    }

    @Test
    public void ShouldSetRadioStationNumber1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        int expected = 1;
        assertEquals(expected, rad.getCurrentRadioStation());
    }

    @Test
    public void ShouldSetNextRadioStationPositiveNumber5() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        int expected = 6;
        assertEquals(expected, rad.setNextStation());
        assertEquals(expected, rad.getCurrentRadioStation());
    }

    @Test
    public void ShouldSetNextRadioStationPositiveNumber2() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioStation(2);
        int expected = 3;
        assertEquals(expected, radioRock.setNextStation());
    }

    @Test
    public void ShouldSetPreviousRadioStationPositiveNumber1() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioStation(1);
        int expected = 0;
        assertEquals(expected, radioRock.setEarlyStation());
    }

    @Test
    public void ShouldSetRadioStationNegative() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        assertEquals(expected, rad.getCurrentRadioStation());
    }

    @Test
    public void ShouldSetRadioStationNegativeNumber10() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        assertEquals(expected, rad.getCurrentRadioStation());
    }





    @Test
    public void ShouldSetNextRadioStationNegativeNumber9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        int expected = 0;
        assertEquals(expected, rad.setNextStation());
    }

    @Test
    public void ShouldSetNextRadioStationNegativeNumber10() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        int expected = 0;
        assertEquals(expected, rad.setNextStation());
    }



    @Test
    public void ShouldSetPreviousRadioStationPositiveNumber9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        int expected = 0;
        assertEquals(expected, rad.setEarlyStation());
    }

    @Test
    public void ShouldSetPreviousRadioStationNegativeNumber0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 9;
        assertEquals(expected, rad.setEarlyStation());

    }

    @Test
    public void ShouldSetPreviousRadioStationNegative() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 9;
        assertEquals(expected, rad.setEarlyStation());

    }

    @Test
    public void ShouldSetEarlyRadioStationPositiveNumber10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 9;
        assertEquals(expected, rad.setEarlyVolume());
    }

    @Test

    public void ShouldSetVolumePositiveNumber10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositiveNumber0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositiveNumber1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 1;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositiveNumber9() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        int expected = 9;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegativeNumber12() {
        Radio rad = new Radio();
        rad.setCurrentVolume(12);
        int expected = 0;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegativeNumber11() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 0;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldSetNextVolumePositiveNumber5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 6;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositiveNumber2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);
        int expected = 3;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositiveNumber1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 2;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumeNegativeNumber10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        assertEquals(expected, rad.setNextVolume());
    }

    @Test
    public void ShouldSetEarlyVolumePositiveNumber1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 0;
        assertEquals(expected, rad.setEarlyVolume());
    }

    @Test
    public void ShouldSetEarlyVolumePositiveNumber2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);
        int expected = 1;
        assertEquals(expected, rad.setEarlyVolume());
    }



    @Test
    public void ShouldSetEarlyVolumeNegativeNumber0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, rad.setEarlyVolume());

    }
}
