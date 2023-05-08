package MediaPlayer;


class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.print(getTitolo());
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public void esegui() {
    }
}
