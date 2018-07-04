import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Даны целые числа h, m, s (0 < h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59), указывающие
момент времени: "h часов, m минут, s секунд". Определить угол (в градусах)
между положением часовой стрелки в начале суток и в указанный момент
времени. 
New Line In Description
and rollback!
//1sec = 180/6/60/60 */
public class Classss {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter hour: ");
        String H = r.readLine();
        System.out.print("Enter min: ");
        String M = r.readLine();
        System.out.print("Enter sec: ");
        String S = r.readLine();
        int h = Integer.parseInt(H);
        int m = Integer.parseInt(M);
        int s = Integer.parseInt(S);
        float angle = 0;
        int newH=0;
        float DegreeInOneSec = ((float)180/(float)6/(float)60/(float)60);
        if ((h >=0 && h<=23) && (m>=0 && m<=59) && (s>=0 && s<=59)){
            if (h>=0 && h<6)
            angle = (h*60*60 + m*60 + s)*DegreeInOneSec;
            else if (h>=6 && h<12) {
                newH = 12 - h;
                angle = (newH * 60 * 60 - m * 60 - s)*DegreeInOneSec;
            }else if (h>=12 && h<18) {
                newH = h - 12;
                angle = (newH * 60 * 60 + m * 60 + s)*DegreeInOneSec;
            }else if (h>=18 && h<24) {
                newH = 24-h;
                angle = (newH * 60 * 60 - m * 60 - s)*DegreeInOneSec;
            }
            System.out.println("H is " + h + " M is " + m+ " S is " + S + " Angle is " + angle);
            System.out.println(" ");
            System.out.println("Кстати, в одной секунде " + DegreeInOneSec + " градуса");
            }}}