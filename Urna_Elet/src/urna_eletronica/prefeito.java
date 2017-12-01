package urna_eletronica;
import javax.swing.JOptionPane;
public class prefeito {
    
    
    private int votoP;
    public String nomeP;
    public String partidoP;
    public int numeroP;
    
    public prefeito() //cadastro de prefeito
    {
        setNomeP(JOptionPane.showInputDialog("Nome do prefeito"));
        setPartidoP(JOptionPane.showInputDialog("Partido do prefeito"));
        setNumeroP(Integer.parseInt(JOptionPane.showInputDialog("Número do prefeito")));
        this.votoP = 0; // inicia a votação com 0 votos
    }

    @Override
    public String toString() { //String de exibição
        return "nome do prefeito : " + nomeP + ", partido do prefeito : " + partidoP + ", numero do prefeito : " + numeroP;
    }
   

    public String getNomeP() { //retorna nome
        return nomeP;
    }

    public void setNomeP(String nomeP) { //coloca na variavel nome
        this.nomeP = nomeP;
    }

    public String getPartidoP() { // retorna partido
        return partidoP;
    }

    public void setPartidoP(String partidoP) {  //coloca na variavel partido
        this.partidoP = partidoP;
    }

    public int getNumeroP() { // retorna numero
        return numeroP;
    }

    public void setNumeroP(int numeroP) { // coloca na variavel numero
        this.numeroP = numeroP;
    }

    public int getVotoP() { // retorna voto
        return votoP;
    }

    public void setVotoP(int votoP) { // coloca na variavel voto
        this.votoP = votoP;
    }
    
    public void addVotoP(){ // adiciona um voto na variavel
        setVotoP(getVotoP() + 1);
    }
    
    
}
