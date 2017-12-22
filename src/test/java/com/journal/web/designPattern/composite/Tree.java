package com.journal.web.designPattern.composite;

/**
 * 组合模式
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * @author Jianjian
 *
 */
public class Tree {
	TreeNode treeNode = null;
	public Tree(String name){
		treeNode = new TreeNode(name);
	}

	public static void main(String[] args) {
		Tree treeA = new Tree("A");
		TreeNode treeNodeB = new TreeNode("B");
		TreeNode treeNodeC = new TreeNode("C");
		
		treeNodeB.add(treeNodeC);
		treeA.treeNode.add(treeNodeB);
		
		System.out.println(treeA);
		System.out.println("build the tree finished!");
	}

	@Override
	public String toString() {
		return "Tree [treeNode=" + treeNode + "]";
	}
}
