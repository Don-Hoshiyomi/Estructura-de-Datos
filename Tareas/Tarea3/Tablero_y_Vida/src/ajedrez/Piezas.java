package ajedrez;

public class Piezas {
    private char pieza;
    private String nombre;

    public Piezas() {
    }

    // 0 Para Blancas y 1 para negras
    public void Peon(int i){
        if ( i == 0){
        this.pieza= '\u2659';
        this.nombre = "Peon Blanco";
        }
        else {
            this.pieza = '\u265F';
            this.nombre = "Peon Negro";
        }
    }

    public void Torre (int i){
        if ( i == 0){
            this.pieza= '\u2656';
            this.nombre = "Torre Blanco";
        }
        else {
            this.pieza = '\u265C';
            this.nombre = "Torre Negro";
        }
    }

    public void Caballo (int i){
        if ( i == 0){
            this.pieza= '\u2658';
            this.nombre = "Caballo Blanco";
        }
        else {
            this.pieza = '\u265E';
            this.nombre = "Caballo Negro";
        }
    }

    public void Afil (int i){
        if ( i == 0){
            this.pieza= '\u2657';
            this.nombre = "Afil Blanco";
        }
        else {
            this.pieza = '\u265D';
            this.nombre = "Afil Negro";
        }
    }

    public void Reina(int i){
        if ( i == 0){
            this.pieza= '\u2655';
            this.nombre = "Reina Blanco";
        }
        else {
            this.pieza = '\u265B';
            this.nombre = "Reina Negro";
        }
    }

    public void Rey (int i){
        if ( i == 0){
            this.pieza= '\u2654';
            this.nombre = "Rey Blanco";
        }
        else {
            this.pieza = '\u265A';
            this.nombre = "Peon Negro";
        }
    }

    public char getPieza() {
        return pieza;
    }

    public void setPieza(char pieza) {
        this.pieza = pieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  ""+pieza;
    }
}
