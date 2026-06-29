import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class InventarioApp extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("Sistema de Inventario");

        TextField codigo = new TextField();
        TextField producto = new TextField();
        TextField categoria = new TextField();
        TextField precio = new TextField();
        TextField cantidad = new TextField();
        TextField proveedor = new TextField();

        ComboBox<String> estado = new ComboBox<>();
        estado.getItems().addAll("Disponible", "Agotado", "Bajo inventario");

        CheckBox perecedero = new CheckBox("Perecedero");
        CheckBox refrigeracion = new CheckBox("Requiere refrigeración");
        CheckBox importado = new CheckBox("Importado");

        Button guardar = new Button("Guardar");
        Button editar = new Button("Editar");
        Button eliminar = new Button("Eliminar");
        Button buscar = new Button("Buscar");

        TableView<String> tabla = new TableView<>();

        GridPane form = new GridPane();
        form.setVgap(8);
        form.setHgap(10);

        form.add(new Label("Código:"), 0, 0);
        form.add(codigo, 1, 0);

        form.add(new Label("Producto:"), 0, 1);
        form.add(producto, 1, 1);

        form.add(new Label("Categoría:"), 0, 2);
        form.add(categoria, 1, 2);

        form.add(new Label("Precio:"), 0, 3);
        form.add(precio, 1, 3);

        form.add(new Label("Cantidad:"), 0, 4);
        form.add(cantidad, 1, 4);

        form.add(new Label("Proveedor:"), 0, 5);
        form.add(proveedor, 1, 5);

        form.add(new Label("Estado:"), 0, 6);
        form.add(estado, 1, 6);

        HBox checks = new HBox(10, perecedero, refrigeracion, importado);
        HBox botones = new HBox(10, guardar, editar, eliminar, buscar);

        VBox root = new VBox(12, titulo, form, checks, botones, tabla);
        root.setPadding(new Insets(15));
        root.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(root, 650, 520);

        stage.setTitle("Inventario");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}