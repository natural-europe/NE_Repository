/**
 * 
 */
package org.ariadne_eu.utils.lucene.document.ne;

/**
 * @author vogias
 * 
 */
public class headerType {

	boolean id, collectionId, createdBy, createdOn, lastModifiedBy,
			lastModifiedOn, deletedBy, deletedOn, version, status, access,
			validated, presentedToII, disseminatedToBiocase, metadataLangs,
			metadataLang = false;

	/**
	 * @return the presentedToII
	 */
	public boolean isPresentedToII() {
		return presentedToII;
	}

	/**
	 * @param presentedToII
	 *            the presentedToII to set
	 */
	public void setPresentedToII(boolean presentedToII) {
		this.presentedToII = presentedToII;
	}

	/**
	 * @return the disseminatedToBiocase
	 */
	public boolean isDisseminatedToBiocase() {
		return disseminatedToBiocase;
	}

	/**
	 * @param disseminatedToBiocase
	 *            the disseminatedToBiocase to set
	 */
	public void setDisseminatedToBiocase(boolean disseminatedToBiocase) {
		this.disseminatedToBiocase = disseminatedToBiocase;
	}

	/**
	 * @return the metadataLang
	 */
	public boolean isMetadataLang() {
		return metadataLang;
	}

	/**
	 * @param metadataLang
	 *            the metadataLang to set
	 */
	public void setMetadataLang(boolean metadataLang) {
		this.metadataLang = metadataLang;
	}

	/**
	 * @return the metadataLang
	 */
	public boolean isMetadataLangs() {
		return metadataLangs;
	}

	/**
	 * @param metadataLang
	 *            the metadataLang to set
	 */
	public void setMetadataLangs(boolean metadataLang) {
		this.metadataLangs = metadataLang;
	}

	/**
	 * @return the deletedOn
	 */
	public boolean isDeletedOn() {
		return deletedOn;
	}

	/**
	 * @param deletedOn
	 *            the deletedOn to set
	 */
	public void setDeletedOn(boolean deletedOn) {
		this.deletedOn = deletedOn;
	}

	/**
	 * @return the lastModifiedOn
	 */
	public boolean isLastModifiedOn() {
		return lastModifiedOn;
	}

	/**
	 * @param lastModifiedOn
	 *            the lastModifiedOn to set
	 */
	public void setLastModifiedOn(boolean lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	/**
	 * @return the createdOn
	 */
	public boolean isCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(boolean createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the id
	 */
	public boolean isId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(boolean id) {
		this.id = id;
	}

	/**
	 * @return the collectionId
	 */
	public boolean isCollectionId() {
		return collectionId;
	}

	/**
	 * @param collectionId
	 *            the collectionId to set
	 */
	public void setCollectionId(boolean collectionId) {
		this.collectionId = collectionId;
	}

	/**
	 * @return the createdBy
	 */
	public boolean isCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(boolean createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the lastModifiedBy
	 */
	public boolean isLastModifiedBy() {
		return lastModifiedBy;
	}

	/**
	 * @param lastModifiedBy
	 *            the lastModifiedBy to set
	 */
	public void setLastModifiedBy(boolean lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	/**
	 * @return the deletedBy
	 */
	public boolean isDeletedBy() {
		return deletedBy;
	}

	/**
	 * @param deletedBy
	 *            the deletedBy to set
	 */
	public void setDeletedBy(boolean deletedBy) {
		this.deletedBy = deletedBy;
	}

	/**
	 * @return the version
	 */
	public boolean isVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(boolean version) {
		this.version = version;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the access
	 */
	public boolean isAccess() {
		return access;
	}

	/**
	 * @param access
	 *            the access to set
	 */
	public void setAccess(boolean access) {
		this.access = access;
	}

	/**
	 * @return the validated
	 */
	public boolean isValidated() {
		return validated;
	}

	/**
	 * @param validated
	 *            the validated to set
	 */
	public void setValidated(boolean validated) {
		this.validated = validated;
	}

}
