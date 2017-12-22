package com.journal.web.designPattern.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

	private String noteName;
	private TreeNode parents;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	
	public TreeNode(String name) {
		this.noteName = name;
	}
	public String getNoteName() {
		return noteName;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public TreeNode getParents() {
		return parents;
	}
	public void setParents(TreeNode parents) {
		this.parents = parents;
	}
	//添加孩子节点  
    public void add(TreeNode node){  
        children.add(node);  
    }  
      
    //删除孩子节点  
    public void remove(TreeNode node){  
        children.remove(node);  
    }  
      
    //取得孩子节点  
    public Enumeration<TreeNode> getChildren(){  
        return children.elements();  
    }
    
	@Override
	public String toString() {
		return "TreeNode [noteName=" + noteName + ", parents=" + parents
				+ ", children=" + children + "]";
	}  
	
	
}
