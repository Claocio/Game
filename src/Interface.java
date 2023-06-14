import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame  {
    public JPanel painelPrincipal;
    private JRadioButton pedraBotao;
    private JRadioButton papelBotao;
    private JRadioButton tesouraBotao;
    private JButton JogarBotao;
    private JTextField resultadoText;

    private int sortear;
    public int sortear(int max, int min){
        java.util.Random rand = new java.util.Random();
            int randomNum = rand.nextInt((max - min)+ 1)+ min;
            return randomNum;
    }

    public Interface() {
    JogarBotao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                sortear = sortear(2,0);
                pedraBotao.getUIClassID().equals(0);
                papelBotao.getUIClassID().equals(1);
                tesouraBotao.getUIClassID().equals(2);

                if (papelBotao.isSelected() && sortear == 0){
                    resultadoText.setText("EMPATE");
                } else if (pedraBotao.isSelected() && sortear == 1) {
                    resultadoText.setText("EMPATE");
                } else if (tesouraBotao.isSelected() && sortear == 2) {
                    resultadoText.setText("EMPATE");
                } else if (papelBotao.isSelected() && sortear == 1) {
                    resultadoText.setText("VOCE GANHOU!");
                } else if (papelBotao.isSelected() && sortear == 2) {
                    resultadoText.setText("VOCE PERDEU!");
                } else if (pedraBotao.isSelected() && sortear == 0) {
                    resultadoText.setText("VOCE PERDEU");
                } else if (pedraBotao.isSelected() && sortear == 2) {
                    resultadoText.setText("VOCE GANHOU!");
                } else if (tesouraBotao.isSelected() && sortear == 0) {
                    resultadoText.setText("VOCE GANHOU!");
                } else if (tesouraBotao.isSelected() && sortear == 1) {
                    resultadoText.setText("VOCE PERDEU!");
                }

        }

    });
}
}
