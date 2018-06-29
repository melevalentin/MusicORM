package music.orm;
import java.util.*;

public class AlbumInfos {

    private String titre;
    private Date dateSortie;
    private float prix;

    public AlbumInfos() {
    }

    public AlbumInfos(String titre, Date dateSortie, float prix) {
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
