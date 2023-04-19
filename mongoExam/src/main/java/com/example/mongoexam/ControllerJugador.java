package com.example.mongoexam;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerJugador {
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApe1;
    @FXML
    private TextField txtApe2;
    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtPosicion;
    @FXML
    private TextField txtEquipo;
    @FXML
    private Button btnActu;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnMostrar;
    @FXML
    private Button btnBorrar;
    @FXML
    private Label lblResults;

    ConexionMongo cmn = new ConexionMongo();

    public void guardar() {
        Jugador jugador = new Jugador();
        jugador.setIdJugador(Integer.parseInt(txtId.getText()));
        jugador.setApellidoP(txtApe1.getText());
        jugador.setApellidoM(txtApe2.getText());
        jugador.setEquipo(txtEquipo.getText());
        jugador.setPosicion(txtPosicion.getText());
        jugador.setNumeroJ(Integer.parseInt(txtNumero.getText()));
        if (cmn.insertar(jugador) == true) {
            lblResults.setText("Los datos se guardaron con exito.");
        } else {
            lblResults.setText("Hubo un error al guardar los datos");
        }
    }

    public void actualizar() {
        Jugador jugadorAnterior = new Jugador();
        Jugador jugadorNuevo = new Jugador();
        if (txtId!=null){
   jugadorNuevo.setIdJugador(Integer.parseInt(txtId.getText()));
   jugadorNuevo.setIdJugador(Integer.parseInt(txtId.getText()));
   jugadorNuevo.setNombre(txtNombre.getText());
   jugadorNuevo.setApellidoP(txtApe1.getText());
   jugadorNuevo.setApellidoM(txtApe2.getText());
   jugadorNuevo.setEquipo(txtEquipo.getText());
   jugadorNuevo.setPosicion(txtPosicion.getText());
jugadorNuevo.setNumeroJ(Integer.parseInt(txtNumero.getText()));


            if (cmn.actualizar(jugadorAnterior,jugadorNuevo)==true){
                lblResults.setText("Los datos se actualizaron con exito.");
            } else{
                lblResults.setText("Hubo un error al actualizar los datos");
            }
        } else{
            txtId.setText("Asigna un valor al id");
        }
    }
    public void mostrar(){
        if(cmn.mostrar()==true){
            lblResults.setText("Los datos fueron mostrados en la consola");
            clean();
        } else{
            lblResults.setText("Hubo un error al mostrar los datos");
            clean();
        }
    }
    public void eliminar(){
        if(txtId!=null) {
            int idAlumno = Integer.parseInt(txtId.getText());
            if (cmn.eliminar(idAlumno) == true) {
                lblResults.setText("El registro fue eliminado con exito");
                clean();
            } else {
                lblResults.setText("Error al eliminar el registro");
            }
        } else{
            txtId.setText("Asigna un valor al id");
        }
    }
    public void clean(){
     txtId.setText("");
     txtMatricula.setText("");;
    txtNombre.setText("");;
     txtPrimerApellido.setText("");;
     txtSegundoApellido.setText("");;
    txtCarrera.setText("");;
    btnGuardar.setText("");;
   lblResultado.setText("");;
   btnActualizar.setText("");;
   btnBorrar.setText("");;
   btnMostrar.setText("");;
}


