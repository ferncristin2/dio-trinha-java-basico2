public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal; //Cria o método mudarCanal
    }   
    public void mudarCanal(){
        canal++; //Aumenta o canal em incrementos de 1 unidade
    }
    public void mudarCanal(){
        canal--; //Diminui o canal em incrementos de 1 unidade
    }
    public void ligar(){
        ligada=true; //Cria o método ligar e estavbelece a condição verdadeira
    }    
    public void desligar(){
        ligada=false; //Cria o método desligar e estabelece a condição falsa
    }
    public void aumentarVolume(){
        volume++; //cria o método aumentarVolume e incrementa em 1 unidade
        // mesmo que dizer volume = volume + 1
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--; //cria o método diminuirVolume e decrementa em 1 unidade
        // mesmo que dizer volume = volume - 1
        System.out.println("Diminuindo o volume para: " + volume);    
    }
}