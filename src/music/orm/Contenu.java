package music.orm;

import java.util.Objects;

public class Contenu {
    private int id;
    private Morceau morceauByIdmorceau;
    private Album albumByIdalbum;

    public Contenu() {
    }

    public Contenu(Morceau morceauByIdmorceau, Album albumByIdalbum) {
        this.morceauByIdmorceau = morceauByIdmorceau;
        this.albumByIdalbum = albumByIdalbum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Morceau getMorceauByIdmorceau() {
        return morceauByIdmorceau;
    }

    public void setMorceauByIdmorceau(Morceau morceauByIdmorceau) {
        this.morceauByIdmorceau = morceauByIdmorceau;
    }

    public Album getAlbumByIdalbum() {
        return albumByIdalbum;
    }

    public void setAlbumByIdalbum(Album albumByIdalbum) {
        this.albumByIdalbum = albumByIdalbum;
    }
}
