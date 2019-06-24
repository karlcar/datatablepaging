package com.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;

class FamilyTest {

	@Test
	void test() {
		Family f = new Family();
		f.setWife(new Wife("nvgirl"));
		f.setHouseOwnerName("karl");
		List<Son> sonList = new ArrayList<>();
		sonList.add(new Son("karl1"));
		sonList.add(new Son("karl2"));
		List<Daughter> daughterList = new ArrayList<>();
		daughterList.add(new Daughter("lily1"));
		daughterList.add(new Daughter("lily2"));
		f.setSonList(sonList);
		f.setDaughterList(daughterList);
		System.out.println(JSON.toJSONString(f));
	}

}
