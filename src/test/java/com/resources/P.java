package com.resources;

public class P {
//PATHs
	public static String CONFIG_FILE_PATH = System.getProperty("user.dir")+"//src//test//java//com//config//config.properties";
	public static String TEXT_PROPERTIES = System.getProperty("user.dir")+"//src//test//java//com//config//text.properties";
	public static String OR_PROPERTIES = System.getProperty("user.dir")+"//src//test//java//com//config//OR.properties";
	public static String JOB_NUMBER = System.getProperty("user.dir")+"//src//test//java//com//config//job_number.properties";
	public static String TEXT_CASE_LOCATION_PROPERTIES = System.getProperty("user.dir")+"//src//test//java//com//config//test_cases_location.properties";
	
//	public static String firefoxProfile = System.getProperty("user.home")+"//Library//Application Support//Firefox//Profiles//2kn5yskw.default"; // mac
//	public static String testCases = System.getProperty("user.dir")+"//src//com//data//Test Cases.xlsx";										 // mac
//	public static String testCases = System.getProperty("user.dir")+"//src//com//data//TestCases.xlsx"; 										 // mac
//	public static String firefoxProfile = System.getProperty("user.home")+"\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\selenium";
	public static String firefoxProfile = System.getProperty("user.home")+"\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\0nx9ckh4.default"; 

//	public static String firefoxProfile = System.getProperty("user.home")+"\\workspace\\dob\\src\\com\\data\\geckodriver.exe";

	// System.setProperty("webdriver.gecko.driver", "D:\\\\ToolsQA\\trunk\\Library\\drivers\\geckodriver.exe");
	public static String testCases = System.getProperty("user.dir")+"\\src\\test\\java\\com\\data\\Test Cases.xlsx";
	public static String testCasesEl = System.getProperty("user.dir")+"\\src\\com\\data\\el\\Test Cases.xlsx";
//	public static String chromePath = System.getProperty("user.home")+"\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe"; // windows
	public static String chromePath = System.getProperty("user.dir")+"\\tools\\chromedriver.exe"; // windows
	public static String iePath = System.getProperty("user.dir")+"\\tools\\IEDriverServer.exe";
//	public static String iePath = System.getProperty("user.home")+"\\workspace\\dob\\src\\com\\data\\IEDriverServer.exe";
	public static String uploadFolder = System.getProperty("user.dir")+"\\src\\com\\data\\";
	public static String sFilePath = System.getProperty("user.dir")+"\\src\\com\\config\\job_number.txt";
// ENVIRONMENTS
	public static final String dob_now_protocol_qa = "http://";
	public static final String dob_now_protocol_stage = "https://";
	public static final String dob_now_host = "msswvw";
	public static final String dob_now_qa = "buildings.nycnet:8085/index.html";
	public static final String dob_now_stage_443 = "msswvw-dobcrmpw.nycnet/Publish/DOBNowPortal/index.html";
	public static final String dob_now_stage_444 = "msswvw-dobcrmpw.nycnet:444/index.html";
	public static final String electrical_stage_444 = "msswvw-dobcrmpw.nycnet:444/Publish/DOBNowPortal/Build/index.html";
	public static final String crm_stage = "http://msswva-dobcrmfe.nycnet:5555/DOBCRMSTG/main.aspx";
	
	public static final String inturnurl = "";
	public static final String coreapiurl = "";
// ################################	driver.findElement("//input[@name='continue'][@type='button']")); ###############################################################################
// GEMO
	public static final String demo_email = "(//input[@class='iui-AuthContainer__field--input'])[1]";
	public static final String demo_password = "//input[@type='password']";
	public static final String demo_login_button = "//button[contains(.,'login')]";
	public static final String demo_welcome_label = "//*[@id='root']/div/main/div/div[1]/div[1]/div[1]/div/div[2]/h3/span";

//	public static final String global_save_step_button = "//button[@ng-click='SaveJobFilingAC()']";
	public static final String global_dob_logo = "//img[@ng-src='images/DOB-NOW-logo.png']";
	public static final String global_notification_message = "//p[contains(@ng-bind-html,'ngDialogData')]";
	public static final String global_save_step_button = "//span[@class='glyphicon glyphicon-floppy-disk']";
	public static final String global_notification_ok_button = "//button[contains(.,'OK')]";
	public static final String global_loading_spinner = "//div[@class='col-xs-12 col-sm-12 col-md-12 veil-portal-AN']";
	
	public static final String google_translate_xpath = "//textarea[@id='source']";
	public static final String google_translate_submit_button_xpath = "//input[@id='gt-submit']";

	public static final String global_loading_spinner_el = "//div[@class='col-xs-12 col-sm-12 col-md-12 text-center veil-portal-spinner']";
	public static final String global_loading_spinner_el_2 = "//div[@class='col-xs-12 col-sm-12 col-md-12 veil-portal-AN ng-scope";
	public static final String global_email_preview_dropdown = "//*[@id='typeahead-405-1214-option-0']/a/strong";
	public static final String job_label = "//*[@id='frmportal']/div[1]/span/b";
	public static final String inspection_label = "//h4[contains(.,'Inspection Category')]";
	public static final String upload_special_inspector_file = "//button[@title='Click Here to Upload/View Special Inspector Seal & Signature']";
	public static final String upload_progress_inspector_file = "//button[@title='Click Here to Upload/View Progress Inspector Seal & Signature']";
	public static final String tr1_upload_special_inspector_file = "//button[@title='Click Here to Upload/View Special Inspector Seal & Signature']";
	public static final String tr1_upload_progress_inspector_file = "//button[@title='Click Here to Upload/View Progress Inspector Seal & Signature']";
	public static final String progress_inspection_label = "//*[@id='specialProgressInspSection']/div[2]/div[3]/div/i";
	public static final String global_add_button = "//button[contains(.,' Add')]";
	public static final String global_cancel_button = "//button[@ng-click='cancel()']";
	public static final String link_xpath_part1 = "//a[contains(.,'";
	public static final String link_xpath_part2 = "')]";
	public static final String email_xpath_part1 = "//strong[contains(.,'";
	public static final String email_xpath_part2 = "')]";
	public static final String preview_to_file_button = "(//button[contains(.,'Preview to File')])[1]";
	public static final String resubmit_button = "(//button[contains(.,'Resubmit')])[1]";
	public static final String application_preview_label = "//h4[contains(.,'Application Preview')]";
	public static final String number_of_pages_label = "//span[@class='label pull-right portal-fonts']";
	public static final String number_of_pages = "//span[contains(.,'Page :    /')]";
	public static final String click_go_next_button = "//button[@ng-click='goNext()']";
	public static final String final_legal_contect_checkbox = "//input[@id='finalLegalContentACK']";
	public static final String file_button = "//button[@ng-click='File(frmelvPreview)']";
// DOB NOW HOMEPAGE
	public static final String sign_out_link = "//*[contains(text(),'Sign Out')]";
	public static final String search_house_number = "//input[@id='housenumber']";
	public static final String search_street_number = "//input[@id='streetnumber']";
	public static final String search_borough_list = "//select[@id='sel1']";
	public static final String search_select_borough = "//option[contains(.,'Manhattan')]"; // option value="1">Manhattan</option
	public static final String search_search_button = "()//button[contains(.,'Search')])[1]";
	public static final String welcome_email = "//input[@id='txtLoginUserName']";
	public static final String welcome_password = "//input[@id='txtLoginPassword']";
	public static final String welcome_login_button = "//button[contains(.,'Login')]";
	public static final String job_number_search = "//a[contains(.,'Job Number Search')]";
	public static final String job_search_input_box = "//input[@id='jobSearchInputBox']";
	public static final String search_button = "//button[contains(.,'Search')]";
// SELECT COMPONENT PAGE
	public static final String dob_now_build_component = "//img[@src='images/build-logo-button.png']";
	public static final String dob_now_safety_component = "//img[@src='images/safety-button-logo.png']";
// DASHBOARD 
	public static final String job_filing_button = "//button[@ng-click='NewAppOptions()']";
	public static final String job_filing_label = "//span[contains(.,'Job Filing Id')]";
	
	//input[@ng-model='AntennaFilingWorktype']
//	public static final String work_type_part1 = "//input[@ng-model='";
//	public static final String work_type_part2 = "FilingWorktype']";
	
	public static final String work_type_part1 = "(//input[@ng-model='";
	public static final String work_type_part2 = "FilingWorktype'])[1]";
	
	public static final String checkbox_antenna = "(//input[@name='rdWorktype'])[4]"; //        ng-model="AntennaFilingWorktype
	public static final String submit_work_type_button = "//button[@ng-click='next()']";
	public static final String pw1_tab = "//a[contains(.,'Plans/Work (PW1)')]";
	public static final String found_job = "//*[@id='dashboardGrid1']/div[1]/div[3]/div[2]/div/div/div/div[1]/div"; 
	//*[@id='dashboardGrid1']/div[1]/div[3]/div[2]/div/div/div/div[1]/div
	public static final String filing_action_label = "//select[@id='FilingAction']";
	public static final String found_job_part_one = "//div[@class='ui-grid-cell-contents' and contains(text(),'";
	public static final String found_job_part_two = "')]";
	
	//div[@class='ui-grid-cell-contents' and contains(text(),'Yes')]
	//a[contains(.,'Plans/Work (PW1)')]
// Plans/Work (PW1)
	//     1. Location Information
	public static final String pw1_1_house_number = "//input[@id='txtPWLocHouseNo']";
	public static final String pw1_1_street_name = "//input[@id='txtPWLocStreetName']";
	public static final String pw1_1_borough = "//select[@id='ddlPWLocBoroughNYC']";
	public static final String pw1_1_block = "//input[@id='txtPWLocBlock']";
	public static final String pw1_1_lot  = "//input[@id='txtPWLocLot']";
	public static final String pw1_1_bin = "//input[@id='txtPWLocBin']";
	public static final String pw1_1_community_board = "//input[@id='txtPWLocCBNo']";
	public static final String pw1_1_zip_code = "//input[@id='txtPWLocZip']";
	public static final String pw1_1_apt_suite_number = "//input[@id='txtPWLocAptCondoNo']";
	// Work on floors
	public static final String plumbing_work_on_floors = "//input[@id='txtPWLocWorkFloor']";
	public static final String pw1_1_add_work_floors_button = "//button[contains(.,'Add')]";
	public static final String pw1_1_work_on_floors_select_code_and_description = "//select[@id='ddlCADescWork']";
	public static final String pw1_1_work_on_floors_floor_number_from = "//input[@id='WFfloorNumberFrom']";
	public static final String pw1_1_work_on_floors_floor_number_to = "//input[@id='WFfloorNumberTo']";
	public static final String pw1_1_work_on_floors_description_of_work = "//textarea[@id='txtDOW']";
	public static final String pw1_1_work_on_floors_add_button = "//button[@ng-click='submitForm();']";
	//     2. Applicant Information
	public static final String pw1_2_email = "//input[@name='txtPWAppEmail2']";
	public static final String pw1_2_license_type = "//select[@id='txtPWAppLicType']";
	public static final String pw1_2_license_number = "//input[@id='txtPWAppLicNum']";
	public static final String pw1_2_last_name = "//input[@id='txtPWAppLastName']";
	public static final String pw1_2_first_name = "//input[@id='txtPWAppFirstName']";
	public static final String pw1_2_middle_name = "//input[@id='txtPWAppMiddleName']";
	
