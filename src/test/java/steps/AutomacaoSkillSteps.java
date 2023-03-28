package steps;

import bean.AutomacaoSkillBean;
import io.cucumber.java.en.Given;
import pages.AutomacaoSkillPage;

public class AutomacaoSkillSteps {
    @Given("que preencho os campos de cadastro nome {string}, email {string}, telefone {string}, endereco {string}, estado {string}, cidade {string}")
    public void preencherCampos(String nome,String email,String telefone,String endereco,String estado,String cidade) {
        AutomacaoSkillBean automacaoSkillBean = new AutomacaoSkillBean();
        automacaoSkillBean.setNome(nome);
        automacaoSkillBean.setEmail(email);
        automacaoSkillBean.setTelefone(telefone);
        automacaoSkillBean.setEndereco(endereco);
        automacaoSkillBean.setEstado(estado);
        automacaoSkillBean.setCidade(cidade);
        AutomacaoSkillPage.preencherCampos(automacaoSkillBean);

    }

}
