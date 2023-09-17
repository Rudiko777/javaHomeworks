package box1;

import javax.swing.*;
import java.awt.*;

public class Elements {
    protected static JButton milanBtn = new JButton("AC Milan");
    protected static JButton madridBtn = new JButton("Real Madrid");
    protected static JButton endMatch = new JButton("End Match");
    protected static JPanel panelTeams = new JPanel(new GridLayout(1, 3));
    protected static JPanel panelInfo = new JPanel(new GridLayout(4, 1));

    protected static JLabel result = new JLabel("Result: 0 X 0", JLabel.CENTER);
    protected static JLabel lastScorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
    protected static Label winner = new Label("Winner: N/A", Label.CENTER);
    protected static JFrame frame = new JFrame("Football Match");
    protected static int milanGoal = 0;
    protected static int madridGoal = 0;
}
