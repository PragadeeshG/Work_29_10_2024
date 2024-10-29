create table if not exists neptune_graph_systems(
data_neptune_id bigint not null,
rdf_graphs bigint null,
network_isolation varchar(255) null,
standard_resource_description varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint neptune_graph_systems_pk primary key(data_neptune_id));