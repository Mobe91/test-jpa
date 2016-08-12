package mydomain.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created
 * by Moritz Becker (moritz.becker@gmx.at)
 * on 12.08.2016.
 */
@Entity
public class Document implements Serializable {

    private Long id;
    private NameObject nameObject;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Embedded
    public NameObject getNameObject() {
        return nameObject;
    }

    public void setNameObject(NameObject nameObject) {
        this.nameObject = nameObject;
    }
}
