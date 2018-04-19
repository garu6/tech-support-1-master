import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    
    private Random aleatorio;
    private ArrayList<String> frases;
    private HashMap<String, String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        frases = new ArrayList<String>();
        respuestas = new HashMap<String, String>();
        respuestasMap();
    }

    
    private void respuestasMap(){
        respuestas.put("lento", "yo creo que ese es un problema de tu hardware deverias actualizarlo");
        respuestas.put("cuelga", "vuelve a instalar el sistema operativo desde cero");
        respuestas.put("error", "voy a informar sobre ese error a mi superior espere un momento");
        respuestas.put("enciende", "¿ha probado si el cable de corriente esta enchufado?");
        respuestas.put("caro", "señor nuestros softwares siguen las tarifas extandares de la empresa");
        
        
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> palabra)
    {
        String response = null;
        String primera = "";
        Iterator<String> primeraPalabra = palabra.iterator();
        primera = primeraPalabra.next();
        response = respuestas.get(primera);
                if (response != null){
                    return response;
                    
                }else {
                
                frases.add("cuentenos su problema señor");
                frases.add("Le pondremos en contacto con un especialista");
                frases.add("tenga paciencia señor estamos saturados en este momento");
                frases.add("Señor esta usted siendo borde conmigo, respeteme por favor");
                frases.add("Le paso con mi superior que tenga un buen dia :) ");
                int numero = aleatorio.nextInt(frases.size()+1);
                String resultado = frases.get(numero);
                return resultado;
            }
    }
}
