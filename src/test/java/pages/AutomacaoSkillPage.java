package pages;

import bean.AutomacaoSkillBean;
import org.openqa.selenium.By;

public class AutomacaoSkillPage extends BasePage{


    public static String nomeCampo = "//input[@name='QDNome']";
    public static String emailCampo = "//input[@name='QDEmail']";
    public static String telefoneCampo = "//input[@name='QDFone']";
    public static String estadoCampo = "//span[@id='select2-estadoGeoQD1-container']";
    public static String estadoCampoList = "#select2-estadoGeoQD1-results";
    public static String cidadeCampo = "//span[@id='select2-cidadeGeoQD1-container']";
    public static String cidadeCampoList = "#select2-cidadeGeoQD1-results";
    public static String endCampo = "//input[@name='txtEndereco']";
    public static String checkButton = "//input[@id='checkAceito']";
    public static String euQueroButton = "//button[contains(text(),'EU QUERO')]";

    public static void preencherCampos(AutomacaoSkillBean automacaoSkillBean){
        try {
            write(By.xpath(nomeCampo),automacaoSkillBean.getNome());
            write(By.xpath(emailCampo),automacaoSkillBean.getEmail());
            write(By.xpath(telefoneCampo),automacaoSkillBean.getTelefone());
            preencherEstado(automacaoSkillBean.getEstado());
            preencherCidade(automacaoSkillBean.getCidade());
            click(By.xpath(checkButton));
            //write(By.xpath(endCampo),automacaoSkillBean.getEndereco());
        } catch (Exception e) {
            System.err.println("Erro ao tentar preencher os campos");
        }
    }
    public static void preencherEstado(String estado){
        try {
            click(By.xpath(estadoCampo));
            selectElementsList(By.cssSelector(estadoCampoList), "li");
            clickOnListOfElements(estado);
        } catch (Exception e) {
            System.err.println("Erro ao tentar preencher o campo de estado");
        }
    }
    public static void preencherCidade(String cidade){
        try {
            Thread.sleep(2000);
            waitUntilElementToBeSelected(By.xpath(cidadeCampo),10);
            click(By.xpath(cidadeCampo));
            selectElementsList(By.cssSelector(cidadeCampoList), "li");
            clickOnListOfElements(cidade);
        } catch (Exception e) {
            System.err.println("Erro ao tentar preencher o campo de cidade");
        }
    }
    public static void clicoBotaoEuQuero(){
        try {
            click(By.xpath(euQueroButton));
            System.out.println("pos clique");
        } catch (Exception e) {
            System.err.println("Erro ao tentar clicar no botao eu quero");
        }
    }


}
