package com.maikegroup.delight.data.repository.data.lmeprice.model;

import java.util.ArrayList;
import java.util.List;

public class LmePriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmePriceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(Integer value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(Integer value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(Integer value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(Integer value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(Integer value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<Integer> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<Integer> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(Integer value1, Integer value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andPricerangeIsNull() {
            addCriterion("priceRange is null");
            return (Criteria) this;
        }

        public Criteria andPricerangeIsNotNull() {
            addCriterion("priceRange is not null");
            return (Criteria) this;
        }

        public Criteria andPricerangeEqualTo(String value) {
            addCriterion("priceRange =", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotEqualTo(String value) {
            addCriterion("priceRange <>", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeGreaterThan(String value) {
            addCriterion("priceRange >", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeGreaterThanOrEqualTo(String value) {
            addCriterion("priceRange >=", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLessThan(String value) {
            addCriterion("priceRange <", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLessThanOrEqualTo(String value) {
            addCriterion("priceRange <=", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLike(String value) {
            addCriterion("priceRange like", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotLike(String value) {
            addCriterion("priceRange not like", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeIn(List<String> values) {
            addCriterion("priceRange in", values, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotIn(List<String> values) {
            addCriterion("priceRange not in", values, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeBetween(String value1, String value2) {
            addCriterion("priceRange between", value1, value2, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotBetween(String value1, String value2) {
            addCriterion("priceRange not between", value1, value2, "pricerange");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIsNull() {
            addCriterion("avgPrice is null");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIsNotNull() {
            addCriterion("avgPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAvgpriceEqualTo(String value) {
            addCriterion("avgPrice =", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotEqualTo(String value) {
            addCriterion("avgPrice <>", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceGreaterThan(String value) {
            addCriterion("avgPrice >", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceGreaterThanOrEqualTo(String value) {
            addCriterion("avgPrice >=", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLessThan(String value) {
            addCriterion("avgPrice <", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLessThanOrEqualTo(String value) {
            addCriterion("avgPrice <=", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLike(String value) {
            addCriterion("avgPrice like", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotLike(String value) {
            addCriterion("avgPrice not like", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIn(List<String> values) {
            addCriterion("avgPrice in", values, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotIn(List<String> values) {
            addCriterion("avgPrice not in", values, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceBetween(String value1, String value2) {
            addCriterion("avgPrice between", value1, value2, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotBetween(String value1, String value2) {
            addCriterion("avgPrice not between", value1, value2, "avgprice");
            return (Criteria) this;
        }

        public Criteria andUp2downIsNull() {
            addCriterion("up2down is null");
            return (Criteria) this;
        }

        public Criteria andUp2downIsNotNull() {
            addCriterion("up2down is not null");
            return (Criteria) this;
        }

        public Criteria andUp2downEqualTo(String value) {
            addCriterion("up2down =", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downNotEqualTo(String value) {
            addCriterion("up2down <>", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downGreaterThan(String value) {
            addCriterion("up2down >", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downGreaterThanOrEqualTo(String value) {
            addCriterion("up2down >=", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downLessThan(String value) {
            addCriterion("up2down <", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downLessThanOrEqualTo(String value) {
            addCriterion("up2down <=", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downLike(String value) {
            addCriterion("up2down like", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downNotLike(String value) {
            addCriterion("up2down not like", value, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downIn(List<String> values) {
            addCriterion("up2down in", values, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downNotIn(List<String> values) {
            addCriterion("up2down not in", values, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downBetween(String value1, String value2) {
            addCriterion("up2down between", value1, value2, "up2down");
            return (Criteria) this;
        }

        public Criteria andUp2downNotBetween(String value1, String value2) {
            addCriterion("up2down not between", value1, value2, "up2down");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNull() {
            addCriterion("danwei is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("danwei is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("danwei =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("danwei <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("danwei >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("danwei >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("danwei <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("danwei <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("danwei like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("danwei not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("danwei in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("danwei not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("danwei between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("danwei not between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andDateLikeInsensitive(String value) {
            addCriterion("upper(date) like", value.toUpperCase(), "date");
            return (Criteria) this;
        }

        public Criteria andPricerangeLikeInsensitive(String value) {
            addCriterion("upper(priceRange) like", value.toUpperCase(), "pricerange");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLikeInsensitive(String value) {
            addCriterion("upper(avgPrice) like", value.toUpperCase(), "avgprice");
            return (Criteria) this;
        }

        public Criteria andUp2downLikeInsensitive(String value) {
            addCriterion("upper(up2down) like", value.toUpperCase(), "up2down");
            return (Criteria) this;
        }

        public Criteria andDanweiLikeInsensitive(String value) {
            addCriterion("upper(danwei) like", value.toUpperCase(), "danwei");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}