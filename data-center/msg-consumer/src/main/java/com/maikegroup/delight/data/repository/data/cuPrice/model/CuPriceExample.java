package com.maikegroup.delight.data.repository.data.cuPrice.model;

import java.util.ArrayList;
import java.util.List;

public class CuPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CuPriceExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
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

        public Criteria andDatestrIsNull() {
            addCriterion("dateStr is null");
            return (Criteria) this;
        }

        public Criteria andDatestrIsNotNull() {
            addCriterion("dateStr is not null");
            return (Criteria) this;
        }

        public Criteria andDatestrEqualTo(String value) {
            addCriterion("dateStr =", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotEqualTo(String value) {
            addCriterion("dateStr <>", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThan(String value) {
            addCriterion("dateStr >", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThanOrEqualTo(String value) {
            addCriterion("dateStr >=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThan(String value) {
            addCriterion("dateStr <", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThanOrEqualTo(String value) {
            addCriterion("dateStr <=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLike(String value) {
            addCriterion("dateStr like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotLike(String value) {
            addCriterion("dateStr not like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrIn(List<String> values) {
            addCriterion("dateStr in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotIn(List<String> values) {
            addCriterion("dateStr not in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrBetween(String value1, String value2) {
            addCriterion("dateStr between", value1, value2, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotBetween(String value1, String value2) {
            addCriterion("dateStr not between", value1, value2, "datestr");
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

        public Criteria andRollpriceIsNull() {
            addCriterion("rollPrice is null");
            return (Criteria) this;
        }

        public Criteria andRollpriceIsNotNull() {
            addCriterion("rollPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRollpriceEqualTo(String value) {
            addCriterion("rollPrice =", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceNotEqualTo(String value) {
            addCriterion("rollPrice <>", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceGreaterThan(String value) {
            addCriterion("rollPrice >", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceGreaterThanOrEqualTo(String value) {
            addCriterion("rollPrice >=", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceLessThan(String value) {
            addCriterion("rollPrice <", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceLessThanOrEqualTo(String value) {
            addCriterion("rollPrice <=", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceLike(String value) {
            addCriterion("rollPrice like", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceNotLike(String value) {
            addCriterion("rollPrice not like", value, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceIn(List<String> values) {
            addCriterion("rollPrice in", values, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceNotIn(List<String> values) {
            addCriterion("rollPrice not in", values, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceBetween(String value1, String value2) {
            addCriterion("rollPrice between", value1, value2, "rollprice");
            return (Criteria) this;
        }

        public Criteria andRollpriceNotBetween(String value1, String value2) {
            addCriterion("rollPrice not between", value1, value2, "rollprice");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andTIdLikeInsensitive(String value) {
            addCriterion("upper(t_id) like", value.toUpperCase(), "tId");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andDatestrLikeInsensitive(String value) {
            addCriterion("upper(dateStr) like", value.toUpperCase(), "datestr");
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

        public Criteria andRollpriceLikeInsensitive(String value) {
            addCriterion("upper(rollPrice) like", value.toUpperCase(), "rollprice");
            return (Criteria) this;
        }

        public Criteria andUnitLikeInsensitive(String value) {
            addCriterion("upper(unit) like", value.toUpperCase(), "unit");
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