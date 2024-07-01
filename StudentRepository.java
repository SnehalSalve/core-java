package com.student.repository;

import java.io.IOException;
import java.sql.SQLException;

public interface StudentRepository {

	public void create() throws SQLException,IOException;
	public void read() throws SQLException,IOException;
	public void update() throws SQLException,IOException;
	public void delete() throws SQLException,IOException;
}
