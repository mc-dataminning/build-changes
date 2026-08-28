import java.util.List;

public class sj {
   public static final ejv a = ejo.a(dzw.a.e);
   public static final ejv b = ejo.a(dzw.a.c);
   public static final ejv c = ejo.a(dzw.a.a);
   public static final ejv d = ejo.a(dzw.a.d);
   public static final ejv e = ejn.a(eaq.a(), eaq.b());
   public static final ejv f = ejn.a(eaq.b(10), eaq.c(10));
   public static final ejv g = ejn.a(eaq.b(8), eaq.c(8));
   public static final ejv h = ejn.a(eaq.b(4), eaq.c(4));
   public static final ejv i = ejn.a(eaq.a(), eaq.a(256));

   public static void a(qt<ejs> $$0) {
      sd.a($$0);
      se.a($$0);
      sf.a($$0);
      sg.a($$0);
      sh.a($$0);
      si.a($$0);
      sk.a($$0);
      sl.a($$0);
      sm.a($$0);
   }

   public static ala<ejs> a(String $$0) {
      return ala.a(lv.aQ, alb.b($$0));
   }

   public static void a(qt<ejs> $$0, ala<ejs> $$1, jn<eco<?, ?>> $$2, List<ejv> $$3) {
      $$0.a($$1, new ejs($$2, List.copyOf($$3)));
   }

   public static void a(qt<ejs> $$0, ala<ejs> $$1, jn<eco<?, ?>> $$2, ejv... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ejv a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpu<bqp> $$4 = bpu.<bqp>a().a(bqm.a($$0), (int)$$3 - 1).a(bqm.a($$0 + $$2), 1).a();
         return ejk.a(new bqw($$4));
      }
   }

   public static eju a() {
      return ejh.a(ebd.c);
   }

   public static ejh a(dgv $$0) {
      return ejh.a(ebd.a($$0.o(), je.c));
   }

   public static jn<ejs> a(jn<eco<?, ?>> $$0, ejv... $$1) {
      return jn.a(new ejs($$0, List.of($$1)));
   }

   public static <FC extends efg, F extends edc<FC>> jn<ejs> a(F $$0, FC $$1, ejv... $$2) {
      return a(jn.a(new eco($$0, $$1)), $$2);
   }

   public static <FC extends efg, F extends edc<FC>> jn<ejs> a(F $$0, FC $$1) {
      return a($$0, $$1, ebd.c);
   }

   public static <FC extends efg, F extends edc<FC>> jn<ejs> a(F $$0, FC $$1, ebd $$2) {
      return a($$0, $$1, ejh.a($$2));
   }
}
