package cat.itb.lja.apitaskt.taskt.model.entitats;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {
    @Id
    private int idItem;
    private int idLlista;
    private String nomItem;
    private int position;
    private boolean isChecked;

    @ManyToOne
    @JoinTable(name = "llista")
    @JoinColumn(name = "idLlista")
    private Llista llista;
}
