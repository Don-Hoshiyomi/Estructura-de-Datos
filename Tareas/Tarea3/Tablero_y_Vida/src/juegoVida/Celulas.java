package juegoVida;

public class Celulas {
    private boolean estado;
    private String representacion;

    public Celulas(boolean estado) {
        this.estado = estado;
        if (estado == false){
            this.representacion = "Muelto";
        }else {
            this.representacion = "Vivo";
        }
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return " " + representacion +" ";
    }
}
