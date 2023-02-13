package classprogramming;

import java.util.Scanner;

class Classroom {
    public String name;
    public int numSeats;
    public boolean Proj;
    public boolean Visual;
    public boolean Smart;
    public boolean Cam;

    Classroom(String name,
            int numSeats,
            int nProj,
            int nVisual,
            int nSmart,
            int nCam) {
        this.name = name;
        this.numSeats = numSeats;
        Proj = (nProj == 1) ? false : true;
        Visual = (nVisual == 1) ? false : true;
        Smart = (nSmart == 1) ? false : true;
        Cam = (nCam == 1) ? false : true;
    }

    public static boolean isAvailable(int numSeats, int nProj, int nVisual, int nSmart, int nCam) {

    }

    boolean reserve() {

    }
}

public class Classroom1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Classroom[] rooms = new Classroom[n+1];
        for(int i=1; i<=n; i++) {
            String name = scan.next();
            int numSeats = scan.nextInt();
            int nProj = scan.nextInt();
            int nVisual = scan.nextInt();
            int nSmart = scan.nextInt();
            int nCam = scan.nextInt();
            rooms[i] = new Classroom(name, numSeats, nProj, nVisual, nSmart, nCam); 
        }
        int k = scan.nextInt();

        for(int i=0; i<k; i++) {
            boolean ck = false;
            int numSeats = scan.nextInt();
            int nProj = scan.nextInt();
            int nVisual = scan.nextInt();
            int nSmart = scan.nextInt();
            int nCam = scan.nextInt();
            ck = rooms[i].isAvailable(numSeats, nProj, nVisual, nSmart, nCam);
            for(int j=1; j<=n; j++) {
                if(rooms[j].numSeats==numSeats){
                    
                    continue;
                }
            }
            if(!ck)
                //?????

        }

    }
}
