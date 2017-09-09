package com.opensource.techblog.sampleservice.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.opensource.techblog.sampleservice.model.Student;
import com.opensource.techblog.sampleservice.model.StudentModel;
import com.opensource.techblog.sampleservice.model.StudentSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Student service. Represents a row in the &quot;sample_sb_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.opensource.techblog.sampleservice.model.StudentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StudentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentImpl
 * @see com.opensource.techblog.sampleservice.model.Student
 * @see com.opensource.techblog.sampleservice.model.StudentModel
 * @generated
 */
@JSON(strict = true)
public class StudentModelImpl extends BaseModelImpl<Student>
    implements StudentModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a student model instance should use the {@link com.opensource.techblog.sampleservice.model.Student} interface instead.
     */
    public static final String TABLE_NAME = "sample_sb_Student";
    public static final Object[][] TABLE_COLUMNS = {
            { "studentId", Types.BIGINT },
            { "studentName", Types.BIGINT },
            { "dob", Types.VARCHAR },
            { "standard", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table sample_sb_Student (studentId LONG not null primary key,studentName LONG,dob VARCHAR(75) null,standard DATE null)";
    public static final String TABLE_SQL_DROP = "drop table sample_sb_Student";
    public static final String ORDER_BY_JPQL = " ORDER BY student.studentId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY sample_sb_Student.studentId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.opensource.techblog.sampleservice.model.Student"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.opensource.techblog.sampleservice.model.Student"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.opensource.techblog.sampleservice.model.Student"));
    private static ClassLoader _classLoader = Student.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Student.class
        };
    private long _studentId;
    private long _studentName;
    private String _dob;
    private Date _standard;
    private Student _escapedModel;

    public StudentModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Student toModel(StudentSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Student model = new StudentImpl();

        model.setStudentId(soapModel.getStudentId());
        model.setStudentName(soapModel.getStudentName());
        model.setDob(soapModel.getDob());
        model.setStandard(soapModel.getStandard());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Student> toModels(StudentSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Student> models = new ArrayList<Student>(soapModels.length);

        for (StudentSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _studentId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStudentId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _studentId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentId", getStudentId());
        attributes.put("studentName", getStudentName());
        attributes.put("dob", getDob());
        attributes.put("standard", getStandard());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        Long studentName = (Long) attributes.get("studentName");

        if (studentName != null) {
            setStudentName(studentName);
        }

        String dob = (String) attributes.get("dob");

        if (dob != null) {
            setDob(dob);
        }

        Date standard = (Date) attributes.get("standard");

        if (standard != null) {
            setStandard(standard);
        }
    }

    @JSON
    @Override
    public long getStudentId() {
        return _studentId;
    }

    @Override
    public void setStudentId(long studentId) {
        _studentId = studentId;
    }

    @JSON
    @Override
    public long getStudentName() {
        return _studentName;
    }

    @Override
    public void setStudentName(long studentName) {
        _studentName = studentName;
    }

    @JSON
    @Override
    public String getDob() {
        if (_dob == null) {
            return StringPool.BLANK;
        } else {
            return _dob;
        }
    }

    @Override
    public void setDob(String dob) {
        _dob = dob;
    }

    @JSON
    @Override
    public Date getStandard() {
        return _standard;
    }

    @Override
    public void setStandard(Date standard) {
        _standard = standard;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Student.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Student toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Student) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setStudentId(getStudentId());
        studentImpl.setStudentName(getStudentName());
        studentImpl.setDob(getDob());
        studentImpl.setStandard(getStandard());

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public int compareTo(Student student) {
        long primaryKey = student.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student student = (Student) obj;

        long primaryKey = student.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Student> toCacheModel() {
        StudentCacheModel studentCacheModel = new StudentCacheModel();

        studentCacheModel.studentId = getStudentId();

        studentCacheModel.studentName = getStudentName();

        studentCacheModel.dob = getDob();

        String dob = studentCacheModel.dob;

        if ((dob != null) && (dob.length() == 0)) {
            studentCacheModel.dob = null;
        }

        Date standard = getStandard();

        if (standard != null) {
            studentCacheModel.standard = standard.getTime();
        } else {
            studentCacheModel.standard = Long.MIN_VALUE;
        }

        return studentCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{studentId=");
        sb.append(getStudentId());
        sb.append(", studentName=");
        sb.append(getStudentName());
        sb.append(", dob=");
        sb.append(getDob());
        sb.append(", standard=");
        sb.append(getStandard());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.opensource.techblog.sampleservice.model.Student");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>studentId</column-name><column-value><![CDATA[");
        sb.append(getStudentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentName</column-name><column-value><![CDATA[");
        sb.append(getStudentName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dob</column-name><column-value><![CDATA[");
        sb.append(getDob());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>standard</column-name><column-value><![CDATA[");
        sb.append(getStandard());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}