package aula4Exercicio2;

public class Test {

	public static void main(String[] args) {
		
		MP3Player mp3Player = new MP3Player();
		mp3Player.abrir("MusicaMP3.mp3");
		mp3Player.reproduzir();
		mp3Player.pausar();
		mp3Player.parar();
		
		WAVPlayer wavPlayer = new WAVPlayer();
		wavPlayer.abrir("MusicaWAV.mp3");
		wavPlayer.reproduzir();
		wavPlayer.pausar();
		wavPlayer.parar();
	}

}
