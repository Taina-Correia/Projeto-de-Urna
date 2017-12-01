package urna_eletronica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class urna {
    private int numero;
    private prefeito[] pref;
    private vereador[] ver;
    
    public urna(int numero){ // construtor que ira pegar o numero da maquina de eleição
        this.numero = numero;
    }
    public void menu(){ // menu de navegação 
        int nani;
        do {
            nani = Integer.parseInt(JOptionPane.showInputDialog("\n ------------ Urna Eletronica ---------- \n"
                    + "1 - [Cadastro de Prefeitos  ]  \n"
                    + "2 - [Cadastro de Vereadores ]  \n"
                    + "3 - [Iniciar Eleição        ]  \n"
                    + "4 - [Resultado da Eleição  ]  \n"
                    + "5 - [Sair da Urna Eletronica]  \n"
                    + "\nDigite uma das opçoes acima    \n"));
            if (nani == 1) {
                cadastroprefeito();
            } else if (nani == 2) {
                cadastrovereador();
            } else if (nani == 3) {
                iniciavotacao();
            } else if (nani == 4) {
                Resultadovotacao();
            } else if (nani == 5) {
                JOptionPane.showMessageDialog(null, "Você decidiu sair");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inexistente");
            }
        } while (nani != 5);
    }
    
    public void cadastroprefeito()
    {
        pref = new prefeito[Integer.parseInt(JOptionPane.showInputDialog("Digite o número de prefeitos que deseja cadastrar "))];//tamanho do vetor
                for (int i = 0; i < pref.length; i++) {
                    prefeito num = new prefeito(); //instanciando vetor de objetos
                    pref[i] = num;
                }
    }
    
    public void cadastrovereador()
    {
        ver = new vereador[Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vereadores que deseja cadastrar "))]; // tamanho do vetor
                for (int i = 0; i < ver.length; i++) {
                    vereador num = new vereador(); // instanciando vetor de objetos 
                    ver[i] = num;
                }
    }
    
    public void iniciavotacao(){
        try {       // inicia votação dos prefeitos
                    String texto = "";
                    for (int i = 0; i < pref.length; i++) { // imprimi na tela os prefeitos existentes
                        texto += pref[i].toString();
                        texto += "\n";
                    }
                    texto += "\n Digite o numero do prefeito ";
                    int voto = Integer.parseInt(JOptionPane.showInputDialog(texto)); 

                    for (int i = 0; i < pref.length; i++) {
                        if (voto == pref[i].numeroP) {
                            pref[i].addVotoP(); // adiciona voto no prefeito
                        }
                    }

                    texto = "";
                    for (int i = 0; i < ver.length; i++) { // exibe a atual situação da votação
                        texto += ver[i].toString();
                        texto += "\n";
                    }// inícia votação dos vereadores 
                    texto += "\n Digite o numero do vereador ";
                    voto = Integer.parseInt(JOptionPane.showInputDialog(texto));

                    for (int i = 0; i < ver.length; i++) {
                        if (voto == ver[i].numeroV) {
                            ver[i].addVotoV(); // adiciona voto no vereador
                        }
                    }
                } catch (NumberFormatException exc) {
                    JOptionPane.showMessageDialog(null, " Erro no cadastro "); //erro de formatação de variavel
                } catch (NullPointerException exc) {
                    JOptionPane.showMessageDialog(null, " Erro no cadastro "); // erro se não existir os dois vetores 
                }
    }
    
    public void Resultadovotacao(){
        try {

                    String texto = "";
                    for (int i = 0; i < pref.length; i++) {
                        texto += pref[i].toString(); // exibe todas as informações do prefeito
                        texto += ", Total de Votos : " + pref[i].getVotoP() + "\n"; //concatena 
                    }
                    JOptionPane.showMessageDialog(null, texto);
                    texto = "";
                    for (int i = 0; i < ver.length; i++) {
                        texto += ver[i].toString();  //exibe todas as informações do vereador
                        texto += ", Total de Votos : " + ver[i].getVotoV() + "\n"; //concatena
                    }
                    JOptionPane.showMessageDialog(null, texto);
                } catch (NumberFormatException exc) {
                    JOptionPane.showMessageDialog(null, " Erro no cadastro "); // erro de conversão
                } catch (NullPointerException exc) {
                    JOptionPane.showMessageDialog(null, " Erro no cadastro  "); // erro se não existir os vetores obrigatorios
                }
    }
    
}
