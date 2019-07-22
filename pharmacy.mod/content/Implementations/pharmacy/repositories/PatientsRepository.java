package pharmacy.repositories;

import pharmacy.types.PatientId;

public class PatientsRepository<ID extends PatientId, T extends pharmacy.types.Patients> extends pharmacy.repositories.base.PatientsRepository<ID, T> {
}