	public static final String pw1_2_business_lookup = "//select[@id='txtPWAppbusiness']";
	public static final String pw1_2_business_name = "//input[@id='txtPWAppBusinessName']";
	public static final String pw1_2_business_phone = "//input[@id='txtPWAppBusinessTelephone']";
	public static final String pw1_2_business_address = "//input[@id='txtPWAppBusinessAddress']";
	public static final String pw1_2_business_fax = "//input[@id='txtPWAppBusinessFax']";
	public static final String pw1_2_city = "//input[@name='txtPWAppCity']";
	public static final String pw1_2_state = "//input[@name='txtPWAppState']";
	public static final String pw1_2_zip = "//input[@name='txtPWAppZip']";
	public static final String pw1_2_mobile = "//input[@name='txtPWAppMobileTelephone']";
	//     3. Filing Representative
	public static final String pw1_3_email = "//input[@name='txtPWFRepEmail']";
	public static final String pw1_3_ = "//input[@name='txtPWFRepRegNo']";
	public static final String pw1_3_registration_number = "//input[@name='txtPWFRepRegNo']";
	public static final String pw1_3_first_name = "//input[@name='txtPWFRepFName']";
	public static final String pw1_3_middle_name = "//input[@name='txtPWFRepMName']";
	public static final String pw1_3_last_name = "//input[@name='txtPWFRepLName']";
	public static final String pw1_3_business_name = "//input[@name='txtPWFRepBusinessName']";
	public static final String pw1_3_business_phone = "//input[@name='txtPWFRepBusinessTelephone']";
	public static final String pw1_3_business_address = "//input[@name='txtPWFRepBusinessAddress']";
	public static final String pw1_3_city = "//input[@name='txtPWFRepCity']";
	public static final String pw1_3_state = "//input[@name='txtPWFRepState']";
	public static final String pw1_3_mobile = "//input[@name='txtPWFRepMobileTelephone']";
	//     4. Filing Review Type
	public static final String pw1_4_filling_review_type_list = "//select[@id='ddlPWProfCertificate']";
	public static final String pw1_4_filling_review_select_standard_plan = "//option[contains(.,'Standard Plan Examination')]";
	public static final String pw1_4_filling_review_select_professional_examination = "//option[contains(.,'Professional Certification')]";
	//     5. Job/Project Types
	public static final String pw1_5_acceptance_requested_yes = "(//input[@id='radPWDirective14Accept'])[1]"; //input[@id='radPWDirective14Accept']
	public static final String pw1_5_acceptance_requested_no = "(//input[@id='radPWDirective14Accept'])[2]";
	//     6. Work Types
	public static final String pw1_6_new_antenna = "(//input[@name='rdNewApp'])[1]"; //input[@ng-click='clearUnSelectedWorkTypeCheckBoxes()']
	public static final String pw1_6_existing_antenna = "(//input[@name='rdNewApp'])[2]";
	public static final String pw1_6_both_antennas = "(//input[@name='rdNewApp'])[3]";
	public static final String pw1_6_structural_work_included_yes = "(//input[@id='rdstructuralWorkIncluded'])[1]";
	public static final String pw1_6_structural_work_included_no = "(//input[@id='rdstructuralWorkIncluded'])[2]";
	public static final String antenna_have_no_more_than_8_square_feet_yes = "(//input[@id='rdZoningExemptionsdiameter'])[1]";
	public static final String antenna_have_no_more_than_8_square_feet_no = "(//input[@id='rdZoningExemptionsdiameter'])[2]";
	public static final String cellar_equipment_occupy_more_than_5_of_floor_yes = "(//input[@id='rdZoningExemptionsSqfeet'])[1]";
	public static final String cellar_equipment_occupy_more_than_5_of_floor_no = "(//input[@id='rdZoningExemptionsSqfeet'])[2]";
	public static final String antennas_higher_than_6_feet_of_the_roof_yes = "(//input[@id='rdZoningExemptionsBulkhead'])[1]";
	public static final String antennas_higher_than_6_feet_of_the_roof_no = "(//input[@id='rdZoningExemptionsBulkhead'])[2]";
	/*
	public static final String pw1_6_new_work _only = "//input[@class='ng-pristine ng-valid ng-valid-required ng-touched']";
	public static final String pw1_6_legalization_only = "//input[@class='ng-valid ng-valid-required ng-touched ng-dirty']";
	public static final String pw1_6_both = "//input[@class='ng-valid ng-valid-required ng-dirty ng-touched']";
	public static final String pw1_6_plumbing = "//input[@name='chkPWWrkTypeP2']";
	// chkPWWrkTypePl vs chkPWWrkTypeP2 ?
	public static final String pw1_6_plumbing = "//input[@id='chkPWWrkTypePl']";
	public static final String pw1_6_sprinkler = "//input[@id='chkPWWrkTypeSp1']";
	public static final String pw1_6_standpipe = "//input[@id='chkPWWrkTypeSd1']";
	public static final String pw1_6_sign = "//input[@id='chkPWWrkTypeAntenna']";
	*/
	//     8. Additional Information
	public static final String pw1_8_estimated_new_work_cost = "//input[@name='txtPWEstJobCost']";
	public static final String pw1_8_total_new_work_floor_area = "//input[@name='txtPWTotalConsFlrArea1']";
	public static final String pw1_8_building_type = "//select[@name='ddlPWBuildingType']";
	public static final String pw1_8_associated_no = "//input[@class='ng-pristine ng-invalid ng-invalid-required ng-touched firepath-matching-node']";
	public static final String pw1_8_associated_yes = "//input[@class='ng-pristine ng-valid ng-touched firepath-matching-node']";
	public static final String pw1_8_associated_bis_job_number = "//input[@id='txtNewBuildingJobNumber']";
	public static final String pw1_8_estimate_fee_button = "//button[@ng-click='CalculateModal()']";
	/*
	public static final String pw1_8_estimated_legalization_job_cost = "//input[@name='txtPWEstLegalizationJobCost']";
	public static final String pw1_8_total_legalization_floor_area = "//input[@name='txtPWTotalConsFlrArea2']";
	public static final String pw1_8_height= "//input[@id='txtPWHeight']
	*/
	//     9. Additional Considerations, Limitations or Restrictions

