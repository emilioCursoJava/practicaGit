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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Tarea}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tarea
 * @generated
 */
@ProviderType
public class TareaWrapper implements Tarea, ModelWrapper<Tarea> {
	public TareaWrapper(Tarea tarea) {
		_tarea = tarea;
	}

	@Override
	public Class<?> getModelClass() {
		return Tarea.class;
	}

	@Override
	public String getModelClassName() {
		return Tarea.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("tareaId", getTareaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("nombreTarea", getNombreTarea());
		attributes.put("descripcionTarea", getDescripcionTarea());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long tareaId = (Long)attributes.get("tareaId");

		if (tareaId != null) {
			setTareaId(tareaId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String nombreTarea = (String)attributes.get("nombreTarea");

		if (nombreTarea != null) {
			setNombreTarea(nombreTarea);
		}

		String descripcionTarea = (String)attributes.get("descripcionTarea");

		if (descripcionTarea != null) {
			setDescripcionTarea(descripcionTarea);
		}
	}

	@Override
	public Object clone() {
		return new TareaWrapper((Tarea)_tarea.clone());
	}

	@Override
	public int compareTo(Tarea tarea) {
		return _tarea.compareTo(tarea);
	}

	/**
	* Returns the company ID of this tarea.
	*
	* @return the company ID of this tarea
	*/
	@Override
	public long getCompanyId() {
		return _tarea.getCompanyId();
	}

	/**
	* Returns the descripcion tarea of this tarea.
	*
	* @return the descripcion tarea of this tarea
	*/
	@Override
	public String getDescripcionTarea() {
		return _tarea.getDescripcionTarea();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tarea.getExpandoBridge();
	}

	/**
	* Returns the group ID of this tarea.
	*
	* @return the group ID of this tarea
	*/
	@Override
	public long getGroupId() {
		return _tarea.getGroupId();
	}

	/**
	* Returns the nombre tarea of this tarea.
	*
	* @return the nombre tarea of this tarea
	*/
	@Override
	public String getNombreTarea() {
		return _tarea.getNombreTarea();
	}

	/**
	* Returns the primary key of this tarea.
	*
	* @return the primary key of this tarea
	*/
	@Override
	public long getPrimaryKey() {
		return _tarea.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tarea.getPrimaryKeyObj();
	}

	/**
	* Returns the tarea ID of this tarea.
	*
	* @return the tarea ID of this tarea
	*/
	@Override
	public long getTareaId() {
		return _tarea.getTareaId();
	}

	/**
	* Returns the user ID of this tarea.
	*
	* @return the user ID of this tarea
	*/
	@Override
	public long getUserId() {
		return _tarea.getUserId();
	}

	/**
	* Returns the user uuid of this tarea.
	*
	* @return the user uuid of this tarea
	*/
	@Override
	public String getUserUuid() {
		return _tarea.getUserUuid();
	}

	/**
	* Returns the uuid of this tarea.
	*
	* @return the uuid of this tarea
	*/
	@Override
	public String getUuid() {
		return _tarea.getUuid();
	}

	@Override
	public int hashCode() {
		return _tarea.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _tarea.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tarea.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tarea.isNew();
	}

	@Override
	public void persist() {
		_tarea.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tarea.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this tarea.
	*
	* @param companyId the company ID of this tarea
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tarea.setCompanyId(companyId);
	}

	/**
	* Sets the descripcion tarea of this tarea.
	*
	* @param descripcionTarea the descripcion tarea of this tarea
	*/
	@Override
	public void setDescripcionTarea(String descripcionTarea) {
		_tarea.setDescripcionTarea(descripcionTarea);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tarea.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tarea.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tarea.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this tarea.
	*
	* @param groupId the group ID of this tarea
	*/
	@Override
	public void setGroupId(long groupId) {
		_tarea.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_tarea.setNew(n);
	}

	/**
	* Sets the nombre tarea of this tarea.
	*
	* @param nombreTarea the nombre tarea of this tarea
	*/
	@Override
	public void setNombreTarea(String nombreTarea) {
		_tarea.setNombreTarea(nombreTarea);
	}

	/**
	* Sets the primary key of this tarea.
	*
	* @param primaryKey the primary key of this tarea
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tarea.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tarea.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tarea ID of this tarea.
	*
	* @param tareaId the tarea ID of this tarea
	*/
	@Override
	public void setTareaId(long tareaId) {
		_tarea.setTareaId(tareaId);
	}

	/**
	* Sets the user ID of this tarea.
	*
	* @param userId the user ID of this tarea
	*/
	@Override
	public void setUserId(long userId) {
		_tarea.setUserId(userId);
	}

	/**
	* Sets the user uuid of this tarea.
	*
	* @param userUuid the user uuid of this tarea
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_tarea.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this tarea.
	*
	* @param uuid the uuid of this tarea
	*/
	@Override
	public void setUuid(String uuid) {
		_tarea.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Tarea> toCacheModel() {
		return _tarea.toCacheModel();
	}

	@Override
	public Tarea toEscapedModel() {
		return new TareaWrapper(_tarea.toEscapedModel());
	}

	@Override
	public String toString() {
		return _tarea.toString();
	}

	@Override
	public Tarea toUnescapedModel() {
		return new TareaWrapper(_tarea.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _tarea.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TareaWrapper)) {
			return false;
		}

		TareaWrapper tareaWrapper = (TareaWrapper)obj;

		if (Objects.equals(_tarea, tareaWrapper._tarea)) {
			return true;
		}

		return false;
	}

	@Override
	public Tarea getWrappedModel() {
		return _tarea;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tarea.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tarea.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tarea.resetOriginalValues();
	}

	private final Tarea _tarea;
}