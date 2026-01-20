public class Main { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static int casoDePrueba(String anio) {

        if(anio.length() < 3){
            return 1;
        }
        int endNumber = Integer.parseInt(anio.substring(anio.length()-2));
        int siglo = Integer.parseInt(anio.substring(0, anio.length()-2));
        if(endNumber == 0){
            return siglo;
        }else{
            return siglo + 1;
        }

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++){
            String anio = in.nextLine();
            System.out.println(casoDePrueba(anio));
        }

    }
}