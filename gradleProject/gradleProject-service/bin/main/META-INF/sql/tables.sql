create table FOO_Tarea (
	uuid_ VARCHAR(75) null,
	tareaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	nombreTarea VARCHAR(75) null,
	descripcionTarea VARCHAR(75) null
);

create table Gradle_Tarea (
	uuid_ VARCHAR(75) null,
	tareaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	nombreTarea VARCHAR(75) null,
	descripcionTarea VARCHAR(75) null
);