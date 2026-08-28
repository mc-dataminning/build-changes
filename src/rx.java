import java.util.List;

public class rx {
   public static final eqp a = eqi.a(egn.a.e);
   public static final eqp b = eqi.a(egn.a.f);
   public static final eqp c = eqi.a(egn.a.c);
   public static final eqp d = eqi.a(egn.a.a);
   public static final eqp e = eqi.a(egn.a.d);
   public static final eqp f = eqh.a(ehh.a(), ehh.b());
   public static final eqp g = eqh.a(ehh.b(10), ehh.c(10));
   public static final eqp h = eqh.a(ehh.b(8), ehh.c(8));
   public static final eqp i = eqh.a(ehh.b(4), ehh.c(4));
   public static final eqp j = eqh.a(ehh.a(), ehh.a(256));

   public static void a(qh<eqm> $$0) {
      rr.a($$0);
      rs.a($$0);
      rt.a($$0);
      ru.a($$0);
      rv.a($$0);
      rw.a($$0);
      ry.a($$0);
      rz.a($$0);
      sa.a($$0);
   }

   public static alf<eqm> a(String $$0) {
      return alf.a(mh.bb, alg.b($$0));
   }

   public static void a(qh<eqm> $$0, alf<eqm> $$1, jf<ejf<?, ?>> $$2, List<eqp> $$3) {
      $$0.a($$1, new eqm($$2, List.copyOf($$3)));
   }

   public static void a(qh<eqm> $$0, alf<eqm> $$1, jf<ejf<?, ?>> $$2, eqp... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eqp a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bsq<btl> $$4 = bsq.<btl>b().a(bti.a($$0), (int)$$3 - 1).a(bti.a($$0 + $$2), 1).a();
         return eqe.a(new bts($$4));
      }
   }

   public static eqo a() {
      return eqb.a(ehu.c);
   }

   public static eqb a(dmm $$0) {
      return eqb.a(ehu.a($$0.m(), iv.c));
   }

   public static jf<eqm> a(jf<ejf<?, ?>> $$0, eqp... $$1) {
      return jf.a(new eqm($$0, List.of($$1)));
   }

   public static <FC extends elx, F extends ejt<FC>> jf<eqm> a(F $$0, FC $$1, eqp... $$2) {
      return a(jf.a(new ejf($$0, $$1)), $$2);
   }

   public static <FC extends elx, F extends ejt<FC>> jf<eqm> a(F $$0, FC $$1) {
      return a($$0, $$1, ehu.c);
   }

   public static <FC extends elx, F extends ejt<FC>> jf<eqm> a(F $$0, FC $$1, ehu $$2) {
      return a($$0, $$1, eqb.a($$2));
   }
}
