package com._520it.shopping.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com._520it.shopping.dao.IProductDAO;
import com._520it.shopping.domain.Product;

//贾琏欲执事
public class ProductDAOImpl implements IProductDAO{

	public void save(Product obj) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(conn!=null) {
							conn.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}	
		}
	}

	public void update(Product obj) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(conn!=null) {
							conn.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}	
		}
	}

	public void delete(Long id) {
		
	}

	public Product get(Long id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(conn!=null) {
							conn.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}	
		}
		return null;
	}

	public List<Product> list() {
		String sql="select * FROM product";
		List<Product> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://120.27.241.75:3306/jdbcdemo?useUnicode=true&characterEncoding=UTF8","root","root");
			ps  = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product p  = new  Product();
				p.setBrand(rs.getString("brand"));
				p.setCostPrice(rs.getBigDecimal("costPrice"));
				p.setDir_id(rs.getLong("dir_id"));
				p.setId(rs.getLong("id"));
				p.setProductName(rs.getString("productName"));
				p.setSalePrice(rs.getBigDecimal("saleprice"));
				p.setSupplier(rs.getString("supplier"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(ps!=null) {
						ps.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(conn!=null) {
							conn.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}	
		}
		return list;
	}

}
