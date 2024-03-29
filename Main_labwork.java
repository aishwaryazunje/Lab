package Labwork;

class Bank {
    public double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    public double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    public double getRateOfInterest() {
        return 7.0;
    }
}

class AXIS extends Bank {
    public double getRateOfInterest() {
        return 9.0;
    }
}

public class Main_labwork{
    public static void main(String[] args) {
        SBI sbiBank = new SBI();
        ICICI iciciBank = new ICICI();
        AXIS axisBank = new AXIS();

        System.out.println("SBI Bank Interest Rate: " + sbiBank.getRateOfInterest() + "%");
        System.out.println("ICICI Bank Interest Rate: " + iciciBank.getRateOfInterest() + "%");
        System.out.println("AXIS Bank Interest Rate: " + axisBank.getRateOfInterest() + "%");
    }
}
