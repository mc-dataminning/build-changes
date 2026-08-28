import java.util.List;

public class sn {
   public static final eky a = ekr.a(eaz.a.e);
   public static final eky b = ekr.a(eaz.a.c);
   public static final eky c = ekr.a(eaz.a.a);
   public static final eky d = ekr.a(eaz.a.d);
   public static final eky e = ekq.a(ebt.a(), ebt.b());
   public static final eky f = ekq.a(ebt.b(10), ebt.c(10));
   public static final eky g = ekq.a(ebt.b(8), ebt.c(8));
   public static final eky h = ekq.a(ebt.b(4), ebt.c(4));
   public static final eky i = ekq.a(ebt.a(), ebt.a(256));

   public static void a(qx<ekv> $$0) {
      sh.a($$0);
      si.a($$0);
      sj.a($$0);
      sk.a($$0);
      sl.a($$0);
      sm.a($$0);
      so.a($$0);
      sp.a($$0);
      sq.a($$0);
   }

   public static alg<ekv> a(String $$0) {
      return alg.a(ly.aR, alh.b($$0));
   }

   public static void a(qx<ekv> $$0, alg<ekv> $$1, jp<edr<?, ?>> $$2, List<eky> $$3) {
      $$0.a($$1, new ekv($$2, List.copyOf($$3)));
   }

   public static void a(qx<ekv> $$0, alg<ekv> $$1, jp<edr<?, ?>> $$2, eky... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eky a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqg<brd> $$4 = bqg.<brd>a().a(bra.a($$0), (int)$$3 - 1).a(bra.a($$0 + $$2), 1).a();
         return ekn.a(new brk($$4));
      }
   }

   public static ekx a() {
      return ekk.a(ecg.c);
   }

   public static ekk a(dhy $$0) {
      return ekk.a(ecg.a($$0.m(), jg.c));
   }

   public static jp<ekv> a(jp<edr<?, ?>> $$0, eky... $$1) {
      return jp.a(new ekv($$0, List.of($$1)));
   }

   public static <FC extends egj, F extends eef<FC>> jp<ekv> a(F $$0, FC $$1, eky... $$2) {
      return a(jp.a(new edr($$0, $$1)), $$2);
   }

   public static <FC extends egj, F extends eef<FC>> jp<ekv> a(F $$0, FC $$1) {
      return a($$0, $$1, ecg.c);
   }

   public static <FC extends egj, F extends eef<FC>> jp<ekv> a(F $$0, FC $$1, ecg $$2) {
      return a($$0, $$1, ekk.a($$2));
   }
}
