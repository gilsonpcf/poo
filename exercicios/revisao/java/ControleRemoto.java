public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentaVolume() {
        tv.aumentaVolume();
    }

    public void diminuiVolume() {
        tv.diminuiVolume();
    }

    public void aumentaCanal() {
        tv.aumentaCanal();
    }

    public void diminuiCanal() {
        tv.diminuiCanal();
    }

    public void trocaCanal(int canal) {
        tv.setCanal(canal);
    }

    public void consultaVolume() {
        System.out.println("Volume: " + tv.getVolume());
    }

    public void consultaCanal() {
        System.out.println("Canal: " + tv.getCanal());
    }
}
