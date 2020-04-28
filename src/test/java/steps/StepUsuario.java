package steps;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepUsuario {
	
	@Dado("^uum cadastro endpoint \"([^\"]*)\"$")
	public void uumCadastroEndpoint(String arendpoint) throws Throwable {
		
		//RestAssured.given().contentType(ContentType.JSON).body(myJson).when().post(endPoint).then().statusCode(201)
	}

	@Dado("^adiciono um telefone \"([^\"]*)\" e um cpf \"([^\"]*)\"$")
	public void adicionoUmTelefoneEUmCpf(String telefone, String cpf) throws Throwable {
		String myJson = "{\"nome\":\"Severino Teste\"," + "\"cpf\": "+cpf+","
				+ "\"enderecos\":[{\"logradouro\":\"Rua inacio alvarez\"," + "\"numero\":22,\"complemento\":\"Casa\","
				+ "\"bairro\":\"Jardim Helena\"," + "\"cidade\":\"São Paulo\"," + "\"estado\":\"SP\"}],"
				+ "\"telefones\":[{\"ddd\":\"11\"," + "\"numero\":"+telefone+"}]}";
		RestAssured.given().contentType(ContentType.JSON).body(myJson).when().post("/pessoas").then().statusCode(201);
	}
	
	
	@Dado("^o endpoint \"([^\"]*)\"$")
	public void oEndpoint(String endPoint) {
	
		String myJson = "{\"nome\":\"Severino Teste\"," + "\"cpf\":\"06598677458\","
				+ "\"enderecos\":[{\"logradouro\":\"Rua inacio alvarez\"," + "\"numero\":22,\"complemento\":\"Casa\","
				+ "\"bairro\":\"Jardim Helena\"," + "\"cidade\":\"São Paulo\"," + "\"estado\":\"SP\"}],"
				+ "\"telefones\":[{\"ddd\":\"11\"," + "\"numero\":\"969673875\"}]}";
		
		RestAssured.given().contentType(ContentType.JSON).body(myJson).when().post(endPoint).then().statusCode(201);

	}

@Dado("^adiciono ddd com \"([^\"]*)\" o valor que exista e o celular \"([^\"]*)\" valido$")
public void adicionoDddComOValorQueExistaEOCelularValido(String ddd, String numero) throws Throwable {
	RestAssured.when().get("/pessoas/"+ddd+numero).then().statusCode(200);
}

	
	
	@Dado("^adiciono um telefone e um cpf$")
	public void adicionoUmTelefoneEUmCpf() {
		
	}

	@Quando("^eu enviar um post para a API$")
	public void euEnviarUmPostParaAAPI(){
		
	}

	@Entao("^eu recebo um status code de sucesso$")
	public void euReceboUmStatusCodeDeSucesso(){
		
	}
	
	@Dado("^que eu adiciono o endpoint \"([^\"]*)\"$")
	public void queEuAdicionoOEndpoint(String baseUri) {
		RestAssured.given().baseUri(baseUri).basePath("/pessoas");
	}

	@Dado("^adiciono o ddd com o valor$")
	public void adicionoODddComOValor() {
		RestAssured.when().get();

	}

	@Quando("^adiciono o telefone com o valor$")
	public void adicionoOTelefoneComOValor() {
		RestAssured.when().get();
	}

	@Entao("^eu visualizo a mensagem sucesso$")
	public void euVisualizoAMensagemSucesso() {
		RestAssured.when().get("/pessoas/11/969673875").then().statusCode(200);
	}

	@Dado("^que eu adiciono o endpoint \"([^\"]*)\" na porta invalida$")
	public void queEuAdicionoOEndpointNaPortaInvalida(String baseUri) {

		RestAssured.given().baseUri(baseUri).get("/pessoas/11/" + "969673875").then().statusCode(400);

	}

	@Dado("^adiciono ddd com \"([^\"]*)\" o valor que nao exista e \"([^\"]*)\" celular valido$")
	public void adicionoDddComOValorQueNaoExistaECelularValido(String ddd, String numero) {
	}

	@Quando("^adiciono o telefone com o valor \"([^\"]*)\"$")
	public void adicionoOTelefoneComOValor(String numero) throws Throwable {
		RestAssured.when().get("/pessoas/11/" + numero).then().statusCode(200);
	}

}
