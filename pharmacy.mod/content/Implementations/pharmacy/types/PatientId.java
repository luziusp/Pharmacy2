package pharmacy.types;

import com.helmedica.common.annotations.Generated;
import com.helmedica.common.types.Uuid;
import com.helmedica.meta.factories.WrappedTypeFactory;
import com.helmedica.meta.interfaces.Id;
import com.helmedica.meta.types.IdType;
import com.helmedica.meta.types.IdTypeId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public class PUserId extends Uuid implements Id {

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final IdTypeId __typeId = IdTypeId.fromString("idty-43e12db1-5d2b-11e9-a69e-43ec48eb8a02");
    public static final int __typeVersion = 1;
    public static final WrappedTypeFactory<pharmacy.types.PUserId> factory = null;

    // ===========================================================================================
    // ==== From value
    // ===========================================================================================

    public static pharmacy.types.PUserId fromUuid(Uuid value) {
        throw new UnsupportedOperationException("Static method [fromUuid()] not implemented");
    }

    public static pharmacy.types.PUserId fromString(String value) {
        throw new UnsupportedOperationException("Static method [fromString()] not implemented");
    }

    // ===========================================================================================
    // ==== Constructor
    // ===========================================================================================

    public PUserId(Uuid value) {
        super((String)null);
    }

    public PUserId(String value) {
        super((String)null);
    }

    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    @Override
    public IdTypeId get__typeId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public static IdType __type() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public IdType get__type() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public String get__code() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== To value
    // ===========================================================================================

    public Uuid toValue() {
        return this;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Method [toString()] not implemented");
    }

}
