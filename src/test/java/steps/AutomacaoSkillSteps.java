package steps;

import bean.AutomacaoSkillBean;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AutomacaoSkillPage;

public class AutomacaoSkillSteps {
    @Given("que preencho os campos de cadastro nome {string}, email {string}, telefone {string}, estado {string}, cidade {string}")
    public void preencherCampos(String nome,String email,String telefone, String estado,String cidade) {
        AutomacaoSkillBean automacaoSkillBean = new AutomacaoSkillBean();
        automacaoSkillBean.setNome(nome);
        automacaoSkillBean.setEmail(email);
        automacaoSkillBean.setTelefone(telefone);
        automacaoSkillBean.setEstado(estado);
        automacaoSkillBean.setCidade(cidade);
        AutomacaoSkillPage.preencherCampos(automacaoSkillBean);
    }
    @When("clico no botao EU QUERO")
    public void clicoBotaoEuQuero() {
        AutomacaoSkillPage.clicoBotaoEuQuero();
    }
    @When("aluno deve ser cadastrado com sucesso")
    public void alunoCadastradoSucesso() {
        //site descontinuado impossivel de validar cadastro
    }

}
