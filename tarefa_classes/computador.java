public class computador {
    private String processador;
    private int memoriaRam;
    private double espacoDisco;
    private boolean possuiSSD;
    

    public double getEspacoDisco() {
        return espacoDisco;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public String getProcessador() {
        return processador;
    }
    public boolean isPossuiSSD() {
        return possuiSSD;
    }

    public void setEspacoDisco(double espacoDisco) {
        this.espacoDisco = espacoDisco;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setPossuiSSD(boolean possuiSSD) {
        this.possuiSSD = possuiSSD;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double converterParaTera(double espacoEmGB){
        return espacoEmGB / 1000;
    }
}
