create table if not exists neptune_data_management(
system_code bigint not null,
replica_database varchar(255) null,
replica_schema varchar(255) null,
replica_availability varchar(255) null,
fully_managed varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint neptune_data_management_pk primary key(system_code));