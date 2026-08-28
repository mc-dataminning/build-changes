import java.util.List;

public class rx {
   public static final equ a = eqn.a(egs.a.e);
   public static final equ b = eqn.a(egs.a.f);
   public static final equ c = eqn.a(egs.a.c);
   public static final equ d = eqn.a(egs.a.a);
   public static final equ e = eqn.a(egs.a.d);
   public static final equ f = eqm.a(ehm.a(), ehm.b());
   public static final equ g = eqm.a(ehm.b(10), ehm.c(10));
   public static final equ h = eqm.a(ehm.b(8), ehm.c(8));
   public static final equ i = eqm.a(ehm.b(4), ehm.c(4));
   public static final equ j = eqm.a(ehm.a(), ehm.a(256));

   public static void a(qh<eqr> $$0) {
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

   public static alf<eqr> a(String $$0) {
      return alf.a(mh.bb, alg.b($$0));
   }

   public static void a(qh<eqr> $$0, alf<eqr> $$1, jf<ejk<?, ?>> $$2, List<equ> $$3) {
      $$0.a($$1, new eqr($$2, List.copyOf($$3)));
   }

   public static void a(qh<eqr> $$0, alf<eqr> $$1, jf<ejk<?, ?>> $$2, equ... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static equ a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bsq<btl> $$4 = bsq.<btl>b().a(bti.a($$0), (int)$$3 - 1).a(bti.a($$0 + $$2), 1).a();
         return eqj.a(new bts($$4));
      }
   }

   public static eqt a() {
      return eqg.a(ehz.c);
   }

   public static eqg a(dmr $$0) {
      return eqg.a(ehz.a($$0.m(), iv.c));
   }

   public static jf<eqr> a(jf<ejk<?, ?>> $$0, equ... $$1) {
      return jf.a(new eqr($$0, List.of($$1)));
   }

   public static <FC extends emc, F extends ejy<FC>> jf<eqr> a(F $$0, FC $$1, equ... $$2) {
      return a(jf.a(new ejk($$0, $$1)), $$2);
   }

   public static <FC extends emc, F extends ejy<FC>> jf<eqr> a(F $$0, FC $$1) {
      return a($$0, $$1, ehz.c);
   }

   public static <FC extends emc, F extends ejy<FC>> jf<eqr> a(F $$0, FC $$1, ehz $$2) {
      return a($$0, $$1, eqg.a($$2));
   }
}
