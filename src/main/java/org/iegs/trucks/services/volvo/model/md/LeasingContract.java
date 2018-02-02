package org.iegs.trucks.services.volvo.model.md;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="leasecontract")

public class LeasingContract implements Serializable {
    @Id
    private long id;
    @Column(length = 30) // leasing contract name
    private VarcharTypeDescriptor lcnum;
    @Column(length = 45) // customer number for future use
    private  VarcharTypeDescriptor custname;

    public LeasingContract() {
    }

    public LeasingContract(long id,
                           VarcharTypeDescriptor lcnum,
                           VarcharTypeDescriptor custname) {
        this.id = id;
        this.lcnum = lcnum;
        this.custname = custname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public VarcharTypeDescriptor getLcnum() {
        return lcnum;
    }

    public void setLcnum(VarcharTypeDescriptor lcnum) {
        this.lcnum = lcnum;
    }

    public VarcharTypeDescriptor getCustname() {
        return custname;
    }

    public void setCustname(VarcharTypeDescriptor custname) {
        this.custname = custname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeasingContract that = (LeasingContract) o;

        if (id != that.id) return false;
        if (!lcnum.equals(that.lcnum)) return false;
        return custname.equals(that.custname);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + lcnum.hashCode();
        result = 31 * result + custname.hashCode();
        return result;
    }

}

