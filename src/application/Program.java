package application;

import entities.Iphone;

public class Program {
    public static void main(String[] args) {
         Iphone iphone = new Iphone();

        iphone.selecionarMusica("Imagine");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
    }

}
