import javax.swing.*;


public class Lab4 {

    private static boolean isNumeric(String temp){
        try
        {
            Integer.parseInt(temp);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static void main (String[] args) {

        JFrame frame = new JFrame();
        String temp;

        do {
            JOptionPane.showMessageDialog(frame, "Париж є столицею...");
            temp = JOptionPane.showInputDialog(frame, " 1.Франції\n" + " 2.Америки\n" + " 3.Сложно вирубай\n");
        } while (temp == null || !isNumeric(temp) || temp.equals("") || Integer.parseInt(temp) == 1 && Integer.parseInt(temp) ==3);

        int sd = Integer.parseInt(temp);

        switch (sd) {
            case 1:
                JOptionPane.showMessageDialog(frame, "Вірно");
                System.exit(0);
                break;
            case 2:
                JOptionPane.showMessageDialog(frame, "Спробуйте ще раз");
                System.exit(0);
                break;
            case 3:
                JOptionPane.showMessageDialog(frame, "Вихід");
                System.exit(0);
                break;
        }

    }
}
