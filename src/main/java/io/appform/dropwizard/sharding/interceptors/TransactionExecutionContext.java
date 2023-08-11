package io.appform.dropwizard.sharding.interceptors;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TransactionExecutionContext {
    String opType;
    String shardName;
    Class<?> daoClass;
    Class<?> entityClass;
    String lockedContextMode;
}
