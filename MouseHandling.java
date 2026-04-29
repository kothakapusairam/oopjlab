import java.awt.*;
import java.awt.event.*;

class MouseHandling extends Frame implements MouseListener {

    String msg = "";

    MouseHandling() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        msg = "Mouse Clicked at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse Entered Window";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse Exited Window";
        repaint();
    }

    public static void main(String args[]) {
        MouseHandling mh = new MouseHandling();
        mh.setTitle("Mouse Event Handling");
        mh.setSize(400, 300);
        mh.setVisible(true);

        mh.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 100);
    }
}