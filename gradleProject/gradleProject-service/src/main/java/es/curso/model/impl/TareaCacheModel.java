/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.curso.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import es.curso.model.Tarea;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Tarea in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Tarea
 * @generated
 */
@ProviderType
public class TareaCacheModel implements CacheModel<Tarea>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TareaCacheModel)) {
			return false;
		}

		TareaCacheModel tareaCacheModel = (TareaCacheModel)obj;

		if (tareaId == tareaCacheModel.tareaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tareaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", tareaId=");
		sb.append(tareaId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", nombreTarea=");
		sb.append(nombreTarea);
		sb.append(", descripcionTarea=");
		sb.append(descripcionTarea);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tarea toEntityModel() {
		TareaImpl tareaImpl = new TareaImpl();

		if (uuid == null) {
			tareaImpl.setUuid("");
		}
		else {
			tareaImpl.setUuid(uuid);
		}

		tareaImpl.setTareaId(tareaId);
		tareaImpl.setGroupId(groupId);
		tareaImpl.setCompanyId(companyId);
		tareaImpl.setUserId(userId);

		if (nombreTarea == null) {
			tareaImpl.setNombreTarea("");
		}
		else {
			tareaImpl.setNombreTarea(nombreTarea);
		}

		if (descripcionTarea == null) {
			tareaImpl.setDescripcionTarea("");
		}
		else {
			tareaImpl.setDescripcionTarea(descripcionTarea);
		}

		tareaImpl.resetOriginalValues();

		return tareaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		tareaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		nombreTarea = objectInput.readUTF();
		descripcionTarea = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(tareaId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (nombreTarea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreTarea);
		}

		if (descripcionTarea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcionTarea);
		}
	}

	public String uuid;
	public long tareaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String nombreTarea;
	public String descripcionTarea;
}