	public static final String pw1_9_review_requested_under_code = "//select[@id='ddlPWReviewReq1']";
	public static final String pw1_9_review_requested_type_select = "//option[contains(.,'XXXXXXX')]";
	public static final String pw1_9_facade_alteration_yes = "(//input[@id='rdPWFaçadeAlteration'])[1]"; //input[@id='rdPWFaÃ§adeAlteration' and contains(text(),'Yes')]   //     [position()=1]
	public static final String pw1_9_facade_alteration_no = "(//input[@id='rdPWFaçadeAlteration'])[2]"; //input[@id='rdPWFaÃ§adeAlteration' and contains(text(),'No')] //     [position()=2]
	public static final String pw1_9_adult_establishment_yes = "(//input[@name='rdPWAdultEstablishment'])[1]";
	public static final String pw1_9_adult_establishment_no = "(//input[@name='rdPWAdultEstablishment'])[2]";
	public static final String pw1_9_quality_housing_yes = "(//input[@name='rdPWQualityHousing'])[1]";
	public static final String pw1_9_quality_housing_no = "(//input[@name='rdPWQualityHousing'])[2]";
	public static final String pw1_9_little_e_or_rd_site_yes = "(//input[@name='rdPWLittleSite'])[1]";
	public static final String pw1_9_little_e_or_rd_site_no = "(//input[@name='rdPWLittleSite'])[2]";
	public static final String pw1_9_unmapped_cco_street_yes = "(//input[@name='rdPWUnmappedCCoStreet1'])[1]";
	public static final String pw1_9_unmapped_cco_street_no = "(//input[@name='rdPWUnmappedCCoStreet1'])[2]";
	public static final String pw1_9_crfn_restrictive_declaration_easement_yes = "(//input[@name='rdPWCrfnRestrictive'])[1]";
	public static final String pw1_9_crfn_restrictive_declaration_easement_no = "(//input[@name='rdPWCrfnRestrictive'])[2]";
	public static final String pw1_9_crfn_zoning_exhibit_yes = "(//input[@name='rdPWCRFNZoningExhibit'])[1]";
	public static final String pw1_9_crfn_zoning_exhibit_no = "(//input[@name='rdPWCRFNZoningExhibit'])[2]";
	public static final String pw1_9_address_violations_yes = "(//input[@name='rdPWFilingAddrVio'])[1]";
	public static final String pw1_9_address_violations_no = "(//input[@name='rdPWFilingAddrVio'])[2]";
	public static final String pw1_9_comply_with_local_laws_yes = "(xxx)[1]";
	public static final String pw1_9_comply_with_local_laws_no = "(xxx)[2]";
	public static final String pw1_9_bsa_calendar_numbers_yes = "(//input[@name='rdPWBSACalender'])[1]";
	public static final String pw1_9_provide_bsa = "//textarea[@id='txtPWProvideBSA']";
	public static final String pw1_9_bsa_calendar_numbers_no = "(//input[@name='rdPWBSACalender'])[2]";
	public static final String pw1_9_cpc_calendar_numbers_yes = "(//input[@name='rdPWCPCCalender'])[1]";
	public static final String pw1_9_last_each_law_number = "//textarea[@id='txtPWCPCCalendarNumbers']";
	public static final String pw1_9_cpc_calendar_numbers_no = "(//input[@name='rdPWCPCCalender'])[2]";
	public static final String pw1_9_high_rise_team_tracking = "//input[@id='txtPWHighRiseTeamtracking']";
	public static final String pw1_9_includes_partial_demolition_yes = "(//input[@id='rdPWWorkIncludes'])[1]";
	public static final String pw1_9_includes_partial_demolition_no = "(//input[@id='rdPWWorkIncludes'])[2]";
	public static final String pw1_9_stability_affected_by_work_yes = "(//input[@name='rdPWStructuralStab'])[1]";
	public static final String pw1_9_stability_affected_by_work_no = "(//input[@name='rdPWStructuralStab'])[2]";
	/*
	public static final String pw1_9_review_building_code_yes = "(//select[@name='ddlPWReviewReq1'])[1]";
	public static final String pw1_9_review_building_code_no = "(//select[@name='ddlPWReviewReq1'])[2]";
	public static final String pw1_9_single_room_occupancy_yes = "(xxx)[1]";
	public static final String pw1_9_single_room_occupancy_no = "(xxx)[2]";
	public static final String pw1_9_loft_board_yes = "(//input[@name='rdLoftBoard'])[1]";
	public static final String pw1_9_loft_board_no = "(//input[@name='rdLoftBoard'])[2]";
	public static final String pw1_9_site_safety_job_yes = "(//input[@name='rdPWSiteSafety'])[1]";
	public static final String pw1_9_site_safety_job_no = "(//input[@name='rdPWSiteSafety'])[2]";
	public static final String pw1_9_included_in_lmccc_yes = "(//input[@name='rdPWLMCC'])[1]";
	public static final String pw1_9_included_in_lmccc_no = "(//input[@name='rdPWLMCC'])[2]";
	public static final String pw1_9_landmark_yes = "(//input[@name='rdPWLandmark'])[1]";
	public static final String pw1_9_landmark_no = "(//input[@name='rdPWLandmark'])[2}";
	*/
	//     10. NYCECC Compliance
	public static final String pw1_10_work_in_compliance_with_nycecc = "(//input[@id='rblPWNYCECC'])[1]";
	public static final String pw1_10_code_compliance_path = "//select[@id='ddlPWCodeCompliancePath']";
	public static final String pw1_10_energy_nalysis = "//select[@name='ddlPWEnergyAnalysis']";
	public static final String pw1_10_exempt_from_nycecc = "(//input[@name='rblPWNYCECC'])[2]";
	public static final String pw1_10_exempt_type = "//select[@name='ddlPWExemptNYCECC']";
	//     11. Job Description
	public static final String job_description_for_new_work = "//textarea[@name='txtPWJobDesc']";
	//     12. Zoning Characteristics
	public static final String pw1_12_district = "//input[@name='txtPWDistrictS']";
	public static final String pw1_12_overlay = "//input[@name='txtPWOverlay']";
	public static final String pw1_12_special_district = "//input[@name='txtPWSpecialDist']";
	public static final String pw1_12_map_number = "//input[@name='txtPWMapNumber']";
	//     13. Building Characteristics
	public static final String pw1_13_occupancy_classification = "//select[@id='ddlPWOccupancyClassification']";
	public static final String pw1_13_construction_classification = "//select[@id='ddlPWConstructionClassification']";
	public static final String pw1_13_multiple_dwelling_classification = "//select[@id='ddlPWMultipleDwelling']";
	public static final String pw1_13_mixed_use_type_yes = "(//input[@name='rblPWMixedBuildType'])[1]";
	public static final String pw1_13_mixed_use_type_no = "(//input[@name='rblPWMixedBuildType'])[2]";
	public static final String pw1_13_building_height_existing = "//input[@id='txtPWBuildingHeightExi']";
	public static final String pw1_13_building_height_proposed = "//input[@id='txtPWBuildingHeightPro']";
	public static final String pw1_13_building_stories_existing = "//input[@id='txtPWBuildingStoriesExi']";
	public static final String pw1_13_building_stories_proposed = "//input[@id='txtPWBuildingStoriesPro']";
	public static final String pw1_13_building_dwelling_units_existing = "//input[@id='txtPWBuildingDwellingUnitsExi']";
	public static final String pw1_13_building_dwelling_units_proposed = "//input[@id='txtPWBuildingDwellingUnitsPro']";
// 16. Curb Cut Description
	public static final String pw1_16_size_of_cutout = "//input[@id='txtPWSizeofcut']";
	public static final String pw1_16_distance_to_nearest_corner = "//input[@id='txtPWDistanceToNearestCorner']";
	public static final String pw1_16_distance_from_nearest_property = "//input[@id='txtPWDistancefromNearestProperty']";
	public static final String pw1_16_which_side_nearest_to_property = "//select[@id='ddlSideCCProperty']";
	public static final String pw1_16_to_streat = "//input[@id='txtPWTostreet']";
	public static final String pw1_16_this_curb_will_provide_access_to = "//button[@ng-click='toggleDropdown()']";
	public static final String pw1_16_which_side_of_street_curb_on = "//select[@id='ddlPWSideCCStreet']";
	public static final String pw1_16_on_grade_yes = "(//input[@id='rdPWOnGrade'])[1]";
	public static final String pw1_16_on_grade_no = "(//input[@id='rdPWOnGrade'])[2]";
	public static final String pw1_16_over_vault_yes = "(//input[@id='rdPWOverVault'])[1]";
	public static final String pw1_16_over_vault_no = "(//input[@id='rdPWOverVault'])[2]";
	public static final String pw1_16_other_structure_yes = "(//input[@id='rdPWOtherStructure'])[1]";
	public static final String pw1_16_other_structure_no = "(//input[@id='rdPWOtherStructure'])[1]";
	public static final String pw1_16_sidewalk_within_8ft_yes = "(//input[@id='rdPWSideWalkObstruction'])[1]";
	public static final String pw1_16_sidewalk_within_8ft_no = "(//input[@id='rdPWSideWalkObstruction'])[2]";
	public static final String pw1_16_sidewalk_to_destroy_yes = "(//input[@id='rdPWSideWalkObstructionDestroyed'])[1]";
	public static final String pw1_16_sidewalk_to_destroy_no = "(//input[@id='rdPWSideWalkObstructionDestroyed'])[2]";
	public static final String pw1_16_infront_of_ajoining_yes = "(//input[@id='rdPWCurbCutAdjProperty'])[1]";
	public static final String pw1_16_infront_of_ajoining_no = "(//input[@id='rdPWCurbCutAdjProperty'])[2]";
	public static final String pw1_16_agencies_required_documents = "//select[@id='agenciesAndReqdDoc']";
	//     18. Fire Protection Equipment
	public static final String pw1_18_fire_alarm_existing_yes = "(//input[@name='rblPWExistFireAlarm'])[1]";
	public static final String pw1_18_fire_alarm_existing_no = "(//input[@name='rblPWExistFireAlarm'])[2]";
	public static final String pw1_18_fire_alarm_proposed_yes = "(//input[@name='rblPWPropFireAlarm'])[1]";
	public static final String pw1_18_fire_alarm_proposed_no = "(//input[@name='rblPWPropFireAlarm'])[2]";
	public static final String pw1_18_fire_supression_existing_yes = "(//input[@name='rblPWExistFireSupression'])[1]";
	public static final String pw1_18_fire_supression_existing_no = "(//input[@name='rblPWExistFireSupression'])[2]";
	public static final String pw1_18_fire_supression_proposed_yes = "(//input[@name='rblPWPropFireSupression'])[1]";
	public static final String pw1_18_fire_supression_proposed_no = "(//input[@name='rblPWPropFireSupression'])[2]";
	/*
	public static final String pw1_18_sprinkler_existing_yes = "//input[@id='rblPWExistSprinkler1']";
	public static final String pw1_18_sprinkler_existing_no = "//input[@id='rblPWExistSprinkler2']";
	public static final String pw1_18_sprinkler_proposed_yes = "//input[@id='rblPWPropSprinkler1']";
	public static final String pw1_18_sprinkler_proposed_no = "//input[@id='rblPWPropSprinkler2']";
	public static final String pw1_18_standpipe_existing_yes = "//input[@id='rblPWExistStandpipe1']";
	public static final String pw1_18_standpipe_existing_no = "//input[@id='rblPWExistStandpipe2']";
	public static final String pw1_18_standpipe_proposed_yes = "//input[@id='rblPWPropStandpipe1']";
	public static final String pw1_18_standpipe_proposed_no = "//input[@id='rblPWPropStandpipe2']";
	*/
	//     20. Site Characteristics
	public static final String pw1_20_tidal_wetlands_yes = "(//input[@id='rdPWSiteTidal'])[1]";
	public static final String pw1_20_tidal_wetlands_no = "(//input[@id='rdPWSiteTidal'])[2]";
	public static final String pw1_20_coastal_erosion_hazard_area_yes = "(//input[@id='rdPWSiteCoastalErosion'])[1]";
	public static final String pw1_20_coastal_erosion_hazard_area_no = "(//input[@id='rdPWSiteCoastalErosion'])[2]";
	public static final String pw1_20_fire_districs_yes = "(//input[@id='rdPWSiteFireDistrict'])[1]";
	public static final String pw1_20_fire_districs_no = "(//input[@id='rdPWSiteFireDistrict'])[2]";
	public static final String pw1_20_freshwater_wetlands_yes = "(//input[@id='rdPWSiteFreshwater'])[1]";
	public static final String pw1_20_freshwater_wetlands_no = "(//input[@id='rdPWSiteFreshwater'])[2]";
	public static final String pw1_20_urban_renewal_yes = "(//input[@id='rdPWSiteUrbanRenewal'])[1]";
	public static final String pw1_20_urban_renewal_no = "(//input[@id='rdPWSiteUrbanRenewal'])[2]";
	//     20A. Flood Hazard Area Information
	public static final String pw1_20A_flood_hazard_area_yes = "(//input[@id='rdPWSiteFloodHazardArea'])[1]";
	public static final String pw1_20A_flood_hazard_area_no = "(//input[@id='rdPWSiteFloodHazardArea'])[2]";
	//     22. Asbestos Abatement Compliance
	public static final String pw1_22_requires_asbestos_abatement = "(//input[@name='rdPWAsbestosComplaince'])[1]";
	public static final String pw1_22_not_asbestos_project = "(//input[@name='rdPWAsbestosComplaince'])[2]";
	public static final String pw1_22_dep_asp_5_ontrol_o = "//input[@id='txtPWBuildingDEP']";
	public static final String pw1_22_exempt_from_asbestos = "(//input[@name='rdPWAsbestosComplaince'])[3]";         
	/*
	//     23. Sign Details
	public static final String pw1_23_add_new_sign = "//button[@class='btn btn-link pull-left']";
	public static final String pw1_23_lessee_email = "//input[@id='txtLesseeEmail']";
	public static final String pw1_23_relationship_to_Owner = "//input[@id='txtRelationshiptoOwner']";
	public static final String pw1_23_purpose_of-sign = "//select[@id='ddlPurpose']";
	public static final String pw1_23_material_of_the_sign = "//select[@id='ddlMaterialSign']";
	public static final String pw1_23_weight_of_sign = "//input[@id='txtWeight']";
	public static final String pw1_23_total_surface_area_of_this_sign = "//input[@id='txtTotalsurfacesignarea']";
	public static final String pw1_23_total_square_feet = "//input[@id='txtTotalsquarefeet']";
	public static final String pw1_23_total_zoning_lot_frontage = "//input[@id='txtTotalZoninglotfrontage']";
	public static final String pw1_23_total_surface_area_of_signs_in_zoning_lot= "//input[@id='txtZoningLot']";
	public static final String pw1_23_estimated_Job_cost = "//input[@id='txtEstimatedJobCost']";
	public static final String pw1_23_estimated_sign_fee = "//input[@id='txtEstimatedFeeJobCost']";
	public static final String pw1_23_maximum_allowable_surface_area_on_zoning_lot = "//input[@id='txtAllowableSurface']";
	public static final String pw1_23_sign_type = "//select[@id='ddlType']";
	public static final String pw1_23_sign_location = "//select[@id='ddlLocation']";
	public static final String pw1_23_sign_wording = "//textarea[@id='txtSignWordingDesc']";
	public static final String pw1_23_sign_designed_for_changeable_copy_yes = "(//input[@id='radDesignChangeble'])[1]";
	public static final String pw1_23_sign_designed_for_changeable_copy_no = "(//input[@id='radDesignChangeble'])[2]";
	public static final String pw1_23_oak_have_interest_in_sign_yes = "(//input[@id='radOacIntrest'])[1]";
	public static final String pw1_23_oak_have_interest_in_sign_no = "(//input[@id='radOacIntrest'])[2]";
	public static final String pw1_23_within_900_of_arterial_highway_yes = "(//input[@id='radArterialhighwayt'])[1]";
	public static final String pw1_23_within_900_of_arterial_highway_no = "(//input[@id='radArterialhighwayt'])[2]";
	public static final String pw1_23_within_200_of_park_yes = "(//input[@id='radParkAcre'])[1]";
	public static final String pw1_23_within_200_of_park_no = "(//input[@id='radParkAcre'])[2]";
	public static final String pw1_23_understand_and_agree = "//input[@id='chkSignCompleteStatement']";
	*/
	//     24. Comments
	public static final String pw1_24_comments = "//textarea[@id='txtPWComments']";
//	public static final String pw1_save_button = "//button[contains(.,'Save')]";
	public static final String pw1_confirm_save_button = "//button[@ng-click='addressConfirmationModalOk()']";
//	public static final String pw1_notification_ok_button = "//closeThisDialog('0')";
// WORK PERMIT (PW2)
	public static final String pw2_work_permit_step = "//a[contains(.,'Work Permit (PW2)')]";
// DEMOLITION SUBMITTAL (DS1)
	public static final String ds1_demolition_submittal_step = "//a[contains(.,'Demolition Submittal (DS1)')]";
	//     2. Applicant Information
	public static final String ds1_2_applicant_ds1same_as_ps1_yes = "//input[@id='rdPw1ApplicantYes']";
	public static final String ds1_2_applicant_ds1same_as_ps1_no = "//input[@id='rdPw1ApplicantNo']";
	//     3. Demolition Description and Certification
	public static final String ds1_3_submittal_type= "//input[@id='chkSubmittalTypeInitial']";
	public static final String ds1_3_demolition_type = "//input[@id='chkDemolitionTypePartial']";
	//     3B.Demolition work will involve , per BC3306.5(authorized preparers indicated in parenthesis)
	public static final String ds1_3B_non_mechanical_demolition_methods = "//input[@id='chkNonMechdem']";
	public static final String ds1_3B_other_than_hand_held_mechanical = "//input[@id='chkOtherHandHeldMechEqui']";
	public static final String ds1_3B_work_on_exterior_of_uilding = "//input[@id='chkWorkOnExterior']";
	public static final String ds1_3B_description = "//textarea[@id='txtextDescdemo']";
	public static final String ds1_3B_i_prepared_demolition_documents = "//input[@id='DesignApplicantStatementsMainCheckPW1']";
	public static final String ds1_3B_save = "//button[contains(.,'Save')]"; //  span class="glyphicon glyphicon-floppy-disk"></span
	public static final String ds1_save_button = "//button[contains(.,'Save')]";
	public static final String ds1_notification_ok_button = "//button[contains(.,'OK')]";
	public static final String pw1_filing_message = "//p[contains(.,'aria-describedby')]";
// ANTENNA SCOPE OF WORK
	public static final String antenna_scope_of_work_step = "//a[contains(.,'Antenna Scope of Work')]";
	// Are new Antennas, RRH and/or Arrays proposed at this location?
	public static final String asw_are_new_antenna_rrh_array_prposed_yes = "(//input[@id='rdAnyNewAntenna'])[1]";
	public static final String asw_are_new_antenna_rrh_array_prposed_no = "(//input[@id='rdAnyNewAntenna'])[2]";
	//input[@id='rdAnyNewAntenna']
	public static final String asw_there_any_existing_antennas_yes = "(//input[@id='rdAnyExistingAntenna'])[1]";
	public static final String asw_there_any_existing_antennas_no = "(//input[@id='rdAnyExistingAntenna'])[2]";
	// Are there any existing Antennas at this location? YES
	public static final String asw_number_of_existing_antennas = "//input[@id='SoWACExistingAntennaNum']";
	public static final String asw_number_of_existing_rrh = "//input[@id='SoWACExistingRRHNum']";
	public static final String asw_number_of_arays = "//input[@id='SoWACArraysNum']";
	public static final String asw_number_of_sectors = "//input[@id='SoWACSectorsNum']";
	public static final String asw_antennas_to_be_removed = "//input[@id='SoWACAntennaRemNum']";
	public static final String asw_antennas_to_be_modified_replaced = "//input[@id='SoWACAntennaModReplacedNum']";
	public static final String asw_rrh_to_be_removed = "//input[@id='SoWACRRHRemNum']";
	public static final String asw_rrh_to_be_modified_replaced = "//input[@id='SoWACRRHModReplacedNum']";
	public static final String asw_arrays_to_be_removed = "//input[@id='SoWACArraysRemNum']";
	public static final String asw_arrays_to_be_modified_replaced = "//input[@id='SoWACArraysModReplacedNum']";
	public static final String asw_sectors_to_be_removed = "//input[@id='SoWACSectorsRemNum']";
	public static final String asw_sectors_to_be_modified_replaced = "//input[@id='SoWACSectorsModReplacedNum']";
	// Are new Antennas, RRH and/or Arrays proposed at this location? YES
	public static final String asw_number_of_new_antennas_installed = "//input[@id='SoWACNewAntennaNum']";
	public static final String asw_number_of_new_rrh = "//input[@id='SoWACNewRRHNum']";
	public static final String asw_number_of_new_arrays = "//input[@id='SoWACNewArraysNum']";
	public static final String asw_number_of_new_sectors = "//input[@id='SoWACNewSectorsNum']";
	// #############
	public static final String asw_specify_supporting_structures_for_antenna_array_rrh  = "//button[@ng-click='toggleDropdown()']";  //button[contains(.,'SelectÂ ')]
	//public static final String asw_specify_supporting_structures_for_antenna_array_rrh  = "//button[@class='dropdown-toggle btn btn-default']";
	public static final String asw_supporting_structure_list_select = "//a[contains(.,'XXXXXXXXX')]"; //a[contains(.,' Parapet')];
	public static final String asw_structural_work_included = "(//input[@id='rdAnyStructuralWork'])[1]";
	public static final String asw_structural_work_seperate = "(//input[@id='rdAnyStructuralWork'])[2]";
	public static final String asw_emergency_power_system_new = "(//input[@id='rdEmergencyPowerSystem'])[1]";
	public static final String asw_emergency_power_system_existing = "(//input[@id='rdEmergencyPowerSystem'])[2]";
	public static final String asw_associated_mechanical_work_proposed_yes = "(//input[@id='rdMechWorkProposed'])[1]";
	public static final String asw_associated_mechanical_work_proposed_no = "(//input[@id='rdMechWorkProposed'])[2]";
	//public static final String asw_floor_associated_equipment_located = "//textarea[@ng-change='chkScopeOfWorkChanges()']";
	public static final String asw_what_floor_associated_equipment_located = "//textarea[@my-maxlength='500']";
	public static final String asw_save_button = "//button[contains(.,'Save')]";
	public static final String asw_notification_ok_button = "//button[contains(.,'OK')]"; 
//	public static final String asw_confirm_save_button = "//button[contains(.,'Yes')]";
	//public static final String asw_save_button = "//span[@class='glyphicon glyphicon-floppy-disk']"; //button[contains(.,'Save')]
// COST AFFIDAVIT (PW3) 
	public static final String pw3_cost_affidavit_step = "//a[contains(.,'Cost Affidavit (PW3)')]";
//         1. Reason For Filing
	public static final String pw3_initial_filing = "//input[@ng-model='jobFilingACObj.IsInitialFiling']";
//		   3. Cost Details
	public static final String pw3_category_of_work_antenna = "//input[@ng-model='jobFilingACObj.AntennaWorkType']";
	public static final String pw3cost_affidavit_step = "//a[contains(.,'Cost Affidavit (PW3)')]";
	public static final String pw3_add_initial_cost_details_button = "//button[contains(.,'Add')]";
//	public static final String pw3_add_initial_cost_details = "//button[@class='btn btn-link']";
	public static final String pw3_category_of_work = "//select[@id='ddlCAWorkType']";
	public static final String pw3_description_of_work = "//select[@id='ddlCADescWork']";
	public static final String pw3_description_of_work_list_select = "//option[@value='string:AN - New sector']";
	public static final String pw3_area_units = "//input[@id='Text1']";
	public static final String pw3_unit_cost = "//input[@id='Text2']";
	public static final String pw3_cost_details_save_button= "//button[@class='btn btn-primary btnCustom']";
//	public static final String pw3_save_button = "//span[@class='glyphicon glyphicon-floppy-disk";
	public static final String pw3_save_button = "//button[contains(.,'Save')]";
	public static final String pw3_notification_ok_button = "//button[contains(.,'OK')]";
// Technical Report (TR1)
//		   2. Applicant Information
	public static final String tr1_technical_report_step = "//a[contains(.,'Technical Report (TR1)')]";
	public static final String tr1_are_you_applicant = "//input[@id='chkTR1DesignApplicantType']";
	public static final String tr1_are_you_special_inspector = "//input[@id='chkTR1SpecialInspectionsType']";
	public static final String tr1_are_you_progress_inspector = "//input[@id='chkTR1ProgressInspectionsType']";
	public static final String tr1_edit_special_inspection_category = "//*[@id='fixedviews']/div[2]/div/div/div[11]/div/div[1]/div[2]/div[2]/div/div/div/div[9]/button";
	public static final String tr1_edit_progress_inspection_category = "//*[@id='TR1ProgressInsptGrid']/div[1]/div[2]/div[2]/div/div/div/div[8]/button";
	public static final String tr1_select_requirement_code = "//button[@class='ui-select-bootstrap']";
	public static final String tr1_select_requirement_code_field = "//input[@placeholder='Filter']";
	public static final String tr1_select_requirement_code_filter = "//a[@ng-click='select(i); focus()']";
	public static final String tr1_inspector_email = "//input[@id='txtInspecterEmail']";
	public static final String tr1_license_type = "//select[@id='txtEn2LicType']";
	
