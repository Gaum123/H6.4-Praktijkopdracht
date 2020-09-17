import java.awt.*;
import java.applet.*;


public class H64 extends Applet {
    double a, b, c, d;
    double uitkomst;
    int output;


    public void init() {
        a = 5.3;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a + b + c) / d;
        uitkomst = uitkomst * 10;
        output = (int) uitkomst;
        output = output / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is : " + output, 20, 20);
    }
}