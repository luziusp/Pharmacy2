module pharmacy {
    /* @managed */ requires java.xml;
    /* @managed */ requires transitive javax.json.api;
    /* @managed */ requires transitive rocketdb.api;
    /* @managed */ exports pharmacy.module;
    /* @managed */ exports pharmacy.repositories;
    /* @managed */ exports pharmacy.tests;
    /* @managed */ exports pharmacy.types;
    /* @managed */ exports pharmacy.types.module;
}