	public static final String tr1_license_number = "//input[@id='txtENAppLicNum']";
	public static final String tr1_agency_number = "//input[@id='txtAgencyNumber']";
	public static final String tr1_i_take_responcibility = "//input[@id='chkIdentResponsibility']";
	public static final String tr1_i_understand_my_failure_to_file = "//input[@id='chkTR2DesignAppProgress2']";
	public static final String tr1_i_understand_and_agree = "//input[@id='chkTR2DesignAppProgress1']";
	public static final String tr1_save_progress_inspection_button = "//button[@ng-click='save()']";
	public static final String tr1_add_special_inspections_categories = "(//button[contains(.,'Add')])[1]";
	public static final String tr1_add_requirements_list = "//button[@class='ui-select-bootstrap']"; //button[contains(.,'Select')]
	public static final String tr1_add_requirements_list_select = "//a[contains(.,' XXXXXXXXX')]";
	public static final String tr1_add_requirements_save_button = "//button[@ng-click='save()']";
	public static final String tr1_add_progress_inspection_categories = "(//button[contains(.,'Add')])[2]";
	public static final String tr1_add_save_button = "(//button[contains(.,'Save')])[2]";
//	public static final String tr1_save_button = "//button[contains(.,'Save')]";
	public static final String tr1_notification_ok_button = "//button[contains(.,'OK')]";
 //button[contains(.,'Required')]";
	public static final String tr1_confirm_upload_button = "//button[contains(.,'Upload')]";
	public static final String tr1_browse_button = "//input[@id='docUploader']";
	public static final String tr1_upload_button = "//button[@id='btnUpload']";
	public static final String tr1_please_wait_message = "//b[contains(.,'Please Wait...')]";
	public static final String tr1_upload_succesfull_message = "//label[@id='lblMessage']";
	public static final String tr1_document_uploaded_ok_button = "//button[@id='btnOKCancel']";
// Technical Report  (TR8)	
	public static final String tr8_technical_report_energy_step = "//a[contains(.,'Technical Report Energy(TR8)')]";
	public static final String tr8_technical_report_step = "//a[contains(.,'Technical Report (TR1)')]";
	public static final String tr8_are_you_applicant = "//input[@id='chkTR1DesignApplicantType']";
	public static final String tr8_are_you_special_inspector = "//input[@id='chkTR8SpecialInspectionsType']";
	public static final String tr8_are_you_progress_inspector = "//input[@id='chkTR8ProgressInspectionsType']";
	public static final String tr8_select_requirement_code = "//button[@class='ui-select-bootstrap']";
	public static final String tr8_select_requirement_code_field = "//input[@placeholder='Filter']";
	public static final String tr8_select_requirement_code_filter = "//a[@ng-click='select(i); focus()']";
	public static final String tr8_edit_progress_inspection_category = "//*[@id='fixedviews']/div[2]/div/div/div[10]/div[2]/div/div[2]/div[2]/div/div/div/div[8]/button";
	public static final String tr8_edit_special_inspection_category = "//*[@id='TR8ProgressInsptGrid']/div[1]/div[2]/div[2]/div/div/div/div[8]/button";
	


	public static final String tr8_inspector_email = "//input[@id='txtInspecterEmail']";
	public static final String tr8_license_type = "//select[@id='txtEn2LicType']";
	public static final String tr8_i_take_responcibility = "//input[@id='chkIdentResponsibility']";
	public static final String tr8_i_understand_my_failure_to_file = "//input[@id='chkTR2DesignAppProgress2']";
	public static final String tr8_i_understand_and_agree = "//input[@id='identificationofresponsibilities']";//input[@id='identificationofresponsibilities']
	public static final String tr8_save_progress_inspection_button = "//button[@ng-click='save()']";
	public static final String tr8_add_special_inspections_categories = "(//button[contains(.,'Add')])[1]";
	public static final String tr8_add_requirements_list = "//button[@class='ui-select-bootstrap']"; //button[contains(.,'Select')]
	public static final String tr8_add_requirements_list_select = "//a[contains(.,' XXXXXXXXX')]";
	public static final String tr8_add_requirements_save_button = "//button[@ng-click='save()']";
	public static final String tr8_add_progress_inspection_categories = "(//button[contains(.,'Add')])[2]";
	public static final String tr8_add_save_button = "(//button[contains(.,'Save')])[2]";
//	public static final String tr8_save_button = "//button[contains(.,'Save')]";
	public static final String tr8_notification_ok_button = "//button[contains(.,'OK')]";
//	public static final String tr8_upload_file = "//button[@title='Click Here to Upload/View Special Inspector Seal & Signature']";
	public static final String tr8_confirm_upload_button = "//button[contains(.,'Upload')]";
	public static final String tr8_browse_button = "//input[@id='docUploader']";
	public static final String tr8_upload_button = "//button[@id='btnUpload']";
	public static final String tr8_please_wait_message = "//b[contains(.,'Please Wait...')]";
	public static final String tr8_upload_succesfull_message = "//label[@id='lblMessage']";
	public static final String tr8_document_uploaded_ok_button = "//button[@id='btnOKCancel']";
	
// Statements & Signatures 
	public static final String ss_statement_signatures_step = "//a[contains(.,'Statements & Signatures')]";
	public static final String project_not_require_commissioning = "//input[@id='chkTR2DesignAppNoCommissioning']";
	public static final String ss_i_havepersonally_reviewed_all_information = "//input[@id='DesignApplicantStatementsMainCheckPW1']";
	public static final String ss_fee_exemption_reques_non_profit_yes= "//input[@id='rblPWFeeExceptReqNonPro1']";
//	public static final String ss_fee_exemption_reques_nycha_hhc_no = "//input[@id='rblPWFeeExceptReqNYCHA2']";
	public static final String ss_owners_certifications_yes = "//input[@id='rblPWOwnerCertication1']";
	public static final String ss_owners_certifications_no = "//input[@id='rblPWOwnerCertication2']";
	public static final String ss_building_to_be_altered_demolished_no = "//input[@id='rblPWBuildingAltered2']";
	public static final String ss_owner_is_not_required_to_notify_yes = "//input[@id='rblPWOwnerNotReq1']";
	public static final String ss_owner_notified_new_york = "//input[@id='rblPWOwnerNotified2']";
	public static final String ss_owner_type = "//option[@value='2']";
	public static final String ss_partner_email = "//input[@id='txtPWAppEmail1']";
	public static final String ss_i_understand_and_agrree = "//input[@id='chkPWOwnerAcknowledge']";
	public static final String ss_save_button = "//*[@id='fixedviews']/div[4]/button[1]";
// Documents 
	public static final String documents_step = "//a[contains(.,'Documents')]";
	public static final String documents_loading_spinner = "(//div[@ng-show='showLoadingDocRequiredGrid'])[2]";
	public static final String upload_document_icon = "//button[@ng-click='grid.appScope.uploadDocument(row)']";
	public static final String doc_upload_xpath_part1 = "(//button[@ng-click='grid.appScope.uploadDocument(row)'])[";
	public static final String doc_upload_xpath_part2 = "]";	
//	public static final String doc_upload_xpath_part1 = "//*[@id='fixedviews']/div[2]/div/div/uib-accordion/div/div[2]/div[2]/div/div[4]/div/div[1]/div[2]/div[2]/div/div[";
//	public static final String doc_upload_xpath_part2 = "]/div/div[5]/button";
	public static final String doc_upload_file = "(//button[@ng-click='grid.appScope.uploadDocument(row)'])[1]";
	public static final String doc_confirm_upload_button = "//button[contains(.,'Upload')]";
	public static final String doc_browse_button = "//input[@id='docUploader']";
	public static final String doc_upload_button = "//button[@id='btnUpload']";
	public static final String doc_please_wait_message = "//b[contains(.,'Please Wait...')]";
	public static final String doc_upload_succesfull_message = "//label[@id='lblMessage']";
	public static final String doc_document_uploaded_ok_button = "//button[@id='btnOKCancel']";
	public static final String doc_additional_supporting_documents = "(//span[contains(.,'Additional Supporting Documents')])[xxx]";
	public static final String doc_add_new_document = "//button[@ng-click='uploadDocument()']";
	public static final String doc_required_document_upload = "(//button[@ng-click='grid.appScope.uploadDocument(row)'])[1]";
	public static final String doc_save_button = "(//button[contains(.,'Save')])[2]";
// Work Permit (PW2) 
	public static final String pw2_ = "//button[@ng-click='AddWorkPermitModal()']";
	
