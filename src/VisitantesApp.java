import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VisitantesApp extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("Registro de Visitantes");

        TextField nombre = new TextField();
        TextField cedula = new TextField();
        TextField telefono = new TextField();
        TextField motivo = new TextField();
        TextField persona = new TextField();
        TextField fecha = new TextField();

        ComboBox<String> tipo = new ComboBox<>();
        tipo.getItems().addAll("Estudiante", "Padre/Madre", "Suplidor", "Invitado");

        RadioButton rCedula = new RadioButton("Cédula");
        RadioButton rPasaporte = new RadioButton("Pasaporte");
        RadioButton rCarnet = new RadioButton("Carnet");

        ToggleGroup grupoDoc = new ToggleGroup();
        rCedula.setToggleGroup(grupoDoc);
        rPasaporte.setToggleGroup(grupoDoc);
        rCarnet.setToggleGroup(grupoDoc);

        Button registrar = new Button("Registrar");
        Button limpiar = new Button("Limpiar");
        Button cancelar = new Button("Cancelar");

        TableView<String> tabla = new TableView<>();

        GridPane form = new GridPane();
        form.setVgap(8);
        form.setHgap(10);

        form.add(new Label("Nombre:"), 0, 0);
        form.add(nombre, 1, 0);

        form.add(new Label("Cédula:"), 0, 1);
        form.add(cedula, 1, 1);

        form.add(new Label("Teléfono:"), 0, 2);
        form.add(telefono, 1, 2);

        form.add(new Label("Motivo:"), 0, 3);
        form.add(motivo, 1, 3);

        form.add(new Label("Persona a visitar:"), 0, 4);
        form.add(persona, 1, 4);

        form.add(new Label("Fecha:"), 0, 5);
        form.add(fecha, 1, 5);

        form.add(new Label("Tipo:"), 0, 6);
        form.add(tipo, 1, 6);

        HBox radios = new HBox(10, rCedula, rPasaporte, rCarnet);

        HBox botones = new HBox(10, registrar, limpiar, cancelar);

        VBox root = new VBox(12, titulo, form, radios, botones, tabla);
        root.setPadding(new Insets(15));
        root.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("Visitantes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
