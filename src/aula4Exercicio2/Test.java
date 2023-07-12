package aula4Exercicio2;

public class Test {

	public static void main(String[] args) {
		
		MP3Player mp3Player = new MP3Player();
		mp3Player.abrir("Primeiros Erros.mp3");
		mp3Player.reproduzir();
		mp3Player.pausar();
		mp3Player.parar();
		
		System.out.println();
		
		WAVPlayer wavPlayer = new WAVPlayer();
		wavPlayer.abrir("Tudo que vai.wav");
		wavPlayer.reproduzir();
		wavPlayer.pausar();
		wavPlayer.parar();
	}

}
