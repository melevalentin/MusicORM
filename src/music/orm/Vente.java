package music.orm;

import java.util.Objects;

public class Vente {
    private int id;
    private int mois;
    private int annee;
    private int nbventes;
    private Album albumByIdalbum;

    public Vente() {
    }

    public Vente(int mois, int annee, int nbventes, Album albumByIdalbum) {
        this.mois = mois;
        this.annee = annee;
        this.nbventes = nbventes;
        this.albumByIdalbum = albumByIdalbum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNbventes() {
        return nbventes;
    }

    public void setNbventes(int nbventes) {
        this.nbventes = nbventes;
    }

    public Album getAlbumByIdalbum() {
        return albumByIdalbum;
    }

    public void setAlbumByIdalbum(Album albumByIdalbum) {
        this.albumByIdalbum = albumByIdalbum;
    }
}
