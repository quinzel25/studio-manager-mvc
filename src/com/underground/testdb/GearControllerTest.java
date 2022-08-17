package com.underground.testdb;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.underground.spring.controller.GearController;
import com.underground.spring.entity.Gear;
import com.underground.spring.service.GearService;

public class GearControllerTest {

	@Mock
	private GearService gearService;
	
	
	@InjectMocks
	private GearController gearController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
		mockMvc = MockMvcBuilders.standaloneSetup(gearController).build();	
	}
	
//	@Test
//	public void testList() throws Exception {
//		List<Gear> gears = new ArrayList<>();
//		
//		gears.add(new Gear());
//		gears.add(new Gear());
//		
//		when(gearService.getGears()).thenReturn((List) gears);
//		
//		mockMvc.perform(get("gear/list"))
//				.andExpect(status().isOk())
//				.andExpect(view().name("gear/list"))
//				.andExpect(model().attribute("gears", hasSize(2)));
//		
//	}

//	@Test
//	public void testNewGear() throws Exception {
//		
//		verifyZeroInteractions(gearService);
//		
//		when(gearService.getGear(id)).thenReturn(new Gear());
//		
//		mockMvc.perform(get("/gear/1"))
//		
//	}
//	
}
