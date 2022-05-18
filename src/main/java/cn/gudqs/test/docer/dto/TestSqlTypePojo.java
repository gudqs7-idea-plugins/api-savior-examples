package cn.gudqs.test.docer.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.sql.*;

@Data
public class TestSqlTypePojo {

    private Time testTime;

    private Timestamp testTimestamp;

    private java.sql.Date testSqlDate;

    private Blob blob;

    private Clob clob;

    private NClob nClob;

    private MultipartFile file = null;

}
