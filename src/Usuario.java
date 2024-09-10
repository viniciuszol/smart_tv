public class Usuario {
    public static void main(String[] args) {
        

    SmartTv smartTv = new SmartTv();

    //Ligar a TV
    smartTv.ligar();

    //imprimir se TV está ligada ou desligada
    if (smartTv.ligada) {

        System.out.println("Sua TV está ligada.");
    }

    else {

        System.out.println("Sua TV está desligada.");
    }

    //Imprimir o canal da TV
    smartTv.mudarCanal(13);
    System.out.println("Canal: " + smartTv.canal);


    //Diminuindo/Aumentando o Volume da TV
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    //Imprimindo o Volume da TV
    System.out.println("Volume: " + smartTv.volume);
    }
}
