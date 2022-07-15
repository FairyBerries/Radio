package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldInsideRadioRange() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldOutRadioRange() {

        int countStation = 11;
        Radio rad = new Radio(countStation);

        rad.setCurrentStation(countStation);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldInsideRadioRange2() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldOutRadioRange2() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(3);

        rad.next();

        int expected = 4;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStation2() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }


    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation2() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        rad.prev();

        int expected = 4;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(2);

        rad.increaseVolume();

        int expected = 3;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        rad.decreaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldsDownSetCurrentVolume1(){
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldsDownSetCurrentVolume2(){
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}

