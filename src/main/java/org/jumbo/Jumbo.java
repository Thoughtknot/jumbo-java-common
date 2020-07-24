package org.jumbo;

import java.io.IOException;
import java.util.List;

public interface Jumbo {

	public void putObject(int table, Object key, Object value) throws IOException;
	public Object getObject(int table, Object key) throws IOException;
	public List<Object> getKeysObject(int table, int limit) throws IOException;
	public void deleteObject(int table, Object key) throws IOException;
	
	public void put(int table, byte[] key, byte[] value) throws IOException;
	public byte[] get(int table, byte[] key) throws IOException;
	public void delete(int table, byte[] key) throws IOException;
	public List<byte[]> getKeys(int table, int limit) throws IOException;
	
}
