package classprogramming;

import java.util.Scanner;

class Carriage {
    public int type;
    public int capa;
    public int id;
    public int jong;

    Carriage(int type, int capa, int id) {
        this.type = type;
        this.capa = capa;
        this.id = id;
        jong = 0;
    }

    void reserveSeats(int p, int q) {

    }

    void printStats() {
        System.out.println(id + " " + type + " " + jong + " " + capa);
        if (type == 3) {

        }
    }
}

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        Carriage[] C = new Carriage[N];
        for(int i=0; i<N; i++) {
            int type = scan.nextInt();
            int capa = scan.nextInt();
            int id = scan.nextInt();
            C[i] = new Carriage(type, capa, id);
        }
    
        final int K = scan.nextInt();
        for(int i=0; i<K; i++) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            for(int j=0; j<N; j++){
                if(p==)
                C[j].reserveSeats(p, q);
            }
        }
        for(???) {
            //???;
        }
    }
}
