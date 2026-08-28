import java.util.List;

public class sk {
   public static final ekn a = ekg.a(eao.a.e);
   public static final ekn b = ekg.a(eao.a.c);
   public static final ekn c = ekg.a(eao.a.a);
   public static final ekn d = ekg.a(eao.a.d);
   public static final ekn e = ekf.a(ebi.a(), ebi.b());
   public static final ekn f = ekf.a(ebi.b(10), ebi.c(10));
   public static final ekn g = ekf.a(ebi.b(8), ebi.c(8));
   public static final ekn h = ekf.a(ebi.b(4), ebi.c(4));
   public static final ekn i = ekf.a(ebi.a(), ebi.a(256));

   public static void a(qu<ekk> $$0) {
      se.a($$0);
      sf.a($$0);
      sg.a($$0);
      sh.a($$0);
      si.a($$0);
      sj.a($$0);
      sl.a($$0);
      sm.a($$0);
      sn.a($$0);
   }

   public static ald<ekk> a(String $$0) {
      return ald.a(lw.aS, ale.b($$0));
   }

   public static void a(qu<ekk> $$0, ald<ekk> $$1, jo<edg<?, ?>> $$2, List<ekn> $$3) {
      $$0.a($$1, new ekk($$2, List.copyOf($$3)));
   }

   public static void a(qu<ekk> $$0, ald<ekk> $$1, jo<edg<?, ?>> $$2, ekn... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ekn a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqc<bqx> $$4 = bqc.<bqx>a().a(bqu.a($$0), (int)$$3 - 1).a(bqu.a($$0 + $$2), 1).a();
         return ekc.a(new bre($$4));
      }
   }

   public static ekm a() {
      return ejz.a(ebv.c);
   }

   public static ejz a(dhm $$0) {
      return ejz.a(ebv.a($$0.n(), jf.c));
   }

   public static jo<ekk> a(jo<edg<?, ?>> $$0, ekn... $$1) {
      return jo.a(new ekk($$0, List.of($$1)));
   }

   public static <FC extends efy, F extends edu<FC>> jo<ekk> a(F $$0, FC $$1, ekn... $$2) {
      return a(jo.a(new edg($$0, $$1)), $$2);
   }

   public static <FC extends efy, F extends edu<FC>> jo<ekk> a(F $$0, FC $$1) {
      return a($$0, $$1, ebv.c);
   }

   public static <FC extends efy, F extends edu<FC>> jo<ekk> a(F $$0, FC $$1, ebv $$2) {
      return a($$0, $$1, ejz.a($$2));
   }
}
