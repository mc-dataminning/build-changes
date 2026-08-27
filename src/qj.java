import java.util.List;

public class qj {
   public static final dwc a = dvv.a(dmf.a.e);
   public static final dwc b = dvv.a(dmf.a.c);
   public static final dwc c = dvv.a(dmf.a.a);
   public static final dwc d = dvv.a(dmf.a.d);
   public static final dwc e = dvu.a(dmz.a(), dmz.b());
   public static final dwc f = dvu.a(dmz.b(10), dmz.c(10));
   public static final dwc g = dvu.a(dmz.b(8), dmz.c(8));
   public static final dwc h = dvu.a(dmz.b(4), dmz.c(4));
   public static final dwc i = dvu.a(dmz.a(), dmz.a(256));

   public static void a(ou<dvz> $$0) {
      qd.a($$0);
      qe.a($$0);
      qf.a($$0);
      qg.a($$0);
      qh.a($$0);
      qi.a($$0);
      qk.a($$0);
      ql.a($$0);
      qm.a($$0);
   }

   public static agf<dvz> a(String $$0) {
      return agf.a(jz.aA, new agg($$0));
   }

   public static void a(ou<dvz> $$0, agf<dvz> $$1, ib<dow<?, ?>> $$2, List<dwc> $$3) {
      $$0.a($$1, new dvz($$2, List.copyOf($$3)));
   }

   public static void a(ou<dvz> $$0, agf<dvz> $$1, ib<dow<?, ?>> $$2, dwc... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dwc a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bha<bhv> $$4 = bha.<bhv>a().a(bhs.a($$0), (int)$$3 - 1).a(bhs.a($$0 + $$2), 1).a();
         return dvs.a(new bic($$4));
      }
   }

   public static dwb a() {
      return dvo.a(dnm.c);
   }

   public static dvo a(cut $$0) {
      return dvo.a(dnm.a($$0.o(), ht.b));
   }

   public static ib<dvz> a(ib<dow<?, ?>> $$0, dwc... $$1) {
      return ib.a(new dvz($$0, List.of($$1)));
   }

   public static <FC extends drn, F extends dpj<FC>> ib<dvz> a(F $$0, FC $$1, dwc... $$2) {
      return a(ib.a(new dow($$0, $$1)), $$2);
   }

   public static <FC extends drn, F extends dpj<FC>> ib<dvz> a(F $$0, FC $$1) {
      return a($$0, $$1, dnm.c);
   }

   public static <FC extends drn, F extends dpj<FC>> ib<dvz> a(F $$0, FC $$1, dnm $$2) {
      return a($$0, $$1, dvo.a($$2));
   }
}
