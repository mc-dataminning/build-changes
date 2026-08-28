import java.util.List;

public class sj {
   public static final ekj a = ekc.a(eak.a.e);
   public static final ekj b = ekc.a(eak.a.c);
   public static final ekj c = ekc.a(eak.a.a);
   public static final ekj d = ekc.a(eak.a.d);
   public static final ekj e = ekb.a(ebe.a(), ebe.b());
   public static final ekj f = ekb.a(ebe.b(10), ebe.c(10));
   public static final ekj g = ekb.a(ebe.b(8), ebe.c(8));
   public static final ekj h = ekb.a(ebe.b(4), ebe.c(4));
   public static final ekj i = ekb.a(ebe.a(), ebe.a(256));

   public static void a(qt<ekg> $$0) {
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

   public static alb<ekg> a(String $$0) {
      return alb.a(lv.aR, alc.b($$0));
   }

   public static void a(qt<ekg> $$0, alb<ekg> $$1, jn<edc<?, ?>> $$2, List<ekj> $$3) {
      $$0.a($$1, new ekg($$2, List.copyOf($$3)));
   }

   public static void a(qt<ekg> $$0, alb<ekg> $$1, jn<edc<?, ?>> $$2, ekj... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ekj a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpz<bqu> $$4 = bpz.<bqu>a().a(bqr.a($$0), (int)$$3 - 1).a(bqr.a($$0 + $$2), 1).a();
         return ejy.a(new brb($$4));
      }
   }

   public static eki a() {
      return ejv.a(ebr.c);
   }

   public static ejv a(dhj $$0) {
      return ejv.a(ebr.a($$0.o(), je.c));
   }

   public static jn<ekg> a(jn<edc<?, ?>> $$0, ekj... $$1) {
      return jn.a(new ekg($$0, List.of($$1)));
   }

   public static <FC extends efu, F extends edq<FC>> jn<ekg> a(F $$0, FC $$1, ekj... $$2) {
      return a(jn.a(new edc($$0, $$1)), $$2);
   }

   public static <FC extends efu, F extends edq<FC>> jn<ekg> a(F $$0, FC $$1) {
      return a($$0, $$1, ebr.c);
   }

   public static <FC extends efu, F extends edq<FC>> jn<ekg> a(F $$0, FC $$1, ebr $$2) {
      return a($$0, $$1, ejv.a($$2));
   }
}
