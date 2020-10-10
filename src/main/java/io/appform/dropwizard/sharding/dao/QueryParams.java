package io.appform.dropwizard.sharding.dao;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class QueryParams {

    private String queryName;

    private Map<String, Object> params;

}
