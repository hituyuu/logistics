package com.qf.logistics.manage.pojo.po;

import java.util.ArrayList;
import java.lang.String;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNode1IsNull() {
            addCriterion("node1 is null");
            return (Criteria) this;
        }

        public Criteria andNode1IsNotNull() {
            addCriterion("node1 is not null");
            return (Criteria) this;
        }

        public Criteria andNode1EqualTo(String value) {
            addCriterion("node1 =", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1NotEqualTo(String value) {
            addCriterion("node1 <>", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1GreaterThan(String value) {
            addCriterion("node1 >", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1GreaterThanOrEqualTo(String value) {
            addCriterion("node1 >=", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1LessThan(String value) {
            addCriterion("node1 <", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1LessThanOrEqualTo(String value) {
            addCriterion("node1 <=", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1Like(String value) {
            addCriterion("node1 like", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1NotLike(String value) {
            addCriterion("node1 not like", value, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1In(List<String> values) {
            addCriterion("node1 in", values, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1NotIn(List<String> values) {
            addCriterion("node1 not in", values, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1Between(String value1, String value2) {
            addCriterion("node1 between", value1, value2, "node1");
            return (Criteria) this;
        }

        public Criteria andNode1NotBetween(String value1, String value2) {
            addCriterion("node1 not between", value1, value2, "node1");
            return (Criteria) this;
        }

        public Criteria andTime1IsNull() {
            addCriterion("time1 is null");
            return (Criteria) this;
        }

        public Criteria andTime1IsNotNull() {
            addCriterion("time1 is not null");
            return (Criteria) this;
        }

        public Criteria andTime1EqualTo(String value) {
            addCriterion("time1 =", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotEqualTo(String value) {
            addCriterion("time1 <>", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThan(String value) {
            addCriterion("time1 >", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThanOrEqualTo(String value) {
            addCriterion("time1 >=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThan(String value) {
            addCriterion("time1 <", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThanOrEqualTo(String value) {
            addCriterion("time1 <=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1In(List<String> values) {
            addCriterion("time1 in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotIn(List<String> values) {
            addCriterion("time1 not in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Between(String value1, String value2) {
            addCriterion("time1 between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotBetween(String value1, String value2) {
            addCriterion("time1 not between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andCity1IsNull() {
            addCriterion("city1 is null");
            return (Criteria) this;
        }

        public Criteria andCity1IsNotNull() {
            addCriterion("city1 is not null");
            return (Criteria) this;
        }

        public Criteria andCity1EqualTo(String value) {
            addCriterion("city1 =", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotEqualTo(String value) {
            addCriterion("city1 <>", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1GreaterThan(String value) {
            addCriterion("city1 >", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1GreaterThanOrEqualTo(String value) {
            addCriterion("city1 >=", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1LessThan(String value) {
            addCriterion("city1 <", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1LessThanOrEqualTo(String value) {
            addCriterion("city1 <=", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1Like(String value) {
            addCriterion("city1 like", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotLike(String value) {
            addCriterion("city1 not like", value, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1In(List<String> values) {
            addCriterion("city1 in", values, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotIn(List<String> values) {
            addCriterion("city1 not in", values, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1Between(String value1, String value2) {
            addCriterion("city1 between", value1, value2, "city1");
            return (Criteria) this;
        }

        public Criteria andCity1NotBetween(String value1, String value2) {
            addCriterion("city1 not between", value1, value2, "city1");
            return (Criteria) this;
        }

        public Criteria andTime2IsNull() {
            addCriterion("time2 is null");
            return (Criteria) this;
        }

        public Criteria andTime2IsNotNull() {
            addCriterion("time2 is not null");
            return (Criteria) this;
        }

        public Criteria andTime2EqualTo(String value) {
            addCriterion("time2 =", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotEqualTo(String value) {
            addCriterion("time2 <>", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThan(String value) {
            addCriterion("time2 >", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThanOrEqualTo(String value) {
            addCriterion("time2 >=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThan(String value) {
            addCriterion("time2 <", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThanOrEqualTo(String value) {
            addCriterion("time2 <=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2In(List<String> values) {
            addCriterion("time2 in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotIn(List<String> values) {
            addCriterion("time2 not in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2Between(String value1, String value2) {
            addCriterion("time2 between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotBetween(String value1, String value2) {
            addCriterion("time2 not between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andCenter1IsNull() {
            addCriterion("center1 is null");
            return (Criteria) this;
        }

        public Criteria andCenter1IsNotNull() {
            addCriterion("center1 is not null");
            return (Criteria) this;
        }

        public Criteria andCenter1EqualTo(String value) {
            addCriterion("center1 =", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1NotEqualTo(String value) {
            addCriterion("center1 <>", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1GreaterThan(String value) {
            addCriterion("center1 >", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1GreaterThanOrEqualTo(String value) {
            addCriterion("center1 >=", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1LessThan(String value) {
            addCriterion("center1 <", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1LessThanOrEqualTo(String value) {
            addCriterion("center1 <=", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1Like(String value) {
            addCriterion("center1 like", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1NotLike(String value) {
            addCriterion("center1 not like", value, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1In(List<String> values) {
            addCriterion("center1 in", values, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1NotIn(List<String> values) {
            addCriterion("center1 not in", values, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1Between(String value1, String value2) {
            addCriterion("center1 between", value1, value2, "center1");
            return (Criteria) this;
        }

        public Criteria andCenter1NotBetween(String value1, String value2) {
            addCriterion("center1 not between", value1, value2, "center1");
            return (Criteria) this;
        }

        public Criteria andTime3IsNull() {
            addCriterion("time3 is null");
            return (Criteria) this;
        }

        public Criteria andTime3IsNotNull() {
            addCriterion("time3 is not null");
            return (Criteria) this;
        }

        public Criteria andTime3EqualTo(String value) {
            addCriterion("time3 =", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotEqualTo(String value) {
            addCriterion("time3 <>", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThan(String value) {
            addCriterion("time3 >", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThanOrEqualTo(String value) {
            addCriterion("time3 >=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThan(String value) {
            addCriterion("time3 <", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThanOrEqualTo(String value) {
            addCriterion("time3 <=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3In(List<String> values) {
            addCriterion("time3 in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotIn(List<String> values) {
            addCriterion("time3 not in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3Between(String value1, String value2) {
            addCriterion("time3 between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotBetween(String value1, String value2) {
            addCriterion("time3 not between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andCenter2IsNull() {
            addCriterion("center2 is null");
            return (Criteria) this;
        }

        public Criteria andCenter2IsNotNull() {
            addCriterion("center2 is not null");
            return (Criteria) this;
        }

        public Criteria andCenter2EqualTo(String value) {
            addCriterion("center2 =", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2NotEqualTo(String value) {
            addCriterion("center2 <>", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2GreaterThan(String value) {
            addCriterion("center2 >", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2GreaterThanOrEqualTo(String value) {
            addCriterion("center2 >=", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2LessThan(String value) {
            addCriterion("center2 <", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2LessThanOrEqualTo(String value) {
            addCriterion("center2 <=", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2Like(String value) {
            addCriterion("center2 like", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2NotLike(String value) {
            addCriterion("center2 not like", value, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2In(List<String> values) {
            addCriterion("center2 in", values, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2NotIn(List<String> values) {
            addCriterion("center2 not in", values, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2Between(String value1, String value2) {
            addCriterion("center2 between", value1, value2, "center2");
            return (Criteria) this;
        }

        public Criteria andCenter2NotBetween(String value1, String value2) {
            addCriterion("center2 not between", value1, value2, "center2");
            return (Criteria) this;
        }

        public Criteria andTime4IsNull() {
            addCriterion("time4 is null");
            return (Criteria) this;
        }

        public Criteria andTime4IsNotNull() {
            addCriterion("time4 is not null");
            return (Criteria) this;
        }

        public Criteria andTime4EqualTo(String value) {
            addCriterion("time4 =", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotEqualTo(String value) {
            addCriterion("time4 <>", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThan(String value) {
            addCriterion("time4 >", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThanOrEqualTo(String value) {
            addCriterion("time4 >=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThan(String value) {
            addCriterion("time4 <", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThanOrEqualTo(String value) {
            addCriterion("time4 <=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4In(List<String> values) {
            addCriterion("time4 in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotIn(List<String> values) {
            addCriterion("time4 not in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4Between(String value1, String value2) {
            addCriterion("time4 between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotBetween(String value1, String value2) {
            addCriterion("time4 not between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andCity2IsNull() {
            addCriterion("city2 is null");
            return (Criteria) this;
        }

        public Criteria andCity2IsNotNull() {
            addCriterion("city2 is not null");
            return (Criteria) this;
        }

        public Criteria andCity2EqualTo(String value) {
            addCriterion("city2 =", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotEqualTo(String value) {
            addCriterion("city2 <>", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2GreaterThan(String value) {
            addCriterion("city2 >", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2GreaterThanOrEqualTo(String value) {
            addCriterion("city2 >=", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2LessThan(String value) {
            addCriterion("city2 <", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2LessThanOrEqualTo(String value) {
            addCriterion("city2 <=", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2Like(String value) {
            addCriterion("city2 like", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotLike(String value) {
            addCriterion("city2 not like", value, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2In(List<String> values) {
            addCriterion("city2 in", values, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotIn(List<String> values) {
            addCriterion("city2 not in", values, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2Between(String value1, String value2) {
            addCriterion("city2 between", value1, value2, "city2");
            return (Criteria) this;
        }

        public Criteria andCity2NotBetween(String value1, String value2) {
            addCriterion("city2 not between", value1, value2, "city2");
            return (Criteria) this;
        }

        public Criteria andTime5IsNull() {
            addCriterion("time5 is null");
            return (Criteria) this;
        }

        public Criteria andTime5IsNotNull() {
            addCriterion("time5 is not null");
            return (Criteria) this;
        }

        public Criteria andTime5EqualTo(String value) {
            addCriterion("time5 =", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5NotEqualTo(String value) {
            addCriterion("time5 <>", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5GreaterThan(String value) {
            addCriterion("time5 >", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5GreaterThanOrEqualTo(String value) {
            addCriterion("time5 >=", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5LessThan(String value) {
            addCriterion("time5 <", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5LessThanOrEqualTo(String value) {
            addCriterion("time5 <=", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5In(List<String> values) {
            addCriterion("time5 in", values, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5NotIn(List<String> values) {
            addCriterion("time5 not in", values, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5Between(String value1, String value2) {
            addCriterion("time5 between", value1, value2, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5NotBetween(String value1, String value2) {
            addCriterion("time5 not between", value1, value2, "time5");
            return (Criteria) this;
        }

        public Criteria andNode2IsNull() {
            addCriterion("node2 is null");
            return (Criteria) this;
        }

        public Criteria andNode2IsNotNull() {
            addCriterion("node2 is not null");
            return (Criteria) this;
        }

        public Criteria andNode2EqualTo(String value) {
            addCriterion("node2 =", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2NotEqualTo(String value) {
            addCriterion("node2 <>", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2GreaterThan(String value) {
            addCriterion("node2 >", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2GreaterThanOrEqualTo(String value) {
            addCriterion("node2 >=", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2LessThan(String value) {
            addCriterion("node2 <", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2LessThanOrEqualTo(String value) {
            addCriterion("node2 <=", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2Like(String value) {
            addCriterion("node2 like", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2NotLike(String value) {
            addCriterion("node2 not like", value, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2In(List<String> values) {
            addCriterion("node2 in", values, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2NotIn(List<String> values) {
            addCriterion("node2 not in", values, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2Between(String value1, String value2) {
            addCriterion("node2 between", value1, value2, "node2");
            return (Criteria) this;
        }

        public Criteria andNode2NotBetween(String value1, String value2) {
            addCriterion("node2 not between", value1, value2, "node2");
            return (Criteria) this;
        }

        public Criteria andTime6IsNull() {
            addCriterion("time6 is null");
            return (Criteria) this;
        }

        public Criteria andTime6IsNotNull() {
            addCriterion("time6 is not null");
            return (Criteria) this;
        }

        public Criteria andTime6EqualTo(String value) {
            addCriterion("time6 =", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6NotEqualTo(String value) {
            addCriterion("time6 <>", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6GreaterThan(String value) {
            addCriterion("time6 >", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6GreaterThanOrEqualTo(String value) {
            addCriterion("time6 >=", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6LessThan(String value) {
            addCriterion("time6 <", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6LessThanOrEqualTo(String value) {
            addCriterion("time6 <=", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6In(List<String> values) {
            addCriterion("time6 in", values, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6NotIn(List<String> values) {
            addCriterion("time6 not in", values, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6Between(String value1, String value2) {
            addCriterion("time6 between", value1, value2, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6NotBetween(String value1, String value2) {
            addCriterion("time6 not between", value1, value2, "time6");
            return (Criteria) this;
        }

        public Criteria andGaddressIsNull() {
            addCriterion("gaddress is null");
            return (Criteria) this;
        }

        public Criteria andGaddressIsNotNull() {
            addCriterion("gaddress is not null");
            return (Criteria) this;
        }

        public Criteria andGaddressEqualTo(String value) {
            addCriterion("gaddress =", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotEqualTo(String value) {
            addCriterion("gaddress <>", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressGreaterThan(String value) {
            addCriterion("gaddress >", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressGreaterThanOrEqualTo(String value) {
            addCriterion("gaddress >=", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLessThan(String value) {
            addCriterion("gaddress <", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLessThanOrEqualTo(String value) {
            addCriterion("gaddress <=", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andgaddressLike(String value) {
            addCriterion("gaddress like", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotLike(String value) {
            addCriterion("gaddress not like", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressIn(List<String> values) {
            addCriterion("gaddress in", values, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotIn(List<String> values) {
            addCriterion("gaddress not in", values, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressBetween(String value1, String value2) {
            addCriterion("gaddress between", value1, value2, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotBetween(String value1, String value2) {
            addCriterion("gaddress not between", value1, value2, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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