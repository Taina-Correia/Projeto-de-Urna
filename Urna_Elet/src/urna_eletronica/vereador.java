
package urna_eletronica;

import javax.swing.JOptionPane;

public class vereador {
   private int votoV;
   public String nomeV;
   public String patidoV;
   public int numeroV;

    @Override
    public String toString() { // String com todos os dados
        return "nome do Vereador : " + nomeV + ", patido do Vereador : " + patidoV + ", numero do Vereador :" + numeroV;
    }

    public int getVotoV() { // retorna voto
        return votoV;
    }

    public vereador() { // cadastro de vereador
        
        setNomeV(JOptionPane.showInputDialog("Nome do vereador"));
        setPatidoV(JOptionPane.showInputDialog("Partido do vereador"));
        setNumeroV(Integer.parseInt(JOptionPane.showInputDialog("Número do vereador")));
        this.votoV = 0; // inicia a votação no 0
    
    }

    public String getNomeV() { // retorna nome
        return nomeV;
    }

    public void setNomeV(String nomeV) {  // coloca na variavel nome  
        this.nomeV = nomeV;
    }

    public String getPatidoV() { // retorna partido
        return patidoV;
    }

    public void setPatidoV(String patidoV) {    // coloca na variavel partido
        this.patidoV = patidoV;
    }

    public int getNumeroV() {   //retorna numero
        return numeroV;
    }

    public void setNumeroV(int numeroV) { //coloca na variavel numero 
        this.numeroV = numeroV;
    }

    public void setVotoV(int votoV) { // coloca na variavel voto
        this.votoV = votoV;
    }
    
    public void addVotoV(){ // adiciona um voto na variavel
        setVotoV(getVotoV() + 1);
    }
   
   
   
}
