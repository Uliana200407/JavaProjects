package com.tommy.java.basic.phoneExample;

import com.tommy.java.basic.phoneExample.interfaces.PhoneConnection;

import java.util.Objects;

public abstract class Phone implements PhoneConnection {

    private String namePhone;
    private String modelPhone;
    private int sizeStorage;
    private int sizeRAM;

    public Phone() {
    }

    public Phone(String namePhone, String modelPhone, int sizeStorage, int sizeRAM) {
        this.namePhone = namePhone;
        this.modelPhone = modelPhone;
        this.sizeStorage = sizeStorage;
        this.sizeRAM = sizeRAM;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getModelPhone() {
        return modelPhone;
    }

    public void setModelPhone(String modelPhone) {
        this.modelPhone = modelPhone;
    }

    public int getSizeStorage() {
        return sizeStorage;
    }

    public void setSizeStorage(int sizeStorage) {
        this.sizeStorage = sizeStorage;
    }

    public int getSizeRAM() {
        return sizeRAM;
    }

    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return sizeStorage == phone.sizeStorage &&
                sizeRAM == phone.sizeRAM &&
                Objects.equals(namePhone, phone.namePhone) &&
                Objects.equals(modelPhone, phone.modelPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePhone, modelPhone, sizeStorage, sizeRAM);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "namePhone='" + namePhone + '\'' +
                ", modelPhone='" + modelPhone + '\'' +
                ", sizeStorage=" + sizeStorage +
                ", sizeRAM=" + sizeRAM +
                '}';
    }
}
