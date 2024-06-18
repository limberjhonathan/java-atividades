public class MinhaClasse {
    public static void main(String[] args) {
        TvSmart tv = new TvSmart();
        System.out.println("A tv esta " + tv.ligada);
        System.out.println("A tv esta no canal " + tv.canal);
        System.out.println("A tv esta esta com o volume " + tv.volume);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println("A tv esta esta com o volume " + tv.volume);
        System.out.println("A marca de sua tv é " + tv.marca);
        System.out.println("O valor de sua tv é R$" + tv.valor);
    }
}
