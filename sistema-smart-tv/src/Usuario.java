public class Usuario {
    public static void main(String[] args) {
        int n1 = 1;
        String n2 = "2";

        System.out.println(n1 + n2);

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.escolherCanal(30);
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
    }
}
