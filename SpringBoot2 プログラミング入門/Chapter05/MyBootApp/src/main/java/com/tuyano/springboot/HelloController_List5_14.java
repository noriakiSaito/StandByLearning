package com.tuyano.springboot;

/**
 * リスト5-14
 */
//@Controller
public class HelloController_List5_14 {

//	@Autowired
//	MyDataRepository repository;
//
//	@PostConstruct
//	public void init(){
//		MyData d1 = new MyData();
//		d1.setName("tuyano");
//		d1.setAge(123);
//		d1.setMail("syoda@tuyano.com");
//		d1.setMemo("this is my data!");
//
//		repository.saveAndFlush(d1);
//
//		MyData d2 = new MyData();
//		d2.setName("hanako");
//		d2.setAge(15);
//		d2.setMail("hanako@flower");
//		d2.setMemo("my girl friend.");
//
//		repository.saveAndFlush(d2);
//
//		MyData d3 = new MyData();
//		d3.setName("sachiko");
//		d3.setAge(37);
//		d3.setMail("sachico@happy");
//		d3.setMemo("my work friend...");
//
//		repository.saveAndFlush(d3);
//	}
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView index(@ModelAttribute("formModel") MyData mydata, ModelAndView mav) {
//		mav.setViewName("index");
//		mav.addObject("msg", "this is sample content.");
//		Iterable<MyData> list = repository.findAll();
//		mav.addObject("datalist", list);
//		return mav;
//	}
//
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	@Transactional(readOnly = false)
//	public ModelAndView form(@ModelAttribute("formModel") MyData mydata, ModelAndView mav) {
//		repository.saveAndFlush(mydata);
//		return new ModelAndView("redirect:/");
//	}

}
