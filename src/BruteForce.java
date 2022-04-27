import java.util.Date;
import java.net.InetAddress;


public class BruteForce {
    

    private final long IPS  = 4_294_967_296L;
    private final int ports = 65_536;

    public void test() {

        final int test = 3;

        switch (test) {

            
            case 1:
                //--------------------------------------------------------------//
                //primeiro teste:
                //loop simples em 4 bilhões de hipóteses:
                //--------------------------------------------------------------//
                Date before = new Date();
                
                for (long i = 0; i < IPS; i++) {
                    //Não faz nada
                }

                Date after = new Date();
                System.out.println("Diff = " + (after.getTime() - before.getTime()) + " milissegundos");
            break;
            
            case 2:
                //--------------------------------------------------------------//
                //segundo teste:
                //loop aninhado em 4 bilhões e 65 mil portas como hipóteses:
                //--------------------------------------------------------------//
                before = new Date();
                
                for (long i = 0; i < IPS; i++) {
                    for (int j = 0; j < ports; j++) {
                        //Não faz nada
                    }
                }

                after = new Date();
                System.out.println("Diff = " + (after.getTime() - before.getTime()) + " milissegundos");

            break;

            case 3:
                //--------------------------------------------------------------//
                //terceiro teste:
                //loop simples em 4 bilhões de ips como hipóteses:
                //--------------------------------------------------------------//
                before = new Date();
                for (long i = 0; i < 256; i++) {
                    try {
                        //Fazer: montar cada quadrante do IPv4 (256.256.256.256)
                        //Substituir IP fixo por IP Variável
                        InetAddress address = InetAddress.getByName("172.217.173.78");
                        System.out.println(i + " - Is " + address.getHostAddress() + " reachable? " + (address.isReachable(50)));
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }

                after = new Date();
                System.out.println("Diff = " + (after.getTime() - before.getTime()));

            break;
        }
    }

    public static void main(String[] args) throws Exception {
        BruteForce bf = new BruteForce();
        bf.test();
    }
}
