package br.imd.fic.gerenciadordelixo.dominio;

public class Material {

    private Long id;
    private String tipo;
    private String quantidade;

    public Material(Long id, String tipo, String quantidade) {
        this.id = id;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
