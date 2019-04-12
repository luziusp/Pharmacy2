package pharmacy.types.module.base;

import com.helmedica.common.annotations.Generated;
import com.helmedica.common.json.JsonSerializerBehavior;
import com.helmedica.common.types.Uuid;
import com.helmedica.meta.exceptions.ValidationException;
import com.helmedica.meta.factories.ObjectFactory;
import com.helmedica.meta.types.Class;
import com.helmedica.meta.types.ClassId;
import com.helmedica.module.repositories.ConfigurationRepository;
import com.helmedica.module.types.ConfigurationId;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class Configuration extends com.helmedica.module.types.Configuration {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.module.Configuration> factory = null;
    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-38f9941c-5d29-11e9-91b2-4b4f2bb00878");
    public static final short __typeVersion = 1;

    // ===========================================================================================
    // ==== Members
    // ===========================================================================================

    // ===========================================================================================
    // ==== System properties
    // ===========================================================================================

    @Override
    public ClassId get__typeId() {
        return __typeId;
    }

    @Override
    public short get__typeVersion() {
        return __typeVersion;
    }

    public static Class  __type() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Class get__type() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    public ConfigurationId get__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void set__id(Uuid __id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void set__id(String __id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Set string values
    // ===========================================================================================

    public boolean setStringValue(String name, java.lang.Object value) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Set / get object value
    // ===========================================================================================

    public boolean setObjectValue(String name, java.lang.Object value) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public java.lang.Object getObjectValue(String name) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Xml serialization
    // ===========================================================================================

    public org.w3c.dom.Document toXml() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public org.w3c.dom.Element toXml(org.w3c.dom.Document document) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Json serialization
    // ===========================================================================================

    public JsonSerializerBehavior getDefaultBehavior() {
        return null;
    }

    public JsonObject toJson() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public JsonObject toJson(JsonSerializerBehavior behavior) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public JsonObjectBuilder toJsonBuilder(JsonSerializerBehavior behavior) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Binary serialization
    // ===========================================================================================

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public final pharmacy.types.module.Configuration clone() {
        return clone(false);
    }

    public pharmacy.types.module.Configuration clone(boolean asDuplicate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Validate
    // ===========================================================================================

    public void customValidation() throws ValidationException {
    }

    // ===========================================================================================
    // ==== Equals
    // ===========================================================================================

    @Override
    public boolean equals(java.lang.Object object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public boolean deepEquals(java.lang.Object object, boolean includeMeta) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Description
    // ===========================================================================================

    // ===========================================================================================
    // ==== RepositoryObject
    // ===========================================================================================

    public static final ConfigurationRepository<pharmacy.types.module.Configuration> repository;
    static {
        repository = null;
    }

    @Override
    public ConfigurationRepository<? extends pharmacy.types.module.Configuration> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public ConfigurationRepository<? extends pharmacy.types.module.Configuration> get__objectRepository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Clear
    // ===========================================================================================

}
