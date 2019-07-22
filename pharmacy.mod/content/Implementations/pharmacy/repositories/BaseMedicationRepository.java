package pharmacy.repositories;

import pharmacy.types.PatientId;

public class BaseMedicationRepository<ID extends PatientId, T extends pharmacy.types.BaseMedication> extends pharmacy.repositories.base.BaseMedicationRepository<ID, T> {
}
