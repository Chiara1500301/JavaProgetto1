import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        elementi[0] = new RegistrazioneAudio("Audio 1", 10, 5);
        elementi[1] = new Video("Video 1", 15, 3, 7);
        elementi[2] = new Immagine("Immagine 1", 8);
        int scelta;
        do {
            System.out.println("Scegli un elemento multimediale da eseguire (1-5), 0 per uscire:");
            scelta = scanner.nextInt();

            if (scelta >= 1 && scelta <= elementi.length) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Riproducibile) {
                    Riproducibile riproducibile = (Riproducibile) elemento;
                    riproducibile.play();
                } else if (elemento instanceof Immagine) {
                    Immagine immagine = (Immagine) elemento;
                    immagine.show();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);

        scanner.close();
    }
}
