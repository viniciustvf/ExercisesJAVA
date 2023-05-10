<<<<<<< HEAD
package program;

import entities.Dado;
import entities.Jogador;
import entities.Jogo;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[2];

        System.out.println("1 - Iniciar nova partida \n"
                + "2 - Executar jogada\n"
                + "3 - Informar posicoes\n"
                + "0 - Sair");

        int opcao1 = 1;

        do {
            int opcao = sc.nextInt();
            opcao1 = opcao;
            switch (opcao) {

                case 1 -> {
                    jogadores[0] = new Jogador(0, 0);
                    jogadores[1] = new Jogador(0, 0);
                    Dado dado = new Dado();
                    Jogo jogo = new Jogo(jogadores, dado);
                    System.out.println("Partida iniciada!");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("1 - Iniciar nova partida \n"
                        + "2 - Executar jogada\n"
                        + "3 - Informar posicoes\n"
                        + "0 - Sair");
                }
                case 2 -> {
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Jogador " + (i + 1) + ", execute a jogada apertando (a): ");
                        String letra = sc.next();
                        while (!"a".equals(letra)) {
                            System.out.println("Aperte (a)");
                        }
                        int pontos = jogadores[i].jogar();
                        jogadores[i].setCasaAtual(pontos);
                        if (jogadores[i].getCasaAtual() >= 20) {
                            System.out.println("Jogador " + (i + 1) + "GANHOU!");
                            break;
                        }
                        System.out.println("Jogador " + (i + 1) + " avancou " + jogadores[i].getMeuNumero() + " casas.");
                    }
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("1 - Iniciar nova partida \n"
                        + "2 - Executar jogada\n"
                        + "3 - Informar posicoes\n"
                        + "0 - Sair");
                }
                case 3 -> {
                    for (int i = 0; i < jogadores.length; i++) {
                        System.out.println("Jogador " + (i + 1) + " esta na casa: " + jogadores[i].getCasaAtual());
                        int pontos = jogadores[i].getCasaAtual();
                        int calculo = 20 - pontos;
                        System.out.println("Faltam " + calculo + " casas para o jogador " + (i + 1) + " ganhar.");
                        System.out.println("---------------------------------------------------------------");
                    }
                    System.out.println("1 - Iniciar nova partida \n"
                        + "2 - Executar jogada\n"
                        + "3 - Informar posicoes\n"
                        + "0 - Sair");
                }

            }
        } while (opcao1 != 0);

    }

}
=======
package program;

import entities.Dado;
import entities.Jogador;
import entities.Jogo;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[2];

        System.out.println("1 - Iniciar nova partida \n"
                + "2 - Executar jogada\n"
                + "3 - Informar posicoes\n"
                + "0 - Sair");

        int opcao1 = 1;

        do {
            int opcao = sc.nextInt();
            opcao1 = opcao;
            switch (opcao) {

                case 1 -> {
                    jogadores[0] = new Jogador(0, 0);
                    jogadores[1] = new Jogador(0, 0);
                    Dado dado = new Dado();
                    Jogo jogo = new Jogo(jogadores, dado);
                    System.out.println("Partida iniciada!");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("1 - Iniciar nova partida \n"
                        + "2 - Executar jogada\n"
                        + "3 - Informar posicoes\n"
                        + "0 - Sair");
                }
                case 2 -> {
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Jogador " + (i + 1) + ", execute a jogada apertando (a): ");
                        String letra = sc.next();
                        while (!"a".equals(letra)) {
                            System.out.println("Aperte (a)");
                            letra = sc.next();
                        }
                        int pontos = jogadores[i].jogar();
                        jogadores[i].setCasaAtual(pontos);
                        if (jogadores[i].getCasaAtual() >= 20) {
                            System.out.println("Jogador " + (i + 1) + "GANHOU!");
                            break;
                        }
                        System.out.println("Jogador " + (i + 1) + " avancou " + jogadores[i].getMeuNumero() + " casas.");
                    }
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("1 - Iniciar nova partida \n"
                        + "2 - Executar jogada\n"
                        + "3 - Informar posicoes\n"
                        + "0 - Sair");
                }
                case 3 -> {
                    for (int i = 0; i < jogadores.length; i++) {
                        System.out.println("Jogador " + (i + 1) + " esta na casa: " + jogadores[i].getCasaAtual());
                        int pontos = jogadores[i].getCasaAtual();
                        int calculo = 20 - pontos;
                        System.out.println("Faltam " + calculo + " casas para o jogador " + (i + 1) + " ganhar.");
                        System.out.println("---------------------------------------------------------------");
                    }
                    System.out.println("1 - Iniciar nova partida \n"
                        + "2 - Executar jogada\n"
                        + "3 - Informar posicoes\n"
                        + "0 - Sair");
                }

            }
        } while (opcao1 != 0);

    }

}
>>>>>>> 6dee2d66686813728fb5980e145b925adced9452
