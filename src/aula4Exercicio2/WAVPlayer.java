package aula4Exercicio2;

public class WAVPlayer implements FormatoAudio{

	public int statusAudio = 0;
	public String arquivo;

	@Override
	public String abrir(String arquivo) {
		this.arquivo = arquivo;
		return null;
	}

	@Override
	public void reproduzir() {
		this.statusAudio = 1;
		mensagemStatus();
	}

	@Override
	public void pausar() {		
		this.statusAudio = 2;
		mensagemStatus();
	}

	@Override
	public void parar() {		
		this.statusAudio = 0;
		mensagemStatus();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getArquivo() {
		return arquivo;
	}

	/**
	 * 
	 * @param arquivo
	 */
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	/**
	 * 
	 * @return
	 */
	public int getStatusAudio() {
		return statusAudio;
	}
	
	/**
	 * 
	 * @param statusAudio
	 */
	public void setStatusAudio(int statusAudio) {
		this.statusAudio = statusAudio;
	}
	
	public void mensagemStatus() {
		
		switch (this.statusAudio) {
			case 1:
				System.out.println("Música WAV: "+getArquivo()+" está sendo reproduzida <> ");
				break;
			case 2:
				System.out.println("Música WAV: "+getArquivo()+" está pausado =");
				break;
			default:
				System.out.println("Música WAV: "+getArquivo()+" está parado");
				break;
		}
	}

}
