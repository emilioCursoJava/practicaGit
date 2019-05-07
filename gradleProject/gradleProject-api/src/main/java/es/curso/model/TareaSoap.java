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

package es.curso.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class TareaSoap implements Serializable {
	public static TareaSoap toSoapModel(Tarea model) {
		TareaSoap soapModel = new TareaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTareaId(model.getTareaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setNombreTarea(model.getNombreTarea());
		soapModel.setDescripcionTarea(model.getDescripcionTarea());

		return soapModel;
	}

	public static TareaSoap[] toSoapModels(Tarea[] models) {
		TareaSoap[] soapModels = new TareaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TareaSoap[][] toSoapModels(Tarea[][] models) {
		TareaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TareaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TareaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TareaSoap[] toSoapModels(List<Tarea> models) {
		List<TareaSoap> soapModels = new ArrayList<TareaSoap>(models.size());

		for (Tarea model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TareaSoap[soapModels.size()]);
	}

	public TareaSoap() {
	}

	public long getPrimaryKey() {
		return _tareaId;
	}

	public void setPrimaryKey(long pk) {
		setTareaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTareaId() {
		return _tareaId;
	}

	public void setTareaId(long tareaId) {
		_tareaId = tareaId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getNombreTarea() {
		return _nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		_nombreTarea = nombreTarea;
	}

	public String getDescripcionTarea() {
		return _descripcionTarea;
	}

	public void setDescripcionTarea(String descripcionTarea) {
		_descripcionTarea = descripcionTarea;
	}

	private String _uuid;
	private long _tareaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _nombreTarea;
	private String _descripcionTarea;
}