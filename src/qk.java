import java.util.List;

public class qk {
   public static final dwo a = dwh.a(dmr.a.e);
   public static final dwo b = dwh.a(dmr.a.c);
   public static final dwo c = dwh.a(dmr.a.a);
   public static final dwo d = dwh.a(dmr.a.d);
   public static final dwo e = dwg.a(dnl.a(), dnl.b());
   public static final dwo f = dwg.a(dnl.b(10), dnl.c(10));
   public static final dwo g = dwg.a(dnl.b(8), dnl.c(8));
   public static final dwo h = dwg.a(dnl.b(4), dnl.c(4));
   public static final dwo i = dwg.a(dnl.a(), dnl.a(256));

   public static void a(ov<dwl> $$0) {
      qe.a($$0);
      qf.a($$0);
      qg.a($$0);
      qh.a($$0);
      qi.a($$0);
      qj.a($$0);
      ql.a($$0);
      qm.a($$0);
      qn.a($$0);
   }

   public static agh<dwl> a(String $$0) {
      return agh.a(jz.aA, new agi($$0));
   }

   public static void a(ov<dwl> $$0, agh<dwl> $$1, ib<dpi<?, ?>> $$2, List<dwo> $$3) {
      $$0.a($$1, new dwl($$2, List.copyOf($$3)));
   }

   public static void a(ov<dwl> $$0, agh<dwl> $$1, ib<dpi<?, ?>> $$2, dwo... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dwo a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bhh<bic> $$4 = bhh.<bic>a().a(bhz.a($$0), (int)$$3 - 1).a(bhz.a($$0 + $$2), 1).a();
         return dwe.a(new bij($$4));
      }
   }

   public static dwn a() {
      return dwa.a(dny.c);
   }

   public static dwa a(cva $$0) {
      return dwa.a(dny.a($$0.o(), ht.b));
   }

   public static ib<dwl> a(ib<dpi<?, ?>> $$0, dwo... $$1) {
      return ib.a(new dwl($$0, List.of($$1)));
   }

   public static <FC extends drz, F extends dpv<FC>> ib<dwl> a(F $$0, FC $$1, dwo... $$2) {
      return a(ib.a(new dpi($$0, $$1)), $$2);
   }

   public static <FC extends drz, F extends dpv<FC>> ib<dwl> a(F $$0, FC $$1) {
      return a($$0, $$1, dny.c);
   }

   public static <FC extends drz, F extends dpv<FC>> ib<dwl> a(F $$0, FC $$1, dny $$2) {
      return a($$0, $$1, dwa.a($$2));
   }
}
