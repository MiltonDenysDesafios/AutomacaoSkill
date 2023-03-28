package pages;

import bean.AutomacaoSkillBean;
import org.openqa.selenium.By;

public class AutomacaoSkillPage extends BasePage{


    public static String nome = "//input[@name='QDNome']";
    public static String email = "//input[@name='QDEmail']";
    public static String telefone = "//input[@name='QDFone']";
    public static String estado = "//span[@id='select2-estadoGeoQD1-container']";
    public static String cidade = "//span[@id='select2-cidadeGeoQD1-container']";
    public static String end = "//input[@name='txtEndereco']";

    public static void preencherCampos(AutomacaoSkillBean automacaoSkillBean){
        try {
            write(By.xpath(nome),automacaoSkillBean.getNome());
            write(By.xpath(email),automacaoSkillBean.getEmail());
            write(By.xpath(telefone),automacaoSkillBean.getTelefone());
            //write(By.xpath(end),automacaoSkillBean.getEndereco());
        } catch (Exception e) {
            System.err.println("Erro ao tentar preencher os campos");
        }
    }
    public static void preencherEstado(AutomacaoSkillBean automacaoSkillBean){
        try {
            click(By.xpath(estado));
            write(By.xpath(estado),automacaoSkillBean.getNome());
        } catch (Exception e) {

        }

    }
    public static void preencherCidade(){

    }

}
