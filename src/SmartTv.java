public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    //Ligar a TV
    public void ligar() {
        ligada = true;
    }

    //Desligar a TV
    public void desligar() {
        ligada = false;
    }

    //Mudar de Canal
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    //Aumentar o Volume
    public void aumentarVolume() {
        if (volume < 100) {
            System.out.println("Aumentando o volume para: " + ++volume);
        }
        else {
            System.out.println("O volume está no máximo: 100");
        }
    }

    //Diminuir o Volume
    public void diminuirVolume() {
        if (volume <= 0) {
            System.out.println("O volume está no mínimo: 0");
        }
        else {
            System.out.println("Diminuindo o volume para: " + --volume);
        }
    }
}