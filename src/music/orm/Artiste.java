package music.orm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Artiste {
    private int id;
    private String nom;
    private boolean estchanteur;
    private Collection<Album> albumsById = new HashSet<>();
    private Collection<Membregroupe> membregroupesById = new HashSet<>();

    public Artiste() {
    }

    public Artiste(String nom, boolean estchanteur) {
        this.nom = nom;
        this.estchanteur = estchanteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstchanteur() {
        return estchanteur;
    }

    public void setEstchanteur(boolean estchanteur) {
        this.estchanteur = estchanteur;
    }

    public Collection<Album> getAlbumsById() {
        return albumsById;
    }

    public void setAlbumsById(Collection<Album> albumsById) {
        this.albumsById = albumsById;
    }

    public Collection<Membregroupe> getMembregroupesById() {
        return membregroupesById;
    }

    public void setMembregroupesById(Collection<Membregroupe> membregroupesById) {
        this.membregroupesById = membregroupesById;
    }
}
