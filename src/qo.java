import java.util.List;

public class qo {
   public static final dwt a = dwm.a(dmw.a.e);
   public static final dwt b = dwm.a(dmw.a.c);
   public static final dwt c = dwm.a(dmw.a.a);
   public static final dwt d = dwm.a(dmw.a.d);
   public static final dwt e = dwl.a(dnq.a(), dnq.b());
   public static final dwt f = dwl.a(dnq.b(10), dnq.c(10));
   public static final dwt g = dwl.a(dnq.b(8), dnq.c(8));
   public static final dwt h = dwl.a(dnq.b(4), dnq.c(4));
   public static final dwt i = dwl.a(dnq.a(), dnq.a(256));

   public static void a(oz<dwq> $$0) {
      qi.a($$0);
      qj.a($$0);
      qk.a($$0);
      ql.a($$0);
      qm.a($$0);
      qn.a($$0);
      qp.a($$0);
      qq.a($$0);
      qr.a($$0);
   }

   public static agl<dwq> a(String $$0) {
      return agl.a(kd.aA, new agm($$0));
   }

   public static void a(oz<dwq> $$0, agl<dwq> $$1, ig<dpn<?, ?>> $$2, List<dwt> $$3) {
      $$0.a($$1, new dwq($$2, List.copyOf($$3)));
   }

   public static void a(oz<dwq> $$0, agl<dwq> $$1, ig<dpn<?, ?>> $$2, dwt... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dwt a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bhl<big> $$4 = bhl.<big>a().a(bid.a($$0), (int)$$3 - 1).a(bid.a($$0 + $$2), 1).a();
         return dwj.a(new bin($$4));
      }
   }

   public static dws a() {
      return dwf.a(dod.c);
   }

   public static dwf a(cvf $$0) {
      return dwf.a(dod.a($$0.o(), hx.b));
   }

   public static ig<dwq> a(ig<dpn<?, ?>> $$0, dwt... $$1) {
      return ig.a(new dwq($$0, List.of($$1)));
   }

   public static <FC extends dse, F extends dqa<FC>> ig<dwq> a(F $$0, FC $$1, dwt... $$2) {
      return a(ig.a(new dpn($$0, $$1)), $$2);
   }

   public static <FC extends dse, F extends dqa<FC>> ig<dwq> a(F $$0, FC $$1) {
      return a($$0, $$1, dod.c);
   }

   public static <FC extends dse, F extends dqa<FC>> ig<dwq> a(F $$0, FC $$1, dod $$2) {
      return a($$0, $$1, dwf.a($$2));
   }
}
