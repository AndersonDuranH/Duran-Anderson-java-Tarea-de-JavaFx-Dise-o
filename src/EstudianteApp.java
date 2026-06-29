import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EstudianteApp extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("Perfil de Estudiante");

        Circle foto = new Circle(40);

        TextField matricula = new TextField();
        TextField nombre = new TextField();
        TextField carrera = new TextField();
        TextField correo = new TextField();
        TextField telefono = new TextField();
        TextField direccion = new TextField();

        ComboBox<String> semestre = new ComboBox<>();
        semestre.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8");

        ListView<String> materias = new ListView<>();
        materias.getItems().addAll("Matemática", "Programación", "Base de Datos", "Inglés");

        TextArea observaciones = new TextArea();

        Button guardar = new Button("Guardar");
        Button actualizar = new Button("Actualizar");
        Button imprimir = new Button("Imprimir");

        GridPane form = new GridPane();
        form.setVgap(8);
        form.setHgap(10);

        form.add(new Label("Matrícula:"), 0, 0);
        form.add(matricula, 1, 0);

        form.add(new Label("Nombre:"), 0, 1);
        form.add(nombre, 1, 1);

        form.add(new Label("Carrera:"), 0, 2);
        form.add(carrera, 1, 2);

        form.add(new Label("Correo:"), 0, 3);
        form.add(correo, 1, 3);

        form.add(new Label("Teléfono:"), 0, 4);
        form.add(telefono, 1, 4);

        form.add(new Label("Dirección:"), 0, 5);
        form.add(direccion, 1, 5);

        form.add(new Label("Semestre:"), 0, 6);
        form.add(semestre, 1, 6);

        HBox fotoBox = new HBox(15, foto, titulo);

        VBox root = new VBox(12,
                fotoBox,
                form,
                new Label("Materias inscritas:"), materias,
                new Label("Observaciones:"), observaciones,
                new HBox(10, guardar, actualizar, imprimir)
        );

        root.setPadding(new Insets(15));
        root.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(root, 650, 600);

        stage.setTitle("Estudiante");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}