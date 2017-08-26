package com.protobuf.dao;

import com.protobuf.generated.LibraryProtos;

public interface LibraryDao {
	LibraryProtos.Libraries findById(int id);
}
