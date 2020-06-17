package main;

import jssc.*;

public class Sensor {

    String[] ports = SerialPortList.getPortNames();
    SerialPort spasser;

    public Sensor() {
        System.out.println(ports[0]);
        System.out.println("AV! Der kom en sensor");


        try {
            spasser = new SerialPort(ports[0]);
            spasser.openPort();
            spasser.setRTS(true);
            spasser.setDTR(true);
            spasser.setParams(9600, 1, 0, 0);
            spasser.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
        } catch (SerialPortException spa) {
            spa.printStackTrace();
        }


    }

    public String[] getParsedValues() {
        String laesfraport;
        String[] av = null;
        int[] output = new int[2];
        try {


            if (spasser.getInputBufferBytesCount() >0) {

                laesfraport = spasser.readString();

                System.out.println("fra sensor:"+laesfraport);



            }

        } catch (SerialPortException spe) {
            System.out.println("av");
        }

        return av;
    }


}
