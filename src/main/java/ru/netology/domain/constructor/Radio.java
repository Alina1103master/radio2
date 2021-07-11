package ru.netology.domain.constructor;

public class Radio {
    private int currentRadioStation;
    private int radioStationNumber = 10;
    int minRadioStation = 0;
    private int maxRadioStation = radioStationNumber - 1;
    private int currentVolume;
    int maxVolume = 100;
    int minVolume = 0;

    public Radio(int currentRadioStation, int radioStationNumber, int minRadioStation, int maxRadioStation, int currentVolume, int maxVolume, int minVolume) {
        this.currentRadioStation = currentRadioStation;
        this.radioStationNumber = radioStationNumber;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio() {
    }

    public Radio(int currentRadioStation) {
        this.maxRadioStation = currentRadioStation - 1;
    }
    public Radio(int maxVolume, int minVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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


    public void setUpCurrentVolume() {
        if (currentVolume>= maxVolume) {
            return;
        }
        this.currentVolume--;
    }
}
