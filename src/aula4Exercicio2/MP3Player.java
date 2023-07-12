package aula4Exercicio2;

public class MP3Player implements FormatoAudio{
	
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
				System.out.println("M�sica MP3: "+getArquivo()+" est� sendo reproduzida <> ");
				break;
			case 2:
				System.out.println("M�sica MP3: "+getArquivo()+" est� pausado =");
				break;
			default:
				System.out.println("M�sica MP3: "+getArquivo()+" est� parado");
				break;
		}
	}
	
}
