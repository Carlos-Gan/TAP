import javax.swing.*;

public class Password extends JFrame{
    JLabel nomUsuario = new JLabel("Nombre del Usuario: ");
    JLabel contraseña = new JLabel("Password del Usuario: ");
    JLabel comentarios = new JLabel("Comentarios");

    JTextField nomUser = new JTextField(12);
    JPasswordField contra = new JPasswordField(12);
    JTextArea comentario = new JTextArea(4, 12);

    public Password(){
        super("Area y Password");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnl = new JPanel();

        pnl.add(nomUsuario);
        pnl.add(nomUser);
        pnl.add(contraseña);
        pnl.add(contra);
        pnl.add(comentarios);
        pnl.add(comentario);

        comentario.setLineWrap(true); // Move this line inside the constructor

        setContentPane(pnl);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater( ()-> new Password());
    }
}