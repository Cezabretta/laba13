package ru.guu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Создаем Label и TextField для ввода чисел
        Label label1 = new Label("Введите первое число:");
        TextField numberField1 = new TextField();
        
        Label label2 = new Label("Введите второе число:");
        TextField numberField2 = new TextField();

        // Создаем кнопку для вычисления и Label для отображения результата
        Button calculateButton = new Button("Посчитать сумму");
        Label resultLabel = new Label("Сумма: ");

        // Устанавливаем обработчик события нажатия на кнопку
        calculateButton.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(numberField1.getText());
                double num2 = Double.parseDouble(numberField2.getText());
                double sum = num1 + num2;
                resultLabel.setText("Сумма: " + sum);
            } catch (NumberFormatException e) {
                resultLabel.setText("Ошибка ввода");
            }
        });

        // Создаем контейнер (панель) для элементов
        VBox root = new VBox(10); // 10 - это расстояние между элементами
        
        // Добавляем все элементы в контейнер
        root.getChildren().addAll(label1, numberField1, label2, numberField2, calculateButton, resultLabel);

        // Создаем сцену с панелью root и устанавливаем размеры
        Scene scene = new Scene(root, 350, 250);

        // Настроим окно
        primaryStage.setTitle("Калькулятор");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
