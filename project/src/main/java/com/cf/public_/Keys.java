/**
 * This class is generated by jOOQ
 */
package com.cf.public_;


import com.cf.public_.tables.Filings;
import com.cf.public_.tables.Qs;
import com.cf.public_.tables.Tax;
import com.cf.public_.tables.Uni;
import com.cf.public_.tables.records.FilingsRecord;
import com.cf.public_.tables.records.QsRecord;
import com.cf.public_.tables.records.TaxRecord;
import com.cf.public_.tables.records.UniRecord;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code>
 * schema
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TaxRecord, Integer> IDENTITY_TAX = Identities0.IDENTITY_TAX;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FilingsRecord> FILINGS_PKEY = UniqueKeys0.FILINGS_PKEY;
    public static final UniqueKey<TaxRecord> TAX_APP_ID_STATE_FROM_YEAR_TO_YEAR_TAX_TYPE_KEY = UniqueKeys0.TAX_APP_ID_STATE_FROM_YEAR_TO_YEAR_TAX_TYPE_KEY;
    public static final UniqueKey<TaxRecord> TAX_PKEY = UniqueKeys0.TAX_PKEY;
    public static final UniqueKey<UniRecord> UNI_PKEY = UniqueKeys0.UNI_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<FilingsRecord, TaxRecord> FILINGS__FILINGS_ID_FKEY = ForeignKeys0.FILINGS__FILINGS_ID_FKEY;
    public static final ForeignKey<QsRecord, UniRecord> QS__QS_ID_FKEY = ForeignKeys0.QS__QS_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<TaxRecord, Integer> IDENTITY_TAX = createIdentity(Tax.TAX, Tax.TAX.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<FilingsRecord> FILINGS_PKEY = createUniqueKey(Filings.FILINGS, "filings_pkey", Filings.FILINGS.ID);
        public static final UniqueKey<TaxRecord> TAX_APP_ID_STATE_FROM_YEAR_TO_YEAR_TAX_TYPE_KEY = createUniqueKey(Tax.TAX, "tax_app_id_state_from_year_to_year_tax_type_key", Tax.TAX.APP_ID, Tax.TAX.STATE, Tax.TAX.FROM_YEAR, Tax.TAX.TO_YEAR, Tax.TAX.TAX_TYPE);
        public static final UniqueKey<TaxRecord> TAX_PKEY = createUniqueKey(Tax.TAX, "tax_pkey", Tax.TAX.ID);
        public static final UniqueKey<UniRecord> UNI_PKEY = createUniqueKey(Uni.UNI, "uni_pkey", Uni.UNI.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<FilingsRecord, TaxRecord> FILINGS__FILINGS_ID_FKEY = createForeignKey(com.cf.public_.Keys.TAX_PKEY, Filings.FILINGS, "filings__filings_id_fkey", Filings.FILINGS.ID);
        public static final ForeignKey<QsRecord, UniRecord> QS__QS_ID_FKEY = createForeignKey(com.cf.public_.Keys.UNI_PKEY, Qs.QS, "qs__qs_id_fkey", Qs.QS.ID);
    }
}
