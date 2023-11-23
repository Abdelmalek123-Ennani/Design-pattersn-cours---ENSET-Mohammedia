package ma.abdelmalek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context ctx=new Context();
        Scanner clavier=new Scanner(System.in);
        /* System.out.println("Stratégie 1:");
        ctx.setStrategy(new StrategyImpl1());
        ctx.appliquerStrategy();
        System.out.println("Stratégie 2:");
        ctx.setStrategy(new StrategyImpl2());
        ctx.appliquerStrategy(); */

        while(true){
            System.out.print("Quelle stratégie:");
            String nomStrategy=clavier.next();
            if(nomStrategy.equals("quit")) break;
            try {

                Class c=Class.forName(nomStrategy);
                Strategy strategy=(Strategy) c.newInstance();
                ctx.setStrategy(strategy);
                ctx.appliquerStrategy();

            } catch (Exception e) {
                System.out.println("Stratégy Innexistante..");
            }
        }
    }
}