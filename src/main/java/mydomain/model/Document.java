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
    private byte[] byteArray;
    private Byte[] wrappedByteArray;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    public Byte[] getWrappedByteArray() {
        return wrappedByteArray;
    }

    public void setWrappedByteArray(Byte[] wrappedByteArray) {
        this.wrappedByteArray = wrappedByteArray;
    }

}
