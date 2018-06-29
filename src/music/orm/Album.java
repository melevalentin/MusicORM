package music.orm;

import java.util.*;

public class Album {
    private int id;
    private String titre;
    private String genre;
    private Date datesortie;
    private float prix;
    private Groupe groupeByIdgroupe;
    private Artiste artisteByIdartiste;
    private Collection<Contenu> contenusById = new HashSet<>();
    private Collection<Vente> ventesById = new HashSet<>();
    private AlbumInfos albumInfos;

    public Album() {
    }

    public Album(String titre, String genre, Date datesortie, float prix, Groupe groupeByIdgroupe, Artiste artisteByIdartiste) {
        this.titre = titre;
        this.genre = genre;
        this.datesortie = datesortie;
        this.prix = prix;
        this.groupeByIdgroupe = groupeByIdgroupe;
        this.artisteByIdartiste = artisteByIdartiste;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Groupe getGroupeByIdgroupe() {
        return groupeByIdgroupe;
    }

    public void setGroupeByIdgroupe(Groupe groupeByIdgroupe) {
        this.groupeByIdgroupe = groupeByIdgroupe;
    }

    public Artiste getArtisteByIdartiste() {
        return artisteByIdartiste;
    }

    public void setArtisteByIdartiste(Artiste artisteByIdartiste) {
        this.artisteByIdartiste = artisteByIdartiste;
    }

    public Collection<Contenu> getContenusById() {
        return contenusById;
    }

    public void setContenusById(Collection<Contenu> contenusById) {
        this.contenusById = contenusById;
    }

    public Collection<Vente> getVentesById() {
        return ventesById;
    }

    public void setVentesById(Collection<Vente> ventesById) {
        this.ventesById = ventesById;
    }

    public AlbumInfos getAlbumInfos() {
        return albumInfos;
    }

    public void setAlbumInfos(AlbumInfos albumInfos) {
        this.albumInfos = albumInfos;
    }
}