	public static final String pw2_calendar_icon = "//button[contains(@ng-click,'event,0)')]";
	public static final String pw2_calendar_active_day = "//button[@class='btn btn-default btn-sm active']";
	public static final String pw2_calendar_expected_start_day = "//input[@id='ExpecStartDate']";
	public static final String pw2_email = "//input[@id='txtPWAppEmail']";
	public static final String pw2_license_type = "//select[@id='txtPWAppLicType']";
	
	public static final String pw2_registration_tracking_number = "//input[@id='txtWPProviderRegistration']";
	
	public static final String incompleted_work_permit = "//*[@id='fixedviews']/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div";
// 5. Filing Representative*
	 
	public static final String pw2_different_from_applicant_yes = "(//input[@name='ddlWPDifferentFileApp'])[1]";
	public static final String pw2_different_from_applicant_no = "(//input[@name='ddlWPDifferentFileApp'])[2]";
// 6. 
	public static final String pw2_liability = "//input[@ng-model='WorkPermitObj.LiabilityInsurance.InsuranceName']";
//	public static final String pw2_liability_expiration = "//input[@ng-model='WorkPermitObj.LiabilityInsurance.InsuranceExpiryDate']";
	public static final String pw2_liability_expiration_calendar = "//button[@ng-click='openAppCal($event,1)']";
	public static final String pw2_calendar_next_month_arrow = "//i[@class='glyphicon glyphicon-chevron-right']";
	
	public static final String pw2_workers_compensation = "//input[@ng-model='WorkPermitObj.WorkerCompensationInsurance.InsuranceName ']";
	public static final String pw2_workers_compensation_expiration_calendar = "//button[@ng-click='openAppCal($event,2)']";
	
	public static final String pw2_disability = "//input[@ng-model='WorkPermitObj.DisabilityInsurance.InsuranceName']";
	public static final String pw2_disability_expiration_calendar = "//button[@ng-click='openAppCal($event,3)']";
// 7. 
	public static final String pw2_construction_superintendent = "//input[@value='1']";
	public static final String pw2_site_safety_coordinator = "//input[@value='2']";
	public static final String pw2_site_safety_manager = "//input[@value='3']";
	
	public static final String pw2_superintendent_email = "//input[@ng-model='Sup.Email']";
	public static final String pw2_superintendent_lisence_type = "//select[@id='txtWLicType']";
	public static final String pw2_i_undersigned_will_perform_on_behalf  = "//input[@id='chkAntennaApplicantLegalStatementCheck']";
	
	public static final String pw2_work_not_require_adjacent_insurance = "//input[@id='chkWPNotRequiredInsuranceTerms1']";
	public static final String pw2_information_correct_and_complete = "//input[@id='chkPW2LegalApplicantContractorAcknowledge']";
	public static final String pw2_file_button = "//button[@ng-show='hideSubmit()']";
	public static final String pw2_save_button = "//button[@ng-click='save()']";
	public static final String pw2_cancel_button = "//button[@ng-click='cancel()']";
// 
	public static final String crm_top_nav_search_button = "//*[@id='findCriteriaImg']"; //*[@title='Start search']"; 
	public static final String crm_save_button = "//img[@alt='Save']"; //li[@title='Save (CTRL+S) Save the Form']"; 
	
	public static final String crm_completed_message = "//*[@id='footer_statecode']/div[1]/span";
	
	public static final String search_for_records_one = "(//label[starts-with(@for,'Component')])[1]";
	public static final String search_for_records_one_field = "(//input[starts-with(@hintlabelid,'Component')])[1]";
	public static final String search_for_records_one_image = "(//img[@alt='Start search'])[1]";
	
	public static final String cpe_tasks_search_job = "//*[@id='Component6372579_findHintText']";
	public static final String cpe_tasks_search_job_field = "//input[@id='Component6372579_findCriteria']";
	public static final String cpe_search_job_button = "//*[@id='Component6372579_findCriteriaImg']";
	
	public static final String cpe_job_app_complte_label = "//*[@id='dobnyc_isthejobapplicationcomplete2']/div[1]";
	public static final String cpe_job_application_complete_yes = "//*[@id='dobnyc_isthejobapplicationcomplete2_i']/option[3]";
	public static final String cpe_job_application_complete_no = "//*[@id='dobnyc_isthejobapplicationcomplete2_i']/option[2]";
	
	public static final String cpe_description_section = "//*[@id='description']/div[1]"; //*[@id='description_i']";
	public static final String cpe_description = "//textarea[@id='description_i']";
	public static final String qa_super_tasks_search_job = "//*[@id='Component8733077_findHintText']";
	public static final String qa_super_tasks_search_job_field = "//*[@id='Component8733077_findCriteria']";
	public static final String qa_super_search_job_button = "//*[@id='Component8733077_findCriteriaImg']";
	public static final String pe_tasks_search_job = "//*[@id='Component1705811_findHintText']";
	public static final String pe_tasks_search_job_field = "//*[@id='Component1705811_findCriteria']";
	public static final String pe_search_job_button = "//*[@id='Component1705811_findCriteriaImg']";
	public static final String qa_admin_tasks_search_job = "//*[@id='Component8543035_findHintText']";
	public static final String qa_admin_tasks_search_job_field = "//input[@id='Component8543035_findCriteria']";
	public static final String qa_admin_search_job_button = "//*[@id='Component8543035_findCriteriaImg']";
	
	public static final String qa_super_job_subject = "//a[contains(.,'QA Supervisor Work Permit Request Task form for Work Permit Tracking')]";
	public static final String prof_sert_qa_super_job_subject = "//a[contains(.,'Prof Cert QA Supervisor Task Form')]";
	public static final String qa_admin_job_subject = "//*[@id='gridBodyTable']/tbody/tr/td[2]/div";
	
	public static final String search_results_job_subject = "//a[contains(.,' Task ')]";
//	public static final String search_results_job_subject = "//a[contains(.,' Task  Form for')]";
//	public static final String prof_sert_qa_admin_job_subject = "//*[@id='gridBodyTable']/tbody/tr/td[2]/div";
	
	public static final String incorrect_email_and_password_message = "//p[contains(.,'Email and Password combination is incorrect')]";
//	public static final String qa_admin_job_subject = "//a[contains(.,'QA Administrator Work Permit Request')]";
//	public static final String qa_admin_job_subject = "(//a[starts-with(@id,'gridBodyTable_primaryField_')])[1]"; //*[starts-with(name(),'B')]

	
//	public static final String qa_admin_job_subject = "//a[contains(.,'QA Administrator Work Permit Request Task form for Work Permit Tracking')]";
	public static final String click_here_to_go_to_job_filing = "//*[@id='dobnyc_task_clickheretogotojobfiling']/div[1]/span[1]";
	
	public static final String qa_admin_actions_label = "//div[contains(.,'Actions')]";
	public static final String qa_admin_tr1_tab = "//span[contains(.,'Technical Report - Statement Of Responsibility')]";
	public static final String qa_admin_tr8_tab = "//span[contains(.,'Technical Report - Energy Code Progress Inspection')]";
	public static final String qa_admin_antenna_pw2_tab = "//span[contains(.,'Work Permit')]";
	public static final String qa_admin_curbcut_pw2_tab = "//*[@id='stage_21']/div[2]/div/div/div/span";
	
	
	public static final String qa_admin_application_highlights_label = "//div[contains(.,'Application Highlights')]";
	
//	public static final String qa_admin_curbcut_pw2_tab = "//div[@title='Entity: Job Filing, Stage: Work Permit";
	public static final String qa_admin_documents_tab = "//span[contains(.,'Documents')]";
//	public static final String qa_admin_curbcut_documents_tab = "//*[@id='stage_20']/div[2]/div/div/div/span";
	public static final String qa_admin_curbcut_documents_tab = "(//span[@class='stageNameContent' and contains(text(), 'Documents')])[3]";
	
	public static final String qa_admin_work_on_floors_document = "//*[@id='gridBodyTable']/tbody/tr/td[2]/nobr";
	//*[@id='gridBodyTable']/tbody/tr/td[2]/nobr
	public static final String qa_admin_fuel_oil_document = "//a[contains(.,'Fuel-Oil Storage and Fuel-Oil Piping Systems')]";
	public static final String qa_admin_electrical_energy_document = "//a[contains(.,'Electrical Energy Consumption')]";
	public static final String qa_admin_final_document = "//a[contains(.,'Final')]";
	
	public static final String qa_admin_permit_not_yet_issued = "//a[contains(.,'Permit is not yet issued')]";
	public static final String qa_admin_certificate_of_insurance_document = "//a[contains(.,'Certificate of Insurance Document')]";

//	public static final String qa_admin_document_subject = "//*[@id='gridBodyTable']/tbody/tr/td[2]/div";

	
	public static final String seal_and_signature = "//title[contains(.,'Seal & Signature')]"; //span[@title='Special Inspector Seal & Signature']";
	public static final String qa_admin_special_inspector_seal_signature = "//span[@title='Special Inspector Seal & Signature']";
	public static final String qa_admin_progress_inspector_seal_signature = "//span[@title='Progress Inspector Seal & Signature']";
	public static final String actions_dropdown = "//*[@id='dobnyc_isthejobapplicationcomplete2']/div[1]";
	public static final String appoitment_required = "//*[@id='dobnyc_task_sdpappointment']/div[1]";
	public static final String pe_action = "//*[@id='dobnyc_isjobapplicationapproved']/div[1]";
	public static final String option_yes = "//option[@title='Yes']";
	public static final String option_no = "//option[@title='No']";
	public static final String assign_to_plan_examiner = "//*[@id='new_planexaminer']/div[1]";
	public static final String pe_action_approved = "//option[@value='625470000']"; 
	public static final String pe_action_approved_no = "//option[@value='625470001']"; //*[@id='dobnyc_task_sdpappointment_i']/option[2]
	
	public static final String pe_action_objections = "//*[@id='dobnyc_isjobapplicationapproved_i']/option[3]";
	
	public static final String qa_action = "//*[@id='dobnyc_qadecision']/div[1]";
	public static final String qa_descision_dropdown = "//*[@id='dobnyc_task_qadecision6_d']";
	public static final String qa_descision_approved = "//*[@id='dobnyc_task_qadecision6_i']/option[3]"; //*[@id='gridBodyTable']/tbody/tr[3]/td[2]/div
	public static final String option_permit_issued = "(//option[@title='Permit Issued'])[3]"; //option[contains(@title,'Permit Issued')]

