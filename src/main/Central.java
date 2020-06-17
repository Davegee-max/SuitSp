package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Central {

    private int counter;
    private double[] IRvalues, Redvalues;
    static Sensor sensor;
    private static FileWriter fileWriter ;
    private static BufferedWriter bw;

    public static void main(String[] args) {
        int[] raws = new int[2];

        try {
            fileWriter = new FileWriter("Filnavn.txt",true);
            bw = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sensor = new Sensor();
        while(true){
            sensor.getParsedValues();
        }




        //her skal der ske ting i en uendelig løkke.


    }

    private void skrivTilMinStakkelsFil(String input) throws IOException {

        fileWriter.write("Av av av, her kom mit input: "+input);


    }
}
