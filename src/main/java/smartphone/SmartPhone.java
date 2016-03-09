package smartphone;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;
import java.util.Random;

/**
 * Created by Vladimir.
 */
public class SmartPhone {
    //keep fields private
    private String model;
    private Date creationDate;
    private String revision;

    //fixed constructor parameter names
    public SmartPhone(String model, Date creationDate, String revision) {
        this.model = model;
        this.creationDate = creationDate;
        this.revision = revision;
    }

    /*
    Re-generated the equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmartPhone that = (SmartPhone) o;

        if (!creationDate.equals(that.creationDate)) return false;
        if (!model.equals(that.model)) return false;
        if (!revision.equals(that.revision)) return false;

        return true;
    }

    /*
    Substituted random hashCode with the proper one.
    Random-value hash-code doesn't work effectively with java collections.
     */
    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + creationDate.hashCode();
        result = 31 * result + revision.hashCode();
        return result;
    }

    //Nice to have -- we'll need it someday.
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("model", model)
                .append("creationDate", creationDate)
                .append("revision", revision)
                .toString();
    }

     /*
    Getters and setters are skipped
     */
}