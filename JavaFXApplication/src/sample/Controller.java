package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    @FXML
    private WebView webView;

    public void initialize(){
//        label.setScaleX(2.0);
//        label.setScaleY(2.0);
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter(){             //label grows when mouse is hovered over it
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit(){              //label returns to normal size when mouse is not hovered over it
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClick(){          //selects option to choose file or directory
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Zip", "*.zip"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        //DirectoryChooser chooser = new DirectoryChooser();
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (file != null){
            for (int i =0; i< file.size(); i++){
                System.out.println(file.get(i));
            }
            //System.out.println(file.getPath());
        }else {
            System.out.println("Chooser was cancelled");
        }
    }

    @FXML
    public void handleLinkClick(){              //creates hyperlink to website
        System.out.println("The link has been clicked");
//        try{
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }catch (URISyntaxException e){
//            e.printStackTrace();
//        }

        WebEngine engine = webView.getEngine();
        engine.load("http://www.javafx.com");
    }


}