	public static final String approved_plan_uploaded = "//*[@id='dobnyc_approvedplansuploaded']/div[1]";
	public static final String approved_plan_uploaded_yes = "//*[@id='dobnyc_approvedplansuploaded_i']/option[2]";
	public static final String approved_plan_uploaded_no = "//*[@id='dobnyc_approvedplansuploaded_i']/option[2]";
	public static final String total_number_of_documents = "//*[@id='Documents_ItemsTotal']";
	
//	public static final String document_xpath_part1 = "(//a[starts-with(@id,'gridBodyTable_lookup_')])[";
	public static final String document_xpath_part1 = "//*[@id='gridBodyTable']/tbody/tr[";
	public static final String document_xpath_part2 = "]/td[2]/div";

	public static final String load_next_page_image = "(//*[@id='_nextPageImg'])[2]";
	public static final String view_document_button = "//*[@alt='View Document']";
	public static final String accept_document_button = "//*[@alt='Accept Document']";
	
	public static final String crm_documents_first_document_link  = "//*[@id='gridBodyTable']/tbody/tr[1]/td[2]/div";

	public static final String assign_to_qa_administrator = "//*[@id='dobnyc_assigntoqaclerk']/div[1]";
	public static final String assign_to_qa_administrator_field = "//*[@id='dobnyc_assigntoqaclerk_ledit']";
	public static final String qa_administrator_search_button = "//*[@id='dobnyc_assigntoqaclerk_i']";
	public static final String select_qa_administrator = "//*[@id='item0']/a[2]/span/nobr/span";
	//*[@id="item0"]/a[2]/span/nobr/span
	public static final String plan_examiner_text_field = "//*[@id='new_planexaminer_ledit']";
	public static final String plan_examiner_search_button = "//*[@id='new_planexaminer_i']";
	public static final String select_examiner = "//*[@id='item0']/a[2]/span/nobr/span";
	public static final String comments_textbox = "//*[@id='description;]/div[1]"; //*[@id='description_i']";
	public static final String submit_button = "//*[@alt='Mark Complete']"; //*[@id='task|NoRelationship|Form|Mscrm.Form.task.SaveAsComplete']/span/a/img";

// ELECTRICAL
// Subsequent Filing
	public static final String el_select_action = "(//select[@id='FilingAction'])[1]";
	public static final String el_select_action_subsequent_filing = "//option[@value='SubsequentFiling']";
	public static final String el_select_action_paa = "//option[@value='PAA']";
	public static final String el_confirm_yes_button = "//button[contains(.,'Yes')]";
	
	
	public static final String eljob_number_filter = "(//input[@ng-model='colFilter.term'])[1]";
	public static final String eljob_filing_number_filter = "(//input[@ng-model='colFilter.term'])[2]";
	public static final String el_subsequent_filing_work_type = "//input[@ng-model='rowData.ElectricalFilingWorktype']";
	
	public static final String el_subsequent_filing_create_button = "//button[@ng-click='Create()']";
//	public static final String el_subsequent_
	public static final String el_job_filing_includes_new_work_only = "(//input[@name='rdNewApp'])[1]";
	
	public static final String el_job_filing_includes_submit_button = "//button[@ng-click='ok()']";
	
	public static final String el_gi_house_number = "//input[@id='txtPWLocHouse']";
	public static final String el_gi_street_name = "//input[@id='txtJobLocationStreetName']";
	public static final String el_gi_borough = "//select[@id='ddlPWLocBoroughNYC']";
	public static final String el_gi_block = "//input[@id='txtPWLocBlock']";
	public static final String el_gi_lot = "//input[@id='txtPWLocLot']";
	public static final String el_ge1_job_description = "//textarea[@id='txtPWLocCBNo']";
	public static final String el_gi_job_start_date_calendar  = "//button[@id='btnStartCalender']";
	public static final String el_gi_calendar_active_day = "//button[@class='btn btn-default btn-sm active']";
	public static final String el_gi_job_completion_date_calendar = "//button[@id='btnCompletionCalender']";
	public static final String el_gi_job_completion_last_day = "(//button[@class='btn btn-default btn-sm'])[last()]";	
	public static final String el_gi_job_is_this_joint_venture_yes = "//*[@id='fixedviews']/div[2]/div[1]/div/div[17]/div/input[1]";
	public static final String el_gi_job_is_this_joint_venture_no = "//*[@id='fixedviews']/div[2]/div[1]/div/div[17]/div/input[2]";
	public static final String el_gi_building_use_type = "//select[@id='ddlBuildingUseType']";
	public static final String el_gi_applicant_email = "//input[@id='txtPWAppEmail2']";
	public static final String el_gi_applicant_license_type = "//select[@id='txtPWAppLicType']";
	public static final String el_gi_owner_email = "//input[@id='txtElvOwnerEmail']";
	public static final String el_gi_owner_type = "//select[@id='ddlOwnerType']";
	public static final String el_gi_is_this_build_back_job_no = "(//input[@ng-model='FormED16AObj.IsBuildItBack'])[2]";
	public static final String el_gi_is_this_job_certification_of_ccupancy_no = "(//input[@ng-model='FormED16AObj.AdditionalInformation.IsthisJobCofo'])[2]";
	public static final String el_gi_confirm_save_button = "//button[@ng-click='ngDialogData.SaveED16AFiling(false)']";
	public static final String el_job_label	= "//*[@id='fixedSideNav']/nav/div[2]/div/h3/span/strong";
// SCOPE OF WORK	
	public static final String el_scope_of_work_tab = "//a[contains(.,'Electrical Scope of Work')]";
	public static final String el_boiler_controls_tab= " //div[@slidediv='BoilerControls']";
	public static final String el_boiler_controls_quantity = "//input[@name='Boiler Controls-Quantity']";
	public static final String el_boiler_controls_number_size = "//input[@name='Boiler Controls-IndicateNoAndSize']";
	
	public static final String el_sow_service_work = "//input[@id='toggle-chk1']";
	public static final String el_sow_general_wiring = "//input[@id='toggle-chk2']";
	public static final String el_sow_lighting_work = "//input[@id='toggle-chk3']";
	public static final String el_calendar_next_month_arrow = "//i[@class='glyphicon glyphicon-chevron-right']";
	public static final String el_service_meter_equipment = "//div[@slidediv='ServiceMeterEquipment']";
	public static final String el_number_3_wire = "//input[@id='txtSWPWLocHouseNo']";
	public static final String el_number_4_wire = "//input[@id='txtServiceMeterEquipmentNo4Wire']";
	public static final String el_number_10_points = "//input[@id='txtServiceMeterEquipmentNo10Wire']";
	public static final String el_number_existing_meters = "//input[@id='txtPWLocHouseNo']";
	public static final String el_number_new_meters = "//input[@id='txtServiceMeterEquipmentNoNewMeters']";
	public static final String el_number_removed_meters = "//input[@id='txtServiceMeterEquipmentStreetName']";
	public static final String el_sow_lighting_work_type = "//select[@data-validationmsg='Lighting Worktype']";
	
	public static final String el_select_category_of_work = "//select[@id='selCategoryWorklist']";
	
	public static final String el_category_of_work_slider = "//div[@slidediv='categoryOfWork']";
	public static final String el_minor_work_description_slider = "//div[@slidediv='MinorWorkDescription']";
	public static final String el_add_minor_work_description_button = "//button[@ng-click='addEditMinorWorkDescription()']";
	
	public static final String el_minor_work_options = "//select[@id='txtMinorWorkType']";
	public static final String el_minor_work_location = "//select[@id='FloorSelCategoryWorklist']";
	public static final String el_minor_work_quantity = "//input[@id='txtQuantity']";
	public static final String el_minor_work_description = "//textarea[@id='txtMWDescription']";
	public static final String el_minor_work_save_button = "//button[@ng-click='ngDialogData.saveMinorWorkDescription(ngDialogData.frmMinorFloorDesc)']";
	
	public static final String el_minor_work_type = "(//input[@class='ui-grid-filter-input ng-pristine ng-untouched ng-valid'])[2]";
	public static final String el_minor_work_floor = "(//input[@class='ui-grid-filter-input ng-pristine ng-untouched ng-valid'])[2]";
	public static final String el_minor_work_device = "(//input[@class='ui-grid-filter-input ng-pristine ng-untouched ng-valid'])[3]";
//	public static final String el_minor_work_quantity = "(//input[@class='ui-grid-filter-input ng-pristine ng-untouched ng-valid'])[4]";
//	public static final String el_minor_work_description = "(//input[@class='ui-grid-filter-input ng-pristine ng-untouched ng-valid'])[5]";
	
/*	public static final String el_minor_work_type = "//input[@class='ui-grid-filter-input ng-pristine ng-valid ng-touched']";// ui-grid-filter-input ng-valid ng-touched ng-dirty ng-valid-parse
	public static final String el_minor_work_floor = "(//input[@class='ui-grid-filter-input ng-pristine ng-untouched ng-valid'])[2]";
	public static final String el_minor_work_device = "(//input[@class='ui-grid-filter-input ng-pristine ng-valid ng-touched'])[1]";
	public static final String el_minor_work_quantity = "(//input[@class='ui-grid-filter-input ng-pristine ng-valid ng-touched'])[2]";
	public static final String el_minor_work_description =  "(//input[@class='ui-grid-filter-input ng-pristine ng-untouched ng-valid'])[4]";*/
	
	 
	public static final String el_first_document = "//a[@ng-click='grid.appScope.downloadDocument(row)']";
	
	public static final String el_application_involve_new_or_amended_yes = "//input[@data-validationmsg='Owner Authorization New or Amended']";
	
	public static final String el_i_undersigned= "//input[@id='ApplicantAuthorizationCheckPW1']";
	public static final String el_this_electrical_permit_involves = "//input[@id='DesignApplicantStatementsMainCheckPW1']";
	public static final String el_this_electrical_permit_includes = "//input[@ng-change='setED16AOwnerNewAmendedStatements()']";
	public static final String pay_now_button = "//button[@ng-disabled='DisablePayNow()']";
	public static final String pay_now_confirm_button = "//button[@ng-click='paymentConfirmationModalOk()']";
	public static final String pay_agree_to_terms = "//input[@id='agree-to-terms']";
	public static final String pay_continue_button = "//button[@title='Continue']";
	public static final String pay_advanced_button = "//button[@id='advancedButton']";
	public static final String pay_add_exeption_button = "//button[@id='advancedButton']";
	public static final String pay_do_not_click_back_message = "//b[contains(.,'Please do not click Back or Forward buttons while payment is in progress!')]";
	


	
	public static final String aba_routing_number = "//input[@id='echeck_routing_number_echk_entry']";
	public static final String account_number_ = "//input[@id='echeck_account_number_echk_entry']";
	public static final String account_number_re_enter = "//input[@id='echeck_account_number_confirmation']";
	public static final String account_type = "//a[contains(.,'AccountType')]";
	public static final String checking_account = "//li[@class='active-result' and  contains(.,'Checking')]";
	public static final String pay_first_name = "//input[@id='bill_to_forename_echk_entry']";
	public static final String pay_last_name = "//input[@id='bill_to_surname_echk_entry']";
	public static final String pay_address = "//input[@id='bill_to_address_line1_echk_entry']";
	public static final String pay_city = "//input[@id='bill_to_address_city_echk_entry']";
	public static final String pay_zip = "//input[@id='bill_to_address_postal_code_echk_entry']";
	public static final String pay_phone = "//input[@id='bill_to_phone_echk_entry']";
	public static final String pay_email = "//input[@id='bill_to_email_echk_entry']";
	public static final String pay_email_confirm = "//input[@id='email-confirmation-echk']";
	public static final String pay_continue = "(//button[@id='continue_button'])[3]";
	public static final String pay_by_clicking_process_payment = "//input[@id='confirm-payment-terms-echk']";
	public static final String pay_process_payment_button = "//a[@id='process-echk-payment-bottom']";
		
