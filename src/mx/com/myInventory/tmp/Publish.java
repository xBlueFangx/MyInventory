package mx.com.myInventory.tmp;

import javax.xml.ws.Endpoint;

import mx.com.myInventory.service.UsuarioSOAP;

public class Publish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8081/UserService", new UsuarioSOAP());
		System.out.println("Publicado");
	}

}
