package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldSwitchToNextStationIfCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.turnNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToNextStationIfCurrentStationNotMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
        radio.turnNextStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToPrevStationIfCurrentStationMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.turnPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToPrevStationIfCurrentStationNotMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
        radio.turnPrevStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldGetCurrentStationIfItMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldGetCurrentStationIfItMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(6);
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldPlusVolumeIfVolumeNotMAx() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldPlusVolumeIfVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }


    @Test
    public void shouldMinusVolumeFromMinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinusVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetStationMoreThanMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationLessThanMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-2);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolumeMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(14);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-34);
        assertEquals(0, radio.getCurrentVolume());
    }


}

