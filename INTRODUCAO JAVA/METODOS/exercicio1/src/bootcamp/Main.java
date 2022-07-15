package bootcamp;

import javax.print.attribute.standard.MediaName;

public class Main {

    public static void main(String[] args) {

        //Chamando o método
        Calculadora.soma(3,6);
        Calculadora.subtracao(5,2);
        Calculadora.multiplicacao(8,5);
        Calculadora.divisao(27,9);

        //Mensagem

        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(21);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
