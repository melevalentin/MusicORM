package music.orm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Morceau {
    private int id;
    private String titre;
    private String duree;
    private Collection<Contenu> contenusById = new HashSet<>();

    public Morceau() {
    }

    public Morceau(String titre, String duree) {
        this.titre = titre;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public Collection<Contenu> getContenusById() {
        return contenusById;
    }

    public void setContenusById(Collection<Contenu> contenusById) {
        this.contenusById = contenusById;
    }
}
