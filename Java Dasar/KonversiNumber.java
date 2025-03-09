public class KonversiNumber {
    public static void main(String[] args){

        // Widening Casting (otomatis) => byte->short->int->long->float->double
        byte number = 10;
        short iniShort = number;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

           // Narrowing Casting(Manual) => doubel->float->long->int->chart->short->byte
    float iniFloat2 = (float) iniDouble;
    long iniLong2 =(long)iniFloat2;
    }

 
}
