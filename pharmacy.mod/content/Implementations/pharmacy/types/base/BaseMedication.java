package pharmacy.types.base;

import com.helmedica.administration.user.types.User;
import com.helmedica.administration.user.types.UserId;
import com.helmedica.common.annotations.Generated;
import com.helmedica.common.json.JsonSerializerBehavior;
import com.helmedica.common.types.Data;
import com.helmedica.common.types.Uuid;
import com.helmedica.database.data.types.Operation;
import com.helmedica.database.data.types.State;
import com.helmedica.database.events.DeleteEvent;
import com.helmedica.database.events.StoreEvent;
import com.helmedica.database.interfaces.RepositoryObject;
import com.helmedica.domain.types.Domain;
import com.helmedica.domain.types.DomainId;
import com.helmedica.meta.exceptions.ValidationException;
import com.helmedica.meta.factories.ObjectFactory;
import com.helmedica.meta.interfaces.Id;
import com.helmedica.meta.types.Class;
import com.helmedica.meta.types.ClassId;
import java.util.List;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import pharmacy.repositories.BaseMedicationRepository;
import pharmacy.types.PatientId;
import pharmacy.types.PatientMedication;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class BaseMedication implements RepositoryObject {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.BaseMedication> factory = null;
    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-9793b078-acae-11e9-85a0-39552ea1958a");
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

    public boolean is__mutable() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    public PatientId getId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean has__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    protected void setId(PatientId id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setId(Uuid id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Domain get__domain() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public DomainId get__domainId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public User get__owner() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public UserId get__ownerId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public User get__creator() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public UserId get__creatorId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public State get__state() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Operation get__operation() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public long get__tts() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public int get__sequence() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public long get__ttsTo() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPharmacode() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPharmacode(String pharmacode) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrice(double price) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getEan() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setEan(String ean) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Data getLastUpdate() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setLastUpdate(Data lastUpdate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean isActive() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsActive(boolean isActive) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<? extends PatientMedication> getBasedOn() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setBasedOn(List<? extends PatientMedication> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToBasedOn(PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToBasedOn(int index, PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromBasedOn(PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<PatientId> getBasedOnIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setBasedOnIds(List<? extends PatientId> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToBasedOnIds(PatientId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToBasedOnIds(int index, PatientId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromBasedOnIds(PatientId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void clearBasedOnIds() {
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

    public pharmacy.types.BaseMedication clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.BaseMedication clone(boolean asDuplicate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Validate
    // ===========================================================================================

    public final void validate() throws ValidationException {
    }

    public void customValidation() throws ValidationException {
    }

    // ===========================================================================================
    // ==== Equals
    // ===========================================================================================

    @Override
    public int hashCode() {
        return get__id().hashCode();
    }

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

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public String toShortDescription() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== RepositoryObject
    // ===========================================================================================

    public static final BaseMedicationRepository<PatientId, pharmacy.types.BaseMedication> repository;
    static {
        repository = null;
    }

    @Override
    public BaseMedicationRepository<? extends PatientId, ? extends pharmacy.types.BaseMedication> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public BaseMedicationRepository<? extends PatientId, ? extends pharmacy.types.BaseMedication> get__objectRepository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public PatientId get__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public void set__id(String id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public final boolean is__head(long tts) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public final boolean is__head() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Triggers
    // ===========================================================================================

    protected void afterRead() throws Exception {
    }

    protected void beforeStore(StoreEvent<? extends Id, ? extends RepositoryObject> event) throws Exception {
    }

    protected void beforeDelete(DeleteEvent<? extends Id, ? extends RepositoryObject> event) throws Exception {
    }

    // ===========================================================================================
    // ==== Clear
    // ===========================================================================================

}
