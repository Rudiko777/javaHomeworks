package box1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Elements{
    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 200, 600, 600);

        milanBtn.addActionListener(new Event());
        madridBtn.addActionListener(new Event());
        endMatch.addActionListener(new Event());

        panelTeams.add(milanBtn);
        panelTeams.add(endMatch);
        panelTeams.add(madridBtn);
        panelInfo.setPreferredSize(new Dimension(400,400));
        panelInfo.add(panelTeams);
        panelInfo.add(result);
        panelInfo.add(lastScorer);
        panelInfo.add(winner);
        panelInfo.setBackground(Color.cyan);


        frame.getContentPane().add(panelInfo);


        frame.pack();
        frame.setVisible(true);
    }

    public static class Event extends Elements implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == milanBtn) {
                milanGoal++;
                result.setText("Result: " + milanGoal + " X " + madridGoal);
                lastScorer.setText("Last Scorer: AC Milan");
            } else if (event.getSource() == madridBtn) {
                madridGoal++;
                result.setText("Result: " + milanGoal + " X " + madridGoal);
                lastScorer.setText("Last Scorer: Real Madrid");
            }
            else {
                if (milanGoal > madridGoal){
                    winner.setText("Winner: AC Milan");
                }
                else if(madridGoal > milanGoal){
                    winner.setText("Winner: Real Madrid");
                }
                else {
                    winner.setText("Winner: Draw");
                }
            }
        }
    }
}