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
    private HashMap<HashSet<String>, String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        frases = new ArrayList<String>();
        respuestas = new HashMap<>();

        frases.add("cuentenos su problema señor");
        frases.add("Le pondremos en contacto con un especialista");
        frases.add("tenga paciencia señor estamos saturados en este momento");
        frases.add("Señor esta usted siendo borde conmigo, respeteme por favor");
        frases.add("Le paso con mi superior que tenga un buen dia :) ");
        
        
        HashSet<String> set01 = new HashSet<>();
        set01.add("gratis");
        set01.add("app");
        
        HashSet<String> set02 = new HashSet<>();
        set02.add("gratis");

        HashSet<String> set03 = new HashSet<>();
        set03.add("app");
        
        HashSet<String> set04 = new HashSet<>();
        set04.add("problema");
        set04.add("linux");
        set04.add("crasea");
        
        
        respuestas.put(set04,"yo creo que ese es un problema de tu hardware deverias actualizarlo");
        respuestas.put(set01,"voy a informar sobre ese error a mi superior espere un momento");
        respuestas.put(set02,"vuelve a instalar el sistema operativo desde cero");
        respuestas.put(set03,"¿ha probado si el cable de corriente esta enchufado?");
    }

   
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> palabra)
    {
        String response = null;
       
        response = respuestas.get(palabra);
        
        
        
        
                if (response == null){
                
                response = frases.get(aleatorio.nextInt(frases.size()));
                
                    
            }
        return response;
    }
}
