package sample;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class controllershifumi {
    int a;
    int b;
    int c;
    @FXML
    private Label winner;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Label scoreme;

    @FXML
    private Label scoreordi;

    @FXML
    private Button two;

    @FXML






    public void proc(ActionEvent event) {
        a =(int)(Math.random()*3);
        if (event.getSource() == zero && a == 2){
            b = Integer.parseInt(scoreme.getText());
            b++;
            scoreme.setText(String.valueOf(b));

        }else if (event.getSource() == two && a == 1){
            b = Integer.parseInt(scoreme.getText());
            b++;
            scoreme.setText(String.valueOf(b));

        }else if (event.getSource() == one && a == 0){
            int b = Integer.parseInt(scoreme.getText());
            b++;
            scoreme.setText(String.valueOf(b));

        }else if (event.getSource() == two && a == 0){
            c = Integer.parseInt(scoreordi.getText());
            c++;
            scoreordi.setText(String.valueOf(c));

        }else if (event.getSource() == one && a == 2){
            c = Integer.parseInt(scoreordi.getText());
            c++;
            scoreordi.setText(String.valueOf(c));

        }else if (event.getSource() == zero && a == 1){
            c = Integer.parseInt(scoreordi.getText());
            c++;
            scoreordi.setText(String.valueOf(c));

        }else if ((Integer.parseInt(scoreordi.getText())) == (Integer.parseInt(scoreme.getText()))){
            winner.setText("Votre Score Est égale à Celui de l'Ordinateur");
        }else if ((Integer.parseInt(scoreordi.getText()))>(Integer.parseInt(scoreme.getText()))){
            winner.setText("L'ordinateur a Gagné");
        }else if ((Integer.parseInt(scoreme.getText()))>(Integer.parseInt(scoreordi.getText()))){
            winner.setText("Vous Avez Gagné");
        }
    }
}
