package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    int maxRadioStation = 9;
    int minRadioStation = 0;
    int maxVolume = 10;
    int minVolume = 0;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int setNextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;

        }
        return currentRadioStation;

    }

    public int setEarlyStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int setNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = this.currentVolume + 1;
        } else {
            currentVolume = currentVolume;

        }
        return currentVolume;

    }

    public int setEarlyVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
        return currentVolume;


    }
}
