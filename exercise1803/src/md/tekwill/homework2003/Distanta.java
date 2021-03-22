package md.tekwill.homework2003;

public class Distanta {
    public static void main(String[] args) {
        double metre = 2500;
        int hour = 5;
        int minutes = 56;
        int seconds = 23;
        double mile;
        mile = metre * 0.000621371;
        double km;
        km = metre / 1000;
        int sec;
        sec = 23+(56*60)+(5*3600);
        double m_s;
        m_s = metre/sec;
        double km_h;
        km_h = m_s*3.6;
        double m_h;
        m_h = m_s*2.236936;
        System.out.println( "mile:" +mile );
        System.out.println( "km:" +km );
        System.out.println( "sec:" +sec );
        System.out.println( "m/s:" +m_s );
        System.out.println( "km/h:" +km_h );
        System.out.println( "m/h:" +m_h );
        }

}
