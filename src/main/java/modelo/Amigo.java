package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

/**
 * Representa um amigo com id, nome e telefone.
 */
public class Amigo {

    private int idAmigo;
    private String nomeAmigo;
    private String telefone;
    AmigoDAO dao;

    /**
     * Construtor padrão para a classe Amigo. Inicializa o amigo com id, nome
     * e telefone vazios.
     */
    public Amigo() {
        this(0, "", "");
    }

    /**
     * Construtor para a classe Amigo. Inicializa o amigo com o id, nome e
     * telefone fornecidos.
     *
     * @param idAmigo O id do amigo
     * @param nomeCliente O nome do amigo.
     * @param telefone O telefone do amigo.
     */
    public Amigo(int idAmigo, String nomeAmigo, String telefone) {
        this.idAmigo = idAmigo;
        this.nomeAmigo = nomeAmigo;
        this.telefone = telefone;
    }

    /**
     * Obtém o nome do amigo.
     *
     * @return O nome do amigo.
     */
    public String getNomeAmigo() {
        return nomeAmigo;
    }

    /**
     * Define o nome do amigo.
     *
     * @param nomeAmigo O nome do amigo a ser definido.
     */
    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    /**
     * Obtém o telefone do amigo.
     *
     * @return O telefone do amigo.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do amigo.
     *
     * @param telefone O telefone do amigo a ser definido.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o ID do amigo.
     *
     * @return O ID do amigo.
     */
    public int getIdAmigo() {
        return idAmigo;
    }

    /**
     * Define o ID do amigo.
     *
     * @param idAmigo O ID do amigo a ser definido.
     */
    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    /**
     * Retorna uma lista de amigos.
     *
     * @return Uma lista de amigos.
     */
    public ArrayList<Amigo> listaAmigo() {
        return dao.getListaAmigo();
    }

    /**
     * Insere um amigo no banco de dados.
     *
     * @param nome O nome do amigo a ser inserido.
     * @param telefone O telefone do amigo a ser inserido.
     * @return true se a inserção for bem-sucedida, false caso contrário.
     */
    public boolean insertAmigoDB(String nome, String telefone) {
        int maiorID = dao.maiorIDAmigo() + 1;
        Amigo amigo = new Amigo(maiorID, nome, telefone);
        dao.insertAmigoDB(amigo);
        return true;
    }

    /**
     * Remove um amigo do banco de dados.
     *
     * @param id O ID do amigo a ser removido.
     * @return true se a remoção for bem-sucedida, false caso contrário.
     */
    public boolean deleteAmigoDB(int id) {
        dao.deleteAmigoDB(id);
        return true;
    }

    /**
     * Retorna o índice de um amigo na lista.
     *
     * @param id O ID do amigo a ser buscado.
     * @return O índice do amigo na lista.
     */
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AmigoDAO.listaAmigo.size(); i++) {
            if (AmigoDAO.listaAmigo.get(i).getIdAmigo() == id) {
                indice = i;
            }
        }
        return indice;
    }

    /**
     * Atualiza um amigo no banco de dados.
     *
     * @param id O ID do amigo a ser atualizado.
     * @param nome O novo nome do amigo.
     * @param telefone O novo telefone do amigo.
     * @return true se a atualização for bem-sucedida, false caso contrário.
     */
    public boolean updateAmigoDB(int id, String nome, String telefone) {
        Amigo amigo = new Amigo(id, nome, telefone);
        int indice = this.procuraIndice(id);
        dao.updateAmigoDB(amigo);
        return true;
    }

    /**
     * Retorna um amigo do banco de dados com base no ID.
     *
     * @param id O ID do amigo a ser recuperado.
     * @return O amigo recuperado do banco de dados.
     */
    public Amigo retrieveAmigoDB(int id) {
        return dao.retrieveAmigoDB(id);
    }

    /**
     * Retorna o maior ID de amigo no banco de dados.
     *
     * @return O maior ID de amigo no banco de dados.
     */
    public int MaiorID() {
        return dao.maiorIDAmigo();
    }
}
