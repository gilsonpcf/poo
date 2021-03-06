public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        volume = 0;
        canal = 1;
    }

    public void aumentaVolume() {
        if (volume < 100) {
            volume++;
        }

        System.out.println("Volume: " + volume);
    }

    public void diminuiVolume() {
        if (volume > 0) {
            volume--;
        }

        System.out.println("Volume: " + volume);
    }

    public void aumentaCanal() {
        if (canal < 999) {
            canal++;
        } else {
            canal = 1;
        }

        System.out.println("Canal: " + canal);
    }

    public void diminuiCanal() {
        if (canal > 1) {
            canal--;
        } else {
            canal = 999;
        }

        System.out.println("Canal: " + canal);
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal < 1000) {
            this.canal = canal;
            System.out.println("Canal: " + this.canal);
        } else {
            System.out.println("Canal inexistente.");
        }
    }
}
