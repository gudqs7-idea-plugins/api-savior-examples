package cn.gudqs.test.docer.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Time;
import java.sql.Timestamp;

@Data
public class TestSqlTypePojo {

    private Time testTime;

    private Timestamp testTimestamp;

    private java.sql.Date testSqlDate;

    private Blob blob;

    private Clob clob;

    private MultipartFile file = null;

}
