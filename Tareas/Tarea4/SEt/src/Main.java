import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Explicación de los Casos");
        System.out.println();
        Set<String> biomasDescubiertos = new HashSet<>();
        Set<String> dimensionesDescubiertas = new HashSet<>();
        //Se importa la clase Set y HashSet, debido a que permiten el guardado de objetos sin que se repitan
        System.out.println("Tomando el caso de Minecraft");
        System.out.println("웃");
        System.out.println("Aqui vemos que los biomas descubiertos, no existen");
        System.out.println("Biomas descubiertos: "+biomasDescubiertos);

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("Nuestro jugador inicia en un bioma");
        System.out.println("Aqui empezo en el desierto");
        System.out.println("🏜️☀️웃🐫🌵");
        biomasDescubiertos.add("Desierto");
        System.out.println(biomasDescubiertos);
        System.out.println("Aqui se agrega el bioma de desierto a los que ha descubierto el jugador");
        System.out.println("Ahora llevemos al jugador a otro bioma");
        System.out.println("/tp Jugador 200 200 200");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ahora el jugador se encuentra en la jungla");
        System.out.println("\uD83C\uDF3F\uD83D\uDC12\uD83E\uDD9F ️웃 \uD83D\uDC0D\uD83D\uDC0A\uD83C\uDF3F");
        biomasDescubiertos.add("Jungla");
        System.out.println(biomasDescubiertos);
        System.out.println("Asi que se van almacenando los datos\nigual que un arraylist,solo que este permite que existan nulos al inicio");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ahora si lo llevamos a otra dimension");
        System.out.println("  ⬛\uFE0F⬛\uFE0F⬛\uFE0F⬛\uFE0F\n" +
                            "  ⬛\uFE0F\uD83D\uDFEA\uD83D\uDFEA⬛\uFE0F\n" +
                "  ⬛\uFE0F\uD83D\uDFEA\uD83D\uDFEA⬛\uFE0F\n" +
                "  ⬛\uFE0F\uD83D\uDFEA\uD83D\uDFEA⬛\uFE0F\n" +
                "️웃⬛\uFE0F⬛\uFE0F⬛\uFE0F⬛\uFE0F");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n\n\n ⛏웃 \uFE0F\uD83D\uDFE5\uD83E\uDEA8\uD83D\uDD25");
        System.out.println("Ahora el jugador se encuentra en el nether");
        System.out.println("Logro desbloqueado «En el Nether»");
        dimensionesDescubiertas.add("Nether");
        System.out.println(dimensionesDescubiertas);
        System.out.println("Asi que regresemos a nuestro punto de partida");
        System.out.println("/kill @e");
        System.out.println(" Jugador murio");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("🏜️☀️웃🐫🌵");
        biomasDescubiertos.add("Desierto");
        System.out.println("Estamos devuelta en el desierto, asi que intentamos agregar de nuevo el bioma");
        System.out.println(biomasDescubiertos);
        System.out.println("Pero debido a que el metodo set, solo permite objetos unicos, no se vuelve a registrar");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Lo mismo ocurre si lo llevamos al nether denuevo");
        System.out.println("/tp Jugador Nether");
        System.out.println("\n\n\n ⛏웃 \uFE0F\uD83D\uDFE5\uD83E\uDEA8\uD83D\uDD25");
        if (dimensionesDescubiertas.contains("Nether")){

        }else {
            dimensionesDescubiertas.add("Nether");
            System.out.println("Logro desbloqueado «En el Nether»");
        }
        System.out.println("Si la logica funciona bien, el metodo dimensionesDescubiertas.contains(Nether)\n" +
                "entonces nos dira que ese conjutno contiene nether, por lo que no hara nada" +
                "caso contrario volvera a imprimir el logro");
        

    }
}
