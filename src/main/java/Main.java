import java.util.ResourceBundle;

public class Main {
    //Accedo al archivo environment.properties
    static ResourceBundle propretiesFileGeneral = ResourceBundle.getBundle("environment");

    public static void main(String[] args) {
        //Accedo y obtengo el valor de la key 'ambiente_activo_key' del archivo environment.properties
        String ambienteActivoValue = propretiesFileGeneral.getString("ambiente_activo_key");

        //Accedo al archivo .properties segun el valor que se haya almacenado en la variable anterior ambienteActivoValue
        ResourceBundle propertiesFileSegunProfileActivo = ResourceBundle.getBundle(ambienteActivoValue);

        //Accedo a el valor de la key conexion_database_key del archivo properties segun el profile activo
        String conexionDatabaseValue = propertiesFileSegunProfileActivo.getString("conexion_database_key");

        System.out.println(conexionDatabaseValue);

    }
}
