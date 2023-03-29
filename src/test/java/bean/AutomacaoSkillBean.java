package bean;

public class AutomacaoSkillBean {

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String estado;
    private String cidade;

    public AutomacaoSkillBean() {
    }

    public AutomacaoSkillBean(String nome, String email, String telefone, String estado, String cidade) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
