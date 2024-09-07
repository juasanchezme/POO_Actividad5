
package Notas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
* Esta clase denominada VentanaPrincipal define una interfaz grafica
* que permitira crear un array de notas. Luego, se puede calcular el
* promedio de notas, la desviacion, la nota mayor y la nota menor del array.
* @version 1.2/2020
*/
public class VentanaPrincipal extends JFrame implements ActionListener {
    // Un contenedor de elementos graficos
    private Container contenedor;
    // Etiquetas estaticas de cada nota
    private JLabel nota1, nota2, nota3, nota4, nota5, promedio, desviacion, mayor, menor;
    // Campos de ingreso de cada nota
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    // Botones para realizar calculos y para borrar las notas
    private JButton calcular, limpiar;

    /**
    * Constructor de la clase VentanaPrincipal
    */
    public VentanaPrincipal() {
        inicio();
        setTitle("Notas"); // Establece el titulo de la ventana
        setSize(280, 380); // Establece el tamano de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        // Establece que el boton de cerrar permitira salir de la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Establece que el tamano de la ventana no se puede cambiar
    }

    /**
    * Método que crea la ventana con sus diferentes componentes graficos
    */
    private void inicio() {
        contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // Establece que el contenedor no tiene un layout
        
        // Establece la etiqueta y el campo de texto de la nota 1
        nota1 = new JLabel();
        nota1.setText("Nota 1:");
        nota1.setBounds(20, 20, 135, 23); // Establece la posicion de la etiqueta nota 1
        campoNota1 = new JTextField();
        // Establece la posicion del campo de texto de la nota 1
        campoNota1.setBounds(105, 20, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 2
        nota2 = new JLabel();
        nota2.setText("Nota 2:");
        nota2.setBounds(20, 50, 135, 23); // Establece la posicion de la etiqueta nota 2
        campoNota2 = new JTextField();
        // Establece la posicion del campo de texto de la nota 2
        campoNota2.setBounds(105, 50, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 3
        nota3 = new JLabel();
        nota3.setText("Nota 3:");
        nota3.setBounds(20, 80, 135, 23); // Establece la posicion de la etiqueta nota 3
        campoNota3 = new JTextField();
        // Establece la posicion del campo de texto de la nota 3
        campoNota3.setBounds(105, 80, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 4
        nota4 = new JLabel();
        nota4.setText("Nota 4:");
        nota4.setBounds(20, 110, 135, 23); // Establece la posicion de la etiqueta nota 4
        campoNota4 = new JTextField();
        // Establece la posicion del campo de texto de la nota 4
        campoNota4.setBounds(105, 110, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 5
        nota5 = new JLabel();
        nota5.setText("Nota 5:");
        nota5.setBounds(20, 140, 135, 23); // Establece la posicion de la etiqueta nota 5
        campoNota5 = new JTextField();
        // Establece la posicion del campo de texto de la nota 5
        campoNota5.setBounds(105, 140, 135, 23);

        // Establece el boton Calcular
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(20, 170, 100, 23); // Establece la posicion del boton Calcular
        // Agrega al boton un ActionListener para que gestione eventos del boton
        calcular.addActionListener(this);

        // Establece el boton Limpiar
        limpiar = new JButton();
        limpiar.setText("Limpiar");
        limpiar.setBounds(125, 170, 80, 23); // Establece la posicion del boton Limpiar
        // Agrega al boton un ActionListener para que gestione eventos del boton
        limpiar.addActionListener(this);

        // Establece la etiqueta del promedio con su valor numerico
        promedio = new JLabel();
        promedio.setText("Promedio = ");
        promedio.setBounds(20, 210, 135, 23); // Establece la posicion de la etiqueta promedio

        // Establece la etiqueta de la desviacion con su valor numerico
        desviacion = new JLabel();
        desviacion.setText("Desviacion = ");
        desviacion.setBounds(20, 240, 200, 23); // Establece la posicion de la etiqueta desviacion

        // Establece la etiqueta de la nota mayor con su valor numerico
        mayor = new JLabel();
        mayor.setText("Nota mayor = ");
        mayor.setBounds(20, 270, 120, 23); // Establece la posicion de la etiqueta nota mayor

        // Establece la etiqueta de la nota menor con su valor numerico
        menor = new JLabel();
        menor.setText("Nota menor = ");
        menor.setBounds(20, 300, 120, 23); // Establece la posicion de la etiqueta nota menor

        // Se añade cada componente grafico al contenedor de la ventana
        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviacion);
        contenedor.add(mayor);
        contenedor.add(menor);
    }

    /**
    * Método para gestionar eventos de los botones
    * @param evento El evento que se generó
    */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) { // Si se pulsa el botón Calcular
            Notas misNotas = new Notas(); // Se crea un objeto de la clase Notas
            misNotas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
            misNotas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
            misNotas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
            misNotas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
            misNotas.listaNotas[4] = Double.parseDouble(campoNota5.getText());

            // Calcula el promedio y lo muestra en la etiqueta promedio
            promedio.setText("Promedio = " + String.valueOf(misNotas.calcularPromedio()));
            // Calcula la desviacion y lo muestra en la etiqueta desviacion
            desviacion.setText("Desviacion = " + String.valueOf(misNotas.calcularDesviacion()));
            // Calcula la nota mayor y lo muestra en la etiqueta mayor
            mayor.setText("Nota mayor = " + String.valueOf(misNotas.calcularMayor()));
            // Calcula la nota menor y lo muestra en la etiqueta menor
            menor.setText("Nota menor = " + String.valueOf(misNotas.calcularMenor()));
        }

        if (evento.getSource() == limpiar) { // Si se pulsa el botón Limpiar
            // Se establecen los campos de texto a vacios
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            // Se establecen las etiquetas a sus valores iniciales
            promedio.setText("Promedio = ");
            desviacion.setText("Desviacion = ");
            mayor.setText("Nota mayor = ");
            menor.setText("Nota menor = ");
        }
    }
 }
    