package io.fruitful.ecomerce.dto;

public interface MagentoConst {
	String FILTER_FIELD = "searchCriteria[filter_groups][%s][filters][%s][field]";
	String FILTER_VALUE = "searchCriteria[filter_groups][%s][filters][%s][value]";
	String FILTER_TYPE = "searchCriteria[filter_groups][%s][filters][%s][condition_type]";
	String SORT_FIELD = "searchCriteria[sortOrders][%s][field]";
	String SORT_DIRECTION = "searchCriteria[sortOrders][%s][direction]";
	String PAGING_SIZE = "searchCriteria[pageSize]";
	String PAGING_INDEX = "searchCriteria[currentPage]";
	String NAME = "name";
	String STATUS = "status";
	String PRICE = "price";
	Integer IN_STOCK = 1;
	String IS_ACTIVE = "is_active";
	Integer ACTIVE = 1;
	Integer INACTIVE = 0;
	String PATH = "path";
	String PARENT_ID = "parent_id";
	Integer ENABLE = 1;
	Integer DISABLE = 2;
	String CREATED_AT = "created_at";
	String IN = "in";
	String EQ = "eq";
	String LIKE = "like";
	String DESC = "DESC";
	String ASC = "ASC";
	String ROOT_CATEGORY_ID = "root_category_id";
	Integer APPROVE_STATUS = 1;
	Integer AWAITING_APPROVE_STATUS = 2;
	String NOT_NULL = "notnull";
	String NOT_IN = "nin";

	//----- ATTRIBUTE CODE -----//
	String CATEGORY_ID = "category_id";
	String CATEGORY_IDS_ATTRIBUTE = "category_ids";
	String SHORT_DESCRIPTION_ATTRIBUTE = "short_description";
	String SPECIAL_PRICE_ATTRIBUTE = "special_price";
	String DESCRIPTION_ATTRIBUTE = "description";
	String PRODUCT_TALENT = "product_talent";
	String APPROVE = "approve";
}
