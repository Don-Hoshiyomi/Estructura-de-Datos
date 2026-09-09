package ajedrez;

public class Tablero {
    private Arreglos tablero;

    public Tablero() {

    }

    @Override
    public String toString() {
        return "tablero{" +
                "tablero=" + tablero +
                '}';
    }

    public void IniciarTablero(){
        tablero = new Arreglos<>(9,9);
        Piezas pnegro = new Piezas();
        pnegro.Peon(1);
        Piezas pblanco = new Piezas();
        pblanco.Peon(0);
        Piezas tnegra = new Piezas();
        tnegra.Torre(1);
        Piezas tblanca = new Piezas();
        tblanca.Torre(0);
        Piezas cnegro = new Piezas();
        cnegro.Caballo(1);
        Piezas cblanco = new Piezas();
        cblanco.Caballo(0);
        Piezas anegro = new Piezas();
        anegro.Afil(1);
        Piezas ablanco = new Piezas();
        ablanco.Afil(1);
        Piezas reynegro = new Piezas();
        reynegro.Rey(1);
        Piezas reyblanco = new Piezas();
        reyblanco.Rey(0);
        Piezas reinanegra = new Piezas();
        reinanegra.Reina(1);
        Piezas reinablanca = new Piezas();
        reinablanca.Reina(0);
        for (int i=0 ; i<9 ; i++ ){
            for (int b=0 ; b<9 ; b++) {
                if (i == 0 || b == 0) {
                    continue;
                }
                if (i == 1 || i == 8) {
                    switch (b){
                        case 1,8:
                            if(i == 1 ){
                                tablero.insertarElemento(i,b,tnegra);}
                            else {
                                tablero.insertarElemento(i,b,tblanca);
                            }
                            break;
                        case 2,7:
                            if(i == 1 ){
                                tablero.insertarElemento(i,b,cnegro);}
                            else {
                                tablero.insertarElemento(i,b,cblanco);
                            }
                            break;
                        case 3, 6:
                            if(i == 1 ){
                                tablero.insertarElemento(i,b,anegro);}
                            else {
                                tablero.insertarElemento(i,b,ablanco);
                            }
                            break;
                        case 4 :
                            if(i == 1 ){
                                tablero.insertarElemento(i,b,reynegro);}
                            else {
                                tablero.insertarElemento(i,b,reinablanca);
                            }
                            break;
                        case 5:
                            if(i == 1 ){
                                tablero.insertarElemento(i,b,reinanegra);}
                            else {
                                tablero.insertarElemento(i,b,reyblanco);
                            }
                            break;
                    }

                }else if (i == 2) {
                    tablero.insertarElemento(i, b, pnegro);
                }
                else if (i == 7) {
                    tablero.insertarElemento(i, b, pblanco);
                }

            }
        }

    }
    public void ImprimirTablero(){
        tablero.imprimir();
    }
}
