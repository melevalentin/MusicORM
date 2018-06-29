package music.orm;

import java.util.Objects;

public class Membregroupe {
    private int id;
    private Groupe groupeByIdgroupe;
    private Artiste artisteByIdartiste;

    public Membregroupe() {
    }

    public Membregroupe(Groupe groupeByIdgroupe, Artiste artisteByIdartiste) {
        this.groupeByIdgroupe = groupeByIdgroupe;
        this.artisteByIdartiste = artisteByIdartiste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
