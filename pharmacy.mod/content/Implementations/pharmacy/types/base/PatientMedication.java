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
import java.math.BigInteger;
import java.time.LocalDate;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import pharmacy.repositories.PatientMedicationRepository;
import pharmacy.types.BaseMedication;
import pharmacy.types.Doctor;
import pharmacy.types.Patient;
import pharmacy.types.PatientId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class PatientMedication implements RepositoryObject {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.PatientMedication> factory = null;
    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-9793afdb-acae-11e9-a183-cfa452e7415c");
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

    public LocalDate getPrescriptionDate() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriptionDate(LocalDate prescriptionDate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public LocalDate getPrescriptionEnd() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriptionEnd(LocalDate prescriptionEnd) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyMorning() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyMorning(BigInteger posologyMorning) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyMidday() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyMidday(BigInteger posologyMidday) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyEvening() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyEvening(BigInteger posologyEvening) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyNight() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyNight(BigInteger posologyNight) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Doctor getPrescriber() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriber(Doctor prescriber) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public PatientId getPrescriberId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriberId(PatientId prescriberId) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Patient getPrescribedTo() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescribedTo(Patient prescribedTo) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public PatientId getPrescribedToId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescribedToId(PatientId prescribedToId) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BaseMedication getBasedFor() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setBasedFor(BaseMedication basedFor) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public PatientId getBasedForId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setBasedForId(PatientId basedForId) {
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

    public pharmacy.types.PatientMedication clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.PatientMedication clone(boolean asDuplicate) {
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

    public static final PatientMedicationRepository<PatientId, pharmacy.types.PatientMedication> repository;
    static {
        repository = null;
    }

    @Override
    public PatientMedicationRepository<? extends PatientId, ? extends pharmacy.types.PatientMedication> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public PatientMedicationRepository<? extends PatientId, ? extends pharmacy.types.PatientMedication> get__objectRepository() {
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
