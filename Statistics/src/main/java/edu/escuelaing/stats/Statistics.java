package edu.escuelaing.stats;

import java.io.*;
import java.text.DecimalFormat;

public class Statistics {
    private static LinkedListN<Double> dataList;
    private static Double mean;
    private static Double stdarDeviation;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args){
        dataList= new LinkedListN<Double>();
        File dataSet= new File(args[0]);
        try {
            BufferedReader br= new BufferedReader(new FileReader(dataSet));
            String currentString;
            while ((currentString= br.readLine()) != null){
                Double data = Double.parseDouble(currentString);
                dataList.add(data);
            }
            br.close();
            System.out.println("Los valores dados fueron: ");
            System.out.println("El valor de la media es : " + df2.format(calculateMean()));
            System.out.println("Los valor de la desviacion estandar es: " + df2.format(calculateStdarDeviation()));
        } catch (IOException error) {
            System.out.println("File not Founded.");;
        }
    }

    /**
     * Calcculates the value of the mean of the values of the dataList
     * @return Double mean
     */
    public static Double calculateMean(){
        Double sum= 0.0;
        for(Double i: dataList){
            sum+= i;
        }
        mean= (sum/dataList.size());
        return mean;
    }
    
    /**
     * Calculates the standar deviaton of the values of the dataList
     * @return
     */
    public static Double calculateStdarDeviation(){
        Double sum= 0.0;
        for(Double i: dataList){
            sum+= Math.pow((i - mean), 2);
        }
        stdarDeviation= Math.sqrt(sum / (dataList.size() - 1));
        return stdarDeviation;
    }
}
