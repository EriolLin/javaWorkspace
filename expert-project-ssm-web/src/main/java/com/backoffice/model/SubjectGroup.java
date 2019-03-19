package com.backoffice.model;

public class SubjectGroup {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_group.id
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_group.name
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_group.sub_subject
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    private String subSubject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_group.expert_num
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    private Integer expertNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_group.remarks
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_group.id
     *
     * @return the value of subject_group.id
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_group.id
     *
     * @param id the value for subject_group.id
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_group.name
     *
     * @return the value of subject_group.name
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_group.name
     *
     * @param name the value for subject_group.name
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_group.sub_subject
     *
     * @return the value of subject_group.sub_subject
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public String getSubSubject() {
        return subSubject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_group.sub_subject
     *
     * @param subSubject the value for subject_group.sub_subject
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public void setSubSubject(String subSubject) {
        this.subSubject = subSubject == null ? null : subSubject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_group.expert_num
     *
     * @return the value of subject_group.expert_num
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public Integer getExpertNum() {
        return expertNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_group.expert_num
     *
     * @param expertNum the value for subject_group.expert_num
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public void setExpertNum(Integer expertNum) {
        this.expertNum = expertNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_group.remarks
     *
     * @return the value of subject_group.remarks
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_group.remarks
     *
     * @param remarks the value for subject_group.remarks
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	@Override
	public String toString() {
		return "SubjectGroup [id=" + id + ", name=" + name + ", subSubject=" + subSubject + ", expertNum=" + expertNum
				+ ", remarks=" + remarks + "]";
	}
    
    
}