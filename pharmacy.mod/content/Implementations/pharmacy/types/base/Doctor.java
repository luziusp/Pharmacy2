package pharmacy.types.base;

import com.helmedica.administration.user.types.User;
import com.helmedica.administration.user.types.UserId;
import com.helmedica.common.annotations.Generated;
import com.helmedica.common.json.JsonSerializerBehavior;
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
import pharmacy.repositories.DoctorRepository;
import pharmacy.types.Patient;
import pharmacy.types.PatientId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class Doctor implements RepositoryObject {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.Doctor> factory = null;
    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-2aa9a930-acaa-11e9-998f-5781b13de8b2");
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

    public String getName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getFirstName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setFirstName(String firstName) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getEan() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setEan(String ean) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getLogin() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setLogin(String login) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPassword() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPassword(String password) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<? extends Patient> getPatient() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPatient(List<? extends Patient> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToPatient(Patient object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToPatient(int index, Patient object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromPatient(Patient object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<PatientId> getPatientIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPatientIds(List<? extends PatientId> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToPatientIds(PatientId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToPatientIds(int index, PatientId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromPatientIds(PatientId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void clearPatientIds() {
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

    public pharmacy.types.Doctor clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.Doctor clone(boolean asDuplicate) {
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

    public static final DoctorRepository<PatientId, pharmacy.types.Doctor> repository;
    static {
        repository = null;
    }

    @Override
    public DoctorRepository<? extends PatientId, ? extends pharmacy.types.Doctor> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public DoctorRepository<? extends PatientId, ? extends pharmacy.types.Doctor> get__objectRepository() {
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