	public static final String xxxxxxxxxxxx = "xxxxxxxxxxx";
	
	
	
// CORE API LOGIN PAGE
	public static final String coreapiusername = "//input[@class='iui-AuthContainer__field--input']"; //*[@id='username']";
	public static final String coreapipassword = "//input[@type='password']"; //*[@id='password']";
	public static final String coreapiloginbutton = "//button[contains(.,'login')]"; //*[@id='loginButton']";
	public static final String loginerrormessage = "//*[@id='loginForm']/div[1]/div";
	public static final String invalidcredentials = "Invalid username or password";
// HOMEPAGE
	public static final String dropdownuserarrow = "//div[@name='down-open-mini']"; //*[@name='down-open-mini']";
	public static final String inventorytab = "//*[contains(text(),'inventory')]";
	public static final String listingstab = "//*[@class='navigation-text listings']"; // navigation-text listings
	public static final String connectionstab = "//p[contains(.,'connections')]";
	public static final String connectionstabbuyer = "//*[contains(text(),'connections')]";
	public static final String companytab = "//*[contains(text(),'Company')]";
	public static final String addinventoryshortcut = "//*[@id='wrapper']/div/div/nav/ul/li[1]/a/strong"; // //*[@id='wrapper']/div/div/nav/ul/li[1]/a/span/img
	public static final String manageinventoryshortcut = "//*[@id='wrapper']/div/div/nav/ul/li[2]/a/span/img";
	public static final String findbuyersshortcut = "//*[contains(text(),'Find Buyers')]";
	public static final String manageyourteamshortcut = "//*[@id='wrapper']/div/div/nav/ul/li[5]/a/span/img";
	public static final String createlistingbutton = "//*[@id='wrapper']/div/div/section/article/div[2]/a/span";
// INVENTORY
	public static final String tabinventory = "//p[contains(.,'inventory')]";
	public static final String firstinventoryitem = "(//div[@class='iui-ProductCard--title'])[1]";  //div[@class='iui-ProductCard__data--title']";
	public static final String addupdatebutton = "//button[@title='Add & Replace']";
	public static final String uploadnewfile = "//h3[contains(.,'Upload New File Creates a new folder of inventory')]"; //div[@class='iui-Icon icon icon-upload-folder iui-ActionItem--icon']
	public static final String updateattributes = "//h3[contains(.,'Update Attributes on Existing Items ')]";
	public static final String selectfile = "//a[@title='Select a File']";
	public static final String selectreplacefolder = "//*[@id='root']/div/div/span[1]/div/div/span/div/span/div/div[2]/div[1]/div[2]/div/div/div[2]/span/div/div";
	public static final String nextbutton = "//button[contains(.,'next')]";
	public static final String importprocessingmessage = "//div[@class='iui-notification-single-instance-content__status__title']";
	public static final String updatecompletemessage = "//div[contains(.,'Update Quantities Completed 100%')]";
	public static final String uploadcompletemessage = "//div[contains(.,'Import Completed 100%')]";
	public static final String updateinventorycompletemessage = "//div[contains(.,'Update Attributes Completed 100%')]";
	public static final String replacequantitymessage = "//div[contains(.,'Replace Quantities Completed 100%')]";
	public static final String inventoryuploadspinner = "//div[@class='iui-Icon icon icon-refresh ']";
	public static final String dismiss = "//div[contains(text(),'dismiss')]"; //div[contains(.,'dismiss')]";
	public static final String expandbutton = "//div[contains(text(),'expand')]"; //div[contains(.,'expand')]";
	public static final String viewbutton = "//div[@class='iui-notification-single-instance-content__status__button']";
	public static final String importcompletedmessage = "//div[contains(.,'Import Completed')]";
	public static final String dismissbuttonfirst = "//div[contains(text(),'dismiss')]";
	public static final String dismissbuttonlast = "(//div[contains(text(),'dismiss')])[last()]";
	public static final String deletefolderbutton = "//a[@class='iui-DeleteBtn--delete']";
	public static final String confirmdeletefolderbutton = "//button[contains(.,'delete')]";
	public static final String viewinventoryaslist = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[2]";
	public static final String loadspinner = "//div[@class='iui-Icon icon icon-upload-spreadsheet ']";
	public static final String uploadinventory = "//input[@type='file']"; //   "input[id=catalog_file]"  <input type="file" data-reactid=".0.0.0.1.0.1.0.1.0.1.1:$=16.0.0.1"
	public static final String draganddrop = "//*[contains(text(),'to import inventory')]"; // to import inventory ...or select a file
	public static final String firstdonebutton = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[3]/div/div/div[3]/button[2]";
	public static final String selectfilelink = "//*[@id='root']/div/div/span/div/div[2]/div[2]/div/div/div/div/div[3]";
	public static final String importcomplete = "//*[contains(text(),'import complete')]";
	public static final String canceldeletebutton = "(//*[contains(text(),'cancel & delete')])[1]";
	public static final String viewallitemsbutton = "//*[@title='view all items']";
	public static final String foldericon = "//button[@icon='folder']";
	public static final String clickfirstinventoryitem = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div[1]/div[2]/div/div[1]";
	public static final String updateinventorybutton = "//*[@title='update inventory']";
	public static final String updateinventory = "//input[@type='file'][last()]";
	public static final String updatemodalclosebutton = "//*[@class='iui-Modal--button']"; ////*[@id='root']/div/div/span/div/div[2]/div[3]/div";
	public static final String deleteinventory = "(//*[@class='iui-Button iui-Button--info--inverted iui-Button--size--small'])[1]";
	public static final String confirmdeleteinventory = "//*[@id='root']/div/div/span/div/div[2]/div[5]/div[2]";
	public static final String syncimagesbutton = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[4]/div[1]/div[2]/button[2]";
	public static final String firstnextbutton = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[4]/div[1]/div[2]/button[1]";
	public static final String secondnextbutton = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[4]/div[1]/div[2]/button";
	public static final String selectinventory = "//*[contains(text(),'TestInventory')]";
	public static final String inventorytoreplace = "//h3[contains(.,'Replace Quantities on Existing Items Completely replaces inventory in an existing folder')]";
// PRODUCT PAGE
	public static final String filterbycasepacks = "//*[contains(text(),'view casepacks')]";
	public static final String filterbyitems = "//*[contains(text(),'view items')]";
	public static final String sortdropdown = "//*[contains(text(),'sort')]";
	public static final String searchclosebutton = "//*[@class='iui-Icon icon icon-close']";
//	public static final String searchclosebutton = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div[2]";
	public static final String actionsbutton = "//*[@icon='view-more']";
	public static final String revokeoffer = "//*[contains(text(),'revoke offer')]";
	public static final String revokeofferconfirm = "//*[@data-type='save-and-confirm']";
	public static final String replaceinventorylink = "//*[contains(text(),'replace inventory')]";
	public static final String createnewitem = "//button[contains(.,'add item')]"; //*[contains(text(),'create new item')]";
	public static final String clickfirstitem = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div[1]/div[2]/div/div[1]";
	public static final String edititembutton = "//button[@title='edit']";
	public static final String itemtitle = "//input[@id='id_item_title']"; //*[@title='edit']";
	public static final String selectfolder = "(//span[contains(@style,'position: relative; display: inline-block; margin: 0px 8px 8px 0px; padding: 8px 0px; line-height: 16px; cursor: pointer; opacity: 1; vertical-align: middle;')])[1]";
	public static final String createnewitembutton = "//div[@data-type='primary']";
	public static final String deleteitembutton = "//*[@title='delete item']";
	public static final String confirmdeleteitembutton = "//div[@data-type='save-and-confirm']";
	public static final String pencilicon = "//*[@name='pencil']";
	public static final String titletextfield = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/input";
	public static final String itemeditbutton = "//*[@id='root']/div/div/div[1]/div[2]/div/div[1]/div[2]/div/div/button";
	public static final String uploaditemimage = "//input[@type='file']";
	public static final String imagetoupload = uploadFolder + "image.jpg";
	public static final String firstcostfield = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[2]/div[1]/form/div[2]/span/input";
	public static final String firstsizepencil = "//html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div";
	public static final String addnewsizelink = "//input[@placeholder='add new size']";
	public static final String addnewsize = "//input[@placeholder='add new size']";
	public static final String sizeavailable = "//input[@class='iui-SizeInput-value-input']";
	public static final String addnewmarket = "//input[@placeholder='add new market']";
	public static final String marketwarningbubble = "//div[@name='attention-circled-line']";
	public static final String costfield ="//input[@name='cost']";
	public static final String wholesalefield ="//input[@name='wholesale']";
	public static final String retailfield ="//input[@name='retail']";
	public static final String productinfotitle = "//input[@name='title']";
	public static final String productinfosku = "//input[@name='sku_number']";
	public static final String lastdeletemarketbutton = "(//*[@class='iui-MarketsForm--marketHeader_destroy'])[1]";
	public static final String editavailable = "//*[contains(@data-reactid, '.0.0.0.1.0.1.0.0.1.2.1.0.2:$1759730.1.2')]";
// CREATE AN OFFER PAGE
	public static final String createofferbutton = "//*[@title='create offer']";
	public static final String editoffertitle = "//*[@class='iui-PageTitle__title']";
	public static final String offernamefield = "//*[@maxlength='64']";
	public static final String offerdetailsfield = "//*[@maxlength='256']";
	public static final String pickyourbuyerarrowdown = "//span[@class='Select-arrow']";
	public static final String pickyourbuyerselect = "//span[@class='Select-arrow']";
	public static final String pickyourbuyer = "//*[@id='react-select-2--value']/div[1]";
	public static final String containstextpart1 = "//*[contains(text(),'"; //
	public static final String containstextpart2 = "')]";
	public static final String buyercentury = "//img[contains(@src,'https://inturn-images-dev.imgix.net/qa//11/user/21/avatar/DmLhTYjhZT.png')]";
	public static final String buyerrentrunway = "//img[@src='https://inturn-images-dev.imgix.net/qa//16/user/26/avatar/AAWV0BxNaQ.png']";
//	public static final String buyercentury = "//*[contains(text(),'1BUYER CENTURY')]";
//	public static final String buyerrentrunway = "//*[contains(text(),'2BUYER RENTRUNWAY')]";
	public static final String purchasingrulesarrowdown = "(//*[@name='down-open'])[1]";
	public static final String entireoffer = "//*[contains(text(),'Purchase entire offer')]";
	public static final String selecteditemswithinoffer = "//*[contains(text(),'Purchase selected items within offer')]";
	public static final String quantitiesbytotal = "//*[contains(text(),'Cherry-pick by Total')]";
	public static final String quantitiesbysizes = "//*[contains(text(),'Cherry-pick by Sizes')]";
	public static final String allowcounteroffers = "//*[@class='iui-Radio__label']"; //class="iui-Radio__label
	public static final String marketselectarrowdown = "(//*[@name='down-open'])[2]";
	public static final String marketselect = "//*[contains(text(),'FR (EUR)')]"; // GB (GBP) US (USD) FR (EUR)
	public static final String allocationmarket = "//*[contains(text(),'US (USD)')]";
	public static final String selectcurrency = "//*[contains(text(),'EUR')]"; // EUR USD GBP
	public static final String addandpriceitemsbutton = "//button[contains(.,'add & price items')]";
// ADD AND PRICE ITEMS PAGE
	public static final String groupsbutton = "//*[@title='groups']";
	public static final String removegroupslink = "//*[contains(text(),'remove groups')]";
	public static final String selectgroupradiobutton = "//span[@style='position: relative; display: inline-block; margin: 8px 8px 0px; padding: 8px; line-height: 16px; cursor: pointer; opacity: 1;']";
	public static final String removegroupsbutton = "//*[@data-type='save-and-confirm']";
	public static final String allitemscount = "//span[@style='padding-left: 8px; padding-right: 16px; font-weight: 600; color: rgb(178, 178, 178);']";
	public static final String selectallititemsbutton = "(//span[@name=''])[1]";
	public static final String selectfirstitembutton = "(//span[@name=''])[2]";
	public static final String selectseconditembutton = "(//span[@name=''])[3]";
	public static final String selectthirditembutton = "(//span[@name=''])[4]";
	public static final String selectlastitembutton = "(//span[@name=''])[last()]";
	public static final String addtoofferbutton = "//button[contains(.,'add')]";
	public static final String itemsinyouroffertab = "//span[contains(text(),'items in your offer')]";
	public static final String pricebutton = "//button[contains(.,'price')]";
	public static final String unitpricefield = "//input[@placeholder='0']";
	public static final String priceitemsbutton = "//button[contains(.,'price items')]";
	public static final String readytobesentmessage = "//div[contains(.,'Offer is ready to be sent')]";
	public static final String sendofferbutton = "//button[@icon='send']";
	public static final String viewitemslink = "//*[contains(text(),'view items')]";
	public static final String viewcasepackslink = "//*[contains(text(),'view casepacks')]";
	public static final String viewitemslinkgroup = "(//*[@class='iui-Radio__label'])[1]";
	public static final String viewcasepackslinkgroup = "(//*[@class='iui-Radio__label'])[2]";
	public static final String secondinventoryitem = "(//span[@name=''])[2]";
	public static final String thirdinventoryitem = "(//span[@name=''])[3]";
	public static final String fourthinventoryitem = "(//span[@name=''])[4]";
	public static final String assignalltogroup = "//*[contains(text(),'assign all to groups')]";
	public static final String groupnamefield = "(//input[@type='select'])[1]";
	public static final String grouplabelfield = "(//input[@type='select'])[2]";
	public static final String assigntogrouplink = "//*[contains(text(),'assign to group')]";
	public static final String assigntogroupbutton = "//*[@data-type='save-and-confirm']";
	public static final String reviewandsendbutton = "//*[@title='review & send']";
// CONNECTIONS PAGE
	public static final String connectedtab = "//*[contains(text(),'connected')]";
	public static final String pendingtab = "//*[contains(text(),'pending')]";
	public static final String browsetab = "//*[contains(text(),'browse')]";
	public static final String firstconnectionname = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div[1]/a/div[2]/h3";
	public static final String firstconnectioncompany = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div[1]/a/div[3]";
	public static final String firstnamea = "//*[contains(text(),'First Name A-Z')]";
	public static final String firstnamez = "//*[contains(text(),'First Name Z-A')]";
	public static final String lastnamea = "//*[contains(text(),'Last Name A-Z')]";
	public static final String lastnamez = "//*[contains(text(),'Last Name Z-A')]";
	public static final String companynamea = "//*[contains(text(),'Company Name A-Z')]";
	public static final String companynamez = "//*[contains(text(),'Company Name Z-A')]";
// TEAM PAGE
	public static final String addteammemberbutton = "//*[@id='wrapper']/div/div/div/div[1]/div/a/span";
	public static final String memberfirstname = "//*[@id='first_name']";
	public static final String memberlastname = "//*[@id='last_name']";
	public static final String memberemail = "//*[@id='email']";
	public static final String membertitle = "//*[@id='job_title']";
	public static final String memberadminbutton = "//*[@id='user_roles']/div[1]/label/input";
	public static final String membermanagerbutton = "//*[@id='user_roles']/div[2]/label/input";
	public static final String addmemberbutton = "//*[@id='step1']/div/div/a[2]";
	public static final String newmemberusername = "//*[contains(text(),'john smith')]";  //"john smith";
	public static final String editprofilebutton = "//*[@id='wrapper']/div/div/div/div[1]/div[2]/div[2]/a[1]";
	public static final String newmembersavebitton = "//*[@id='wrapper']/div/div/div/div/a[2]";
	public static final String memberaddedmessage = "has been invited to join InTurn. We will notify you when they join";
	public static final String doneaddingmember = "//*[@id='step2']/div[1]/div/div/a[2]";
	public static final String lastteammember = "//*[@id='wrapper']/div/div/div/div[2]/div[37]/div[2]/h2/a";
	public static final String disableaccountbutton = "//*[@id='wrapper']/div/div/div/div[1]/div[2]/div[2]/a[2]";
	public static final String accountsuspendedmessage = "Account SUSPENDED";
	public static final String reinableaccountbutton = "//*[@id='wrapper']/div/div/div/div[1]/div[2]/div[2]/a[2]";
// COMPANY PAGE
	public static final String companytabseller = "//*[contains(text(),'Company')]";
	public static final String companytabbuyer = "//*[contains(text(),'Company')]";
	public static final String editcompany = "//*[@class='iui-Icon icon icon-pencil iui-ContentContainer__icon']";
	public static final String companyurl = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/input";
	public static final String companyphone = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[1]/input";
	public static final String description = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[4]/div/div[1]/textarea";
	public static final String companyaddress1 = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/input";
	public static final String companyaddress2 =  "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/input";
	public static final String companycountry = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[3]/div/div/div[1]/input";
	public static final String companystate = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[4]/div/div/div[1]/input";
	public static final String companycity = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[5]/div/div[1]/input";
	public static final String companyzip = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[6]/div/div[1]/input";
	public static final String facebookurl = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[1]/div/div/input";
	public static final String twitterurl = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div/input";
	public static final String pinterest = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[3]/div/div/input";
	public static final String instagram = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[4]/div/div/input";
	public static final String linkedin = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[5]/div/div/input";
	public static final String aboutuslabel = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/h3";
	public static final String companyinfo = "//*[@id='root']/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div[2]";
	public static final String saveandexitbutton = "//button[@title='save & exit']";
// OFFERS PAGE
	public static final String loadingbar = "//div[@class='iui-ProgressBar__progress-mode__determinate']"; //*[@class='iui-LoadingBar']";
	public static final String itemstab = "//span[contains(.,'items')]";
	public static final String offerstab = "//p[contains(.,'offers')]";
	public static final String closedoffersradiobutton = "(//*[@class='iui-Radio__label'])[2]";
	public static final String receivedfilter = "//*[contains(text(),'Received']";
	public static final String sentfilter = "//*[contains(text(),'Sent')]";
	public static final String draftfilter = "//*[contains(text(),'Draft')]";
	public static final String applybutton = "//button[contains(.,'apply')]";
	public static final String selectfirstoffertitem = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/span/div/div";
//	public static final String selectfirstoffertitem = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/span/div/div";
	public static final String confirmsendofferbutton = "//*[@data-type='save-and-confirm']";
	public static final String confirmacceptofferbutton = "//*[@data-type='save-and-confirm']";
	public static final String offersentmessage = "Sent on";
	public static final String offerreceivedmessage = "Received on";
	public static final String offermessage = "//span[@class='iui-OfferStatus__text']";
	public static final String offersent = "//span[contains(.,'Sent on')]";
	public static final String offerreceived = "//span[contains(.,'Received on')]";
	public static final String offeraccepted = "//span[contains(.,'Accepted on')]";
	public static final String offerdrafted = "//span[contains(.,'Drafting an offer')]";
	public static final String offerdeclined = "//span[contains(.,'Declined on')]";
	public static final String acceptedtab = "//span[contains(.,'accepted')]";
	public static final String negotiationtab = "//span[contains(.,'in negotiation')]";
	public static final String negotiatebutton = "//button[@title='negotiate']";
	public static final String viewquantitylabel = "(//p[@class='value'])[last()]";
//	public static final String viewquantitylabel = "(//p[@class='value'])[8]";
	public static final String viewquantityfield = "//input[@step='1']"; //input[@placeholder='0']";
//	public static final String viewquantityfieldlast = "(//input[@class='quantity iui-BidCard--attribute--attribute-input'])[2]";
	public static final String viewquantityfieldlast = "(//input[@type='number'])[last()]";
	public static final String counteroffereditquantityandsizeslink = "//*[@class='iui-BidCard__qty__label iui-BidCard__qty__label--enabled']";
	public static final String counterofferincluded = "//*[@id='root']/div/div/span/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td[3]/input";
	public static final String counteroffersave = "//*[@data-type='save']";
	public static final String selectallitems = "//*[contains(text(),'select all')]";
	public static final String selectfirstitem = "(//span[@class=' firepath-matching-node'])[1]";
	public static final String selectfirstcasepack = "//*[@id='root']/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[3]/div/div[1]/div/span/div/div";
	public static final String removefirstitemlink = "(//button[contains(.,'Remove item from offer')])[1]";
	public static final String removelastitemlink = "(//button[contains(.,'Remove item from offer')])[last()]";
	public static final String counterofferlink = "//*[@name='counter-offer']";
	public static final String counterofferbutton = "(//*[contains(text(),'counter-offer')])[last()]";
	public static final String counterofferclosebutton = "//*[@class='iui-Button iui-Button--size--regular']";
	public static final String saveandreviewbutton = "//*[@title='save and review']";
	public static final String counterofferquantitylast = "(//*[@class='iui-BidCard__qty__value__input'])[last()]";
	public static final String counterofferquantityfirst = "(//*[@class='iui-BidCard__qty__value__input'])[last()-1]";
	public static final String submitagreeacceptofferbutton = "//button[contains(.,'offer')]";
	public static final String agreetoofferbutton = "//*[@title='agree to offer']";
	public static final String submitofferbutton = "//button[contains(.,'offer')]"; //*[@title='submit offer']";
	public static final String acceptofferbutton = "//button[contains(.,'offer')]"; //*[@title='accept offer']";
	public static final String goingoverchangesmessage = "//h2[contains(.,'This offer is currently going over changes.')]";
	public static final String offerchanging = "//span[contains(.,'This offer is currently undergoing some change')]";
	public static final String searchfield = "//input[@name='search']";
	public static final String actionslink = "//button[contains(.,'actions')]";
	public static final String endnegotiation = "//span[contains(.,'end negotiation')]";
	public static final String endnegotiationconfirm = "//div[@data-type='save-and-confirm']";
	public static final String sortbyaz = "//*[contains(text(),'A-Z')]";
	public static final String sortbyza = "//*[contains(text(),'Z-A')]";
	public static final String sortbysku = "//*[contains(text(),'SKU')]";
	public static final String sortbyid = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/ul/li[3]";
	public static final String sortbyquantityh = "//*[contains(text(),'Quantity (Highest To Lowest)')]";
	public static final String sortbyquantityl = "//*[contains(text(),'Quantity (Lowest To Highest)')]";
	public static final String sortbywhlh = "//*[contains(text(),'WHL (highest to lowest)')]";
	public static final String sortbywhll = "//*[contains(text(),'WHL (lowest to highest)')]";
	public static final String sortbymsrph = "//*[contains(text(),'MSRP (highest to lowest)')]";
	public static final String sortbymsrpl = "//*[contains(text(),'MSRP (lowest to highest)')]";
	public static final String sortbyticketh = "//*[contains(text(),'Ticket Price (highest to lowest)')]";
	public static final String sortbyticketl = "//*[contains(text(),'Ticket Price (lowest to highest')]";
	public static final String firstofferitem = "//*[@id='root']/div/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div[1]";
	public static final String firstoffercasepack = "//*[@class='iui-CasepackCard__data--title']";
	public static final String emailsubjectseller = "[INTURN] New Offer from Century 21 on ";
	public static final String offerstatus = "//*[@class='status success-status']";
// TOAST MESSAGES
	public static final String toast = "//div[@class='iui-Notification']";
	public static final String deletingfoldermessage = "Folder Deleted";
	public static final String productsaddedmessage = "Added";
	public static final String itemspricedmessage = "Priced";
	public static final String publishedoffermessage = "Published";
	public static final String creatingdmessage = "Creating";
	public static final String createdmessage = "Created";
	public static final String acceptingdmessage = "Accepting";
	public static final String acceptedmessage = "Accepted";
	public static final String negotiationendedmessage = "Ended";
	public static final String submittingmessage = "Submitting";
	public static final String submittedmessage = "Submitted";
	public static final String removedmessage = "Removed";
	public static final String revokedmessage = "Revoked";
	public static final String updatingmessage = "Updating";
	public static final String updatedmessage = "Updated";


// INBOX SELLER BUYER
	public static final String inboxusername = "//*[@id='login-username']";
	public static final String inboxnextbutton = "//*[@id='login-signin']";
	public static final String inboxpassword = "//*[@id='login-passwd']";
	public static final String inboxsigninbutton = "//*[@id='login-signin']";
	public static final String emailfrominturn = "//*[contains(text(),'support@inturn.co')]";
	public static final String emeailsubjectinside = "//*[@class='subject']";
	public static final String firstemeailsubject = "//*[@class='innermail ng-binding']";
	public static final String emeailsubject = "//*[@class='subject bold']"; // //*[@class='innermail ng-binding']
	public static final String searchmailbutton = "//*[@id='mail-search-btn']";
	public static final String selectallemails = "//*[@class='icon']";
	public static final String deleteemailbutton = "//*[@id='btn-delete']";
	public static final String archiveemailbutton = "//*[@id='btn-archive']";
	public static final String confirmdelete = "//*[@data-action='ok']";
// CHARLIE
	public static final String todaypricemichaelcors = "//*[@id='productPriceinfo']/span";
	public static final String macyssale = "//*[@class='priceSale']";
	public static final String todaypricemacys = "//*[@id='price']";
    public static final String URL = "http://www.store.demoqa.com";
    public static final String Username = "testuser_1";
    public static final String Password = "Test@123";
    public static final String Path_TestData = "C://Users//Administrator//workspace//inturn//src//testData//";
    public static final String File_TestData = "TestData.xlsx";
}
