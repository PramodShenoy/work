/*
 * This file is generated by jOOQ.
*/
package com.cf.performance_schema;


import com.cf.DefaultCatalog;
import com.cf.performance_schema.tables.Accounts;
import com.cf.performance_schema.tables.CondInstances;
import com.cf.performance_schema.tables.EventsStagesCurrent;
import com.cf.performance_schema.tables.EventsStagesHistory;
import com.cf.performance_schema.tables.EventsStagesHistoryLong;
import com.cf.performance_schema.tables.EventsStagesSummaryByAccountByEventName;
import com.cf.performance_schema.tables.EventsStagesSummaryByHostByEventName;
import com.cf.performance_schema.tables.EventsStagesSummaryByThreadByEventName;
import com.cf.performance_schema.tables.EventsStagesSummaryByUserByEventName;
import com.cf.performance_schema.tables.EventsStagesSummaryGlobalByEventName;
import com.cf.performance_schema.tables.EventsStatementsCurrent;
import com.cf.performance_schema.tables.EventsStatementsHistory;
import com.cf.performance_schema.tables.EventsStatementsHistoryLong;
import com.cf.performance_schema.tables.EventsStatementsSummaryByAccountByEventName;
import com.cf.performance_schema.tables.EventsStatementsSummaryByDigest;
import com.cf.performance_schema.tables.EventsStatementsSummaryByHostByEventName;
import com.cf.performance_schema.tables.EventsStatementsSummaryByProgram;
import com.cf.performance_schema.tables.EventsStatementsSummaryByThreadByEventName;
import com.cf.performance_schema.tables.EventsStatementsSummaryByUserByEventName;
import com.cf.performance_schema.tables.EventsStatementsSummaryGlobalByEventName;
import com.cf.performance_schema.tables.EventsTransactionsCurrent;
import com.cf.performance_schema.tables.EventsTransactionsHistory;
import com.cf.performance_schema.tables.EventsTransactionsHistoryLong;
import com.cf.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName;
import com.cf.performance_schema.tables.EventsTransactionsSummaryByHostByEventName;
import com.cf.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName;
import com.cf.performance_schema.tables.EventsTransactionsSummaryByUserByEventName;
import com.cf.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName;
import com.cf.performance_schema.tables.EventsWaitsCurrent;
import com.cf.performance_schema.tables.EventsWaitsHistory;
import com.cf.performance_schema.tables.EventsWaitsHistoryLong;
import com.cf.performance_schema.tables.EventsWaitsSummaryByAccountByEventName;
import com.cf.performance_schema.tables.EventsWaitsSummaryByHostByEventName;
import com.cf.performance_schema.tables.EventsWaitsSummaryByInstance;
import com.cf.performance_schema.tables.EventsWaitsSummaryByThreadByEventName;
import com.cf.performance_schema.tables.EventsWaitsSummaryByUserByEventName;
import com.cf.performance_schema.tables.EventsWaitsSummaryGlobalByEventName;
import com.cf.performance_schema.tables.FileInstances;
import com.cf.performance_schema.tables.FileSummaryByEventName;
import com.cf.performance_schema.tables.FileSummaryByInstance;
import com.cf.performance_schema.tables.GlobalStatus;
import com.cf.performance_schema.tables.GlobalVariables;
import com.cf.performance_schema.tables.HostCache;
import com.cf.performance_schema.tables.Hosts;
import com.cf.performance_schema.tables.MemorySummaryByAccountByEventName;
import com.cf.performance_schema.tables.MemorySummaryByHostByEventName;
import com.cf.performance_schema.tables.MemorySummaryByThreadByEventName;
import com.cf.performance_schema.tables.MemorySummaryByUserByEventName;
import com.cf.performance_schema.tables.MemorySummaryGlobalByEventName;
import com.cf.performance_schema.tables.MetadataLocks;
import com.cf.performance_schema.tables.MutexInstances;
import com.cf.performance_schema.tables.ObjectsSummaryGlobalByType;
import com.cf.performance_schema.tables.PerformanceTimers;
import com.cf.performance_schema.tables.PreparedStatementsInstances;
import com.cf.performance_schema.tables.ReplicationApplierConfiguration;
import com.cf.performance_schema.tables.ReplicationApplierStatus;
import com.cf.performance_schema.tables.ReplicationApplierStatusByCoordinator;
import com.cf.performance_schema.tables.ReplicationApplierStatusByWorker;
import com.cf.performance_schema.tables.ReplicationConnectionConfiguration;
import com.cf.performance_schema.tables.ReplicationConnectionStatus;
import com.cf.performance_schema.tables.ReplicationGroupMemberStats;
import com.cf.performance_schema.tables.ReplicationGroupMembers;
import com.cf.performance_schema.tables.RwlockInstances;
import com.cf.performance_schema.tables.SessionAccountConnectAttrs;
import com.cf.performance_schema.tables.SessionConnectAttrs;
import com.cf.performance_schema.tables.SessionStatus;
import com.cf.performance_schema.tables.SessionVariables;
import com.cf.performance_schema.tables.SetupActors;
import com.cf.performance_schema.tables.SetupConsumers;
import com.cf.performance_schema.tables.SetupInstruments;
import com.cf.performance_schema.tables.SetupObjects;
import com.cf.performance_schema.tables.SetupTimers;
import com.cf.performance_schema.tables.SocketInstances;
import com.cf.performance_schema.tables.SocketSummaryByEventName;
import com.cf.performance_schema.tables.SocketSummaryByInstance;
import com.cf.performance_schema.tables.StatusByAccount;
import com.cf.performance_schema.tables.StatusByHost;
import com.cf.performance_schema.tables.StatusByThread;
import com.cf.performance_schema.tables.StatusByUser;
import com.cf.performance_schema.tables.TableHandles;
import com.cf.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;
import com.cf.performance_schema.tables.TableIoWaitsSummaryByTable;
import com.cf.performance_schema.tables.TableLockWaitsSummaryByTable;
import com.cf.performance_schema.tables.Threads;
import com.cf.performance_schema.tables.UserVariablesByThread;
import com.cf.performance_schema.tables.Users;
import com.cf.performance_schema.tables.VariablesByThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PerformanceSchema extends SchemaImpl {

    private static final long serialVersionUID = 1021013519;

    /**
     * The reference instance of <code>performance_schema</code>
     */
    public static final PerformanceSchema PERFORMANCE_SCHEMA = new PerformanceSchema();

    /**
     * The table <code>performance_schema.accounts</code>.
     */
    public final Accounts ACCOUNTS = com.cf.performance_schema.tables.Accounts.ACCOUNTS;

    /**
     * The table <code>performance_schema.cond_instances</code>.
     */
    public final CondInstances COND_INSTANCES = com.cf.performance_schema.tables.CondInstances.COND_INSTANCES;

    /**
     * The table <code>performance_schema.events_stages_current</code>.
     */
    public final EventsStagesCurrent EVENTS_STAGES_CURRENT = com.cf.performance_schema.tables.EventsStagesCurrent.EVENTS_STAGES_CURRENT;

    /**
     * The table <code>performance_schema.events_stages_history</code>.
     */
    public final EventsStagesHistory EVENTS_STAGES_HISTORY = com.cf.performance_schema.tables.EventsStagesHistory.EVENTS_STAGES_HISTORY;

    /**
     * The table <code>performance_schema.events_stages_history_long</code>.
     */
    public final EventsStagesHistoryLong EVENTS_STAGES_HISTORY_LONG = com.cf.performance_schema.tables.EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_stages_summary_by_account_by_event_name</code>.
     */
    public final EventsStagesSummaryByAccountByEventName EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_host_by_event_name</code>.
     */
    public final EventsStagesSummaryByHostByEventName EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>.
     */
    public final EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_user_by_event_name</code>.
     */
    public final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_global_by_event_name</code>.
     */
    public final EventsStagesSummaryGlobalByEventName EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_current</code>.
     */
    public final EventsStatementsCurrent EVENTS_STATEMENTS_CURRENT = com.cf.performance_schema.tables.EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT;

    /**
     * The table <code>performance_schema.events_statements_history</code>.
     */
    public final EventsStatementsHistory EVENTS_STATEMENTS_HISTORY = com.cf.performance_schema.tables.EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY;

    /**
     * The table <code>performance_schema.events_statements_history_long</code>.
     */
    public final EventsStatementsHistoryLong EVENTS_STATEMENTS_HISTORY_LONG = com.cf.performance_schema.tables.EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_statements_summary_by_account_by_event_name</code>.
     */
    public final EventsStatementsSummaryByAccountByEventName EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_digest</code>.
     */
    public final EventsStatementsSummaryByDigest EVENTS_STATEMENTS_SUMMARY_BY_DIGEST = com.cf.performance_schema.tables.EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST;

    /**
     * The table <code>performance_schema.events_statements_summary_by_host_by_event_name</code>.
     */
    public final EventsStatementsSummaryByHostByEventName EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_program</code>.
     */
    public final EventsStatementsSummaryByProgram EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM = com.cf.performance_schema.tables.EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM;

    /**
     * The table <code>performance_schema.events_statements_summary_by_thread_by_event_name</code>.
     */
    public final EventsStatementsSummaryByThreadByEventName EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_user_by_event_name</code>.
     */
    public final EventsStatementsSummaryByUserByEventName EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_global_by_event_name</code>.
     */
    public final EventsStatementsSummaryGlobalByEventName EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_current</code>.
     */
    public final EventsTransactionsCurrent EVENTS_TRANSACTIONS_CURRENT = com.cf.performance_schema.tables.EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT;

    /**
     * The table <code>performance_schema.events_transactions_history</code>.
     */
    public final EventsTransactionsHistory EVENTS_TRANSACTIONS_HISTORY = com.cf.performance_schema.tables.EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY;

    /**
     * The table <code>performance_schema.events_transactions_history_long</code>.
     */
    public final EventsTransactionsHistoryLong EVENTS_TRANSACTIONS_HISTORY_LONG = com.cf.performance_schema.tables.EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_account_by_event_name</code>.
     */
    public final EventsTransactionsSummaryByAccountByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_host_by_event_name</code>.
     */
    public final EventsTransactionsSummaryByHostByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_thread_by_event_name</code>.
     */
    public final EventsTransactionsSummaryByThreadByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_user_by_event_name</code>.
     */
    public final EventsTransactionsSummaryByUserByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_global_by_event_name</code>.
     */
    public final EventsTransactionsSummaryGlobalByEventName EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_current</code>.
     */
    public final EventsWaitsCurrent EVENTS_WAITS_CURRENT = com.cf.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT;

    /**
     * The table <code>performance_schema.events_waits_history</code>.
     */
    public final EventsWaitsHistory EVENTS_WAITS_HISTORY = com.cf.performance_schema.tables.EventsWaitsHistory.EVENTS_WAITS_HISTORY;

    /**
     * The table <code>performance_schema.events_waits_history_long</code>.
     */
    public final EventsWaitsHistoryLong EVENTS_WAITS_HISTORY_LONG = com.cf.performance_schema.tables.EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_waits_summary_by_account_by_event_name</code>.
     */
    public final EventsWaitsSummaryByAccountByEventName EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_host_by_event_name</code>.
     */
    public final EventsWaitsSummaryByHostByEventName EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_instance</code>.
     */
    public final EventsWaitsSummaryByInstance EVENTS_WAITS_SUMMARY_BY_INSTANCE = com.cf.performance_schema.tables.EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>.
     */
    public final EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_user_by_event_name</code>.
     */
    public final EventsWaitsSummaryByUserByEventName EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_global_by_event_name</code>.
     */
    public final EventsWaitsSummaryGlobalByEventName EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.cf.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_instances</code>.
     */
    public final FileInstances FILE_INSTANCES = com.cf.performance_schema.tables.FileInstances.FILE_INSTANCES;

    /**
     * The table <code>performance_schema.file_summary_by_event_name</code>.
     */
    public final FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = com.cf.performance_schema.tables.FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_summary_by_instance</code>.
     */
    public final FileSummaryByInstance FILE_SUMMARY_BY_INSTANCE = com.cf.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.global_status</code>.
     */
    public final GlobalStatus GLOBAL_STATUS = com.cf.performance_schema.tables.GlobalStatus.GLOBAL_STATUS;

    /**
     * The table <code>performance_schema.global_variables</code>.
     */
    public final GlobalVariables GLOBAL_VARIABLES = com.cf.performance_schema.tables.GlobalVariables.GLOBAL_VARIABLES;

    /**
     * The table <code>performance_schema.hosts</code>.
     */
    public final Hosts HOSTS = com.cf.performance_schema.tables.Hosts.HOSTS;

    /**
     * The table <code>performance_schema.host_cache</code>.
     */
    public final HostCache HOST_CACHE = com.cf.performance_schema.tables.HostCache.HOST_CACHE;

    /**
     * The table <code>performance_schema.memory_summary_by_account_by_event_name</code>.
     */
    public final MemorySummaryByAccountByEventName MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.cf.performance_schema.tables.MemorySummaryByAccountByEventName.MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_host_by_event_name</code>.
     */
    public final MemorySummaryByHostByEventName MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME = com.cf.performance_schema.tables.MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_thread_by_event_name</code>.
     */
    public final MemorySummaryByThreadByEventName MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.cf.performance_schema.tables.MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_user_by_event_name</code>.
     */
    public final MemorySummaryByUserByEventName MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME = com.cf.performance_schema.tables.MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_global_by_event_name</code>.
     */
    public final MemorySummaryGlobalByEventName MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME = com.cf.performance_schema.tables.MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.metadata_locks</code>.
     */
    public final MetadataLocks METADATA_LOCKS = com.cf.performance_schema.tables.MetadataLocks.METADATA_LOCKS;

    /**
     * The table <code>performance_schema.mutex_instances</code>.
     */
    public final MutexInstances MUTEX_INSTANCES = com.cf.performance_schema.tables.MutexInstances.MUTEX_INSTANCES;

    /**
     * The table <code>performance_schema.objects_summary_global_by_type</code>.
     */
    public final ObjectsSummaryGlobalByType OBJECTS_SUMMARY_GLOBAL_BY_TYPE = com.cf.performance_schema.tables.ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE;

    /**
     * The table <code>performance_schema.performance_timers</code>.
     */
    public final PerformanceTimers PERFORMANCE_TIMERS = com.cf.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS;

    /**
     * The table <code>performance_schema.prepared_statements_instances</code>.
     */
    public final PreparedStatementsInstances PREPARED_STATEMENTS_INSTANCES = com.cf.performance_schema.tables.PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES;

    /**
     * The table <code>performance_schema.replication_applier_configuration</code>.
     */
    public final ReplicationApplierConfiguration REPLICATION_APPLIER_CONFIGURATION = com.cf.performance_schema.tables.ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION;

    /**
     * The table <code>performance_schema.replication_applier_status</code>.
     */
    public final ReplicationApplierStatus REPLICATION_APPLIER_STATUS = com.cf.performance_schema.tables.ReplicationApplierStatus.REPLICATION_APPLIER_STATUS;

    /**
     * The table <code>performance_schema.replication_applier_status_by_coordinator</code>.
     */
    public final ReplicationApplierStatusByCoordinator REPLICATION_APPLIER_STATUS_BY_COORDINATOR = com.cf.performance_schema.tables.ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR;

    /**
     * The table <code>performance_schema.replication_applier_status_by_worker</code>.
     */
    public final ReplicationApplierStatusByWorker REPLICATION_APPLIER_STATUS_BY_WORKER = com.cf.performance_schema.tables.ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER;

    /**
     * The table <code>performance_schema.replication_connection_configuration</code>.
     */
    public final ReplicationConnectionConfiguration REPLICATION_CONNECTION_CONFIGURATION = com.cf.performance_schema.tables.ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION;

    /**
     * The table <code>performance_schema.replication_connection_status</code>.
     */
    public final ReplicationConnectionStatus REPLICATION_CONNECTION_STATUS = com.cf.performance_schema.tables.ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS;

    /**
     * The table <code>performance_schema.replication_group_members</code>.
     */
    public final ReplicationGroupMembers REPLICATION_GROUP_MEMBERS = com.cf.performance_schema.tables.ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS;

    /**
     * The table <code>performance_schema.replication_group_member_stats</code>.
     */
    public final ReplicationGroupMemberStats REPLICATION_GROUP_MEMBER_STATS = com.cf.performance_schema.tables.ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS;

    /**
     * The table <code>performance_schema.rwlock_instances</code>.
     */
    public final RwlockInstances RWLOCK_INSTANCES = com.cf.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES;

    /**
     * The table <code>performance_schema.session_account_connect_attrs</code>.
     */
    public final SessionAccountConnectAttrs SESSION_ACCOUNT_CONNECT_ATTRS = com.cf.performance_schema.tables.SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_connect_attrs</code>.
     */
    public final SessionConnectAttrs SESSION_CONNECT_ATTRS = com.cf.performance_schema.tables.SessionConnectAttrs.SESSION_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_status</code>.
     */
    public final SessionStatus SESSION_STATUS = com.cf.performance_schema.tables.SessionStatus.SESSION_STATUS;

    /**
     * The table <code>performance_schema.session_variables</code>.
     */
    public final SessionVariables SESSION_VARIABLES = com.cf.performance_schema.tables.SessionVariables.SESSION_VARIABLES;

    /**
     * The table <code>performance_schema.setup_actors</code>.
     */
    public final SetupActors SETUP_ACTORS = com.cf.performance_schema.tables.SetupActors.SETUP_ACTORS;

    /**
     * The table <code>performance_schema.setup_consumers</code>.
     */
    public final SetupConsumers SETUP_CONSUMERS = com.cf.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS;

    /**
     * The table <code>performance_schema.setup_instruments</code>.
     */
    public final SetupInstruments SETUP_INSTRUMENTS = com.cf.performance_schema.tables.SetupInstruments.SETUP_INSTRUMENTS;

    /**
     * The table <code>performance_schema.setup_objects</code>.
     */
    public final SetupObjects SETUP_OBJECTS = com.cf.performance_schema.tables.SetupObjects.SETUP_OBJECTS;

    /**
     * The table <code>performance_schema.setup_timers</code>.
     */
    public final SetupTimers SETUP_TIMERS = com.cf.performance_schema.tables.SetupTimers.SETUP_TIMERS;

    /**
     * The table <code>performance_schema.socket_instances</code>.
     */
    public final SocketInstances SOCKET_INSTANCES = com.cf.performance_schema.tables.SocketInstances.SOCKET_INSTANCES;

    /**
     * The table <code>performance_schema.socket_summary_by_event_name</code>.
     */
    public final SocketSummaryByEventName SOCKET_SUMMARY_BY_EVENT_NAME = com.cf.performance_schema.tables.SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.socket_summary_by_instance</code>.
     */
    public final SocketSummaryByInstance SOCKET_SUMMARY_BY_INSTANCE = com.cf.performance_schema.tables.SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.status_by_account</code>.
     */
    public final StatusByAccount STATUS_BY_ACCOUNT = com.cf.performance_schema.tables.StatusByAccount.STATUS_BY_ACCOUNT;

    /**
     * The table <code>performance_schema.status_by_host</code>.
     */
    public final StatusByHost STATUS_BY_HOST = com.cf.performance_schema.tables.StatusByHost.STATUS_BY_HOST;

    /**
     * The table <code>performance_schema.status_by_thread</code>.
     */
    public final StatusByThread STATUS_BY_THREAD = com.cf.performance_schema.tables.StatusByThread.STATUS_BY_THREAD;

    /**
     * The table <code>performance_schema.status_by_user</code>.
     */
    public final StatusByUser STATUS_BY_USER = com.cf.performance_schema.tables.StatusByUser.STATUS_BY_USER;

    /**
     * The table <code>performance_schema.table_handles</code>.
     */
    public final TableHandles TABLE_HANDLES = com.cf.performance_schema.tables.TableHandles.TABLE_HANDLES;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_index_usage</code>.
     */
    public final TableIoWaitsSummaryByIndexUsage TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE = com.cf.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_table</code>.
     */
    public final TableIoWaitsSummaryByTable TABLE_IO_WAITS_SUMMARY_BY_TABLE = com.cf.performance_schema.tables.TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.table_lock_waits_summary_by_table</code>.
     */
    public final TableLockWaitsSummaryByTable TABLE_LOCK_WAITS_SUMMARY_BY_TABLE = com.cf.performance_schema.tables.TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.threads</code>.
     */
    public final Threads THREADS = com.cf.performance_schema.tables.Threads.THREADS;

    /**
     * The table <code>performance_schema.users</code>.
     */
    public final Users USERS = com.cf.performance_schema.tables.Users.USERS;

    /**
     * The table <code>performance_schema.user_variables_by_thread</code>.
     */
    public final UserVariablesByThread USER_VARIABLES_BY_THREAD = com.cf.performance_schema.tables.UserVariablesByThread.USER_VARIABLES_BY_THREAD;

    /**
     * The table <code>performance_schema.variables_by_thread</code>.
     */
    public final VariablesByThread VARIABLES_BY_THREAD = com.cf.performance_schema.tables.VariablesByThread.VARIABLES_BY_THREAD;

    /**
     * No further instances allowed
     */
    private PerformanceSchema() {
        super("performance_schema", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Accounts.ACCOUNTS,
            CondInstances.COND_INSTANCES,
            EventsStagesCurrent.EVENTS_STAGES_CURRENT,
            EventsStagesHistory.EVENTS_STAGES_HISTORY,
            EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG,
            EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME,
            EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME,
            EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME,
            EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT,
            EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY,
            EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG,
            EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST,
            EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME,
            EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM,
            EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME,
            EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME,
            EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT,
            EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY,
            EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG,
            EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME,
            EventsTransactionsSummaryByThreadByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME,
            EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME,
            EventsWaitsCurrent.EVENTS_WAITS_CURRENT,
            EventsWaitsHistory.EVENTS_WAITS_HISTORY,
            EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG,
            EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME,
            EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE,
            EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME,
            EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME,
            FileInstances.FILE_INSTANCES,
            FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME,
            FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE,
            GlobalStatus.GLOBAL_STATUS,
            GlobalVariables.GLOBAL_VARIABLES,
            Hosts.HOSTS,
            HostCache.HOST_CACHE,
            MemorySummaryByAccountByEventName.MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME,
            MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME,
            MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME,
            MetadataLocks.METADATA_LOCKS,
            MutexInstances.MUTEX_INSTANCES,
            ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE,
            PerformanceTimers.PERFORMANCE_TIMERS,
            PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES,
            ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION,
            ReplicationApplierStatus.REPLICATION_APPLIER_STATUS,
            ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR,
            ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER,
            ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION,
            ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS,
            ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS,
            ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS,
            RwlockInstances.RWLOCK_INSTANCES,
            SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS,
            SessionConnectAttrs.SESSION_CONNECT_ATTRS,
            SessionStatus.SESSION_STATUS,
            SessionVariables.SESSION_VARIABLES,
            SetupActors.SETUP_ACTORS,
            SetupConsumers.SETUP_CONSUMERS,
            SetupInstruments.SETUP_INSTRUMENTS,
            SetupObjects.SETUP_OBJECTS,
            SetupTimers.SETUP_TIMERS,
            SocketInstances.SOCKET_INSTANCES,
            SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME,
            SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE,
            StatusByAccount.STATUS_BY_ACCOUNT,
            StatusByHost.STATUS_BY_HOST,
            StatusByThread.STATUS_BY_THREAD,
            StatusByUser.STATUS_BY_USER,
            TableHandles.TABLE_HANDLES,
            TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE,
            TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE,
            TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE,
            Threads.THREADS,
            Users.USERS,
            UserVariablesByThread.USER_VARIABLES_BY_THREAD,
            VariablesByThread.VARIABLES_BY_THREAD);
    }
}
