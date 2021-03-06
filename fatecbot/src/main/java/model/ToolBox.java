package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ToolBox {
	
	/**
	 * 
	 * @return JsonObject - Objeto Json com as informações do arquivo de configuração
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public static JsonObject loadKeys() throws FileNotFoundException, IOException, ParseException {

		JsonElement parser = new JsonParser().parse(new FileReader("config/keys.json"));

		return parser.getAsJsonObject();
	}
}
