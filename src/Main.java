public class Main {
    public static void main(String[] args) {
        int numeroIf=-5;
        System.out.println("*******************IF / ELSE***********************************");
        System.out.println("A la variable se le asigno el valor -->"+numeroIf);
        System.out.println("");
        if(numeroIf>0){
            System.out.println("la variable numeroIf es positiva");
        }
        else{
            if(numeroIf<0){
                System.out.println("la variable numeroIf es negativa");
            }
            else{
                System.out.println("la variable numeroIf es CERO");
            }
        }

        System.out.println("***********************WHILE********************************");
        int numerowhile=0;
        System.out.println("La variable numeroWhile es: "+numerowhile);
        while (numerowhile<3){
            numerowhile++;
            System.out.println("numeroWhile ahora es: "+numerowhile);
        }

        System.out.println("************************DOWHILE******************************");
        numerowhile=0;
        do{
            numerowhile++;
            System.out.println("La variable numeroWhile es: "+numerowhile);
        }while (numerowhile<1);

        System.out.println("***************************FOR*******************************");
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("***************************SWITCH*******************************");
        String estacion="kjhgkihuj";
        switch (estacion){
            case "Otoño":
                System.out.println("Estamos en "+estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en "+estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en "+estacion);
                break;
            case "Verano":
                System.out.println("Estamos en "+estacion);
                break;
            default:
                System.out.println(estacion+" --> No corresponde a una estacion");
                break;
        }

    }
}