import java.util.List;

public class qd {
   public static final dvh a = dva.a(dlk.a.e);
   public static final dvh b = dva.a(dlk.a.c);
   public static final dvh c = dva.a(dlk.a.a);
   public static final dvh d = dva.a(dlk.a.d);
   public static final dvh e = duz.a(dme.a(), dme.b());
   public static final dvh f = duz.a(dme.b(10), dme.c(10));
   public static final dvh g = duz.a(dme.b(8), dme.c(8));
   public static final dvh h = duz.a(dme.b(4), dme.c(4));
   public static final dvh i = duz.a(dme.a(), dme.a(256));

   public static void a(oo<dve> $$0) {
      px.a($$0);
      py.a($$0);
      pz.a($$0);
      qa.a($$0);
      qb.a($$0);
      qc.a($$0);
      qe.a($$0);
      qf.a($$0);
      qg.a($$0);
   }

   public static afv<dve> a(String $$0) {
      return afv.a(jz.az, new afw($$0));
   }

   public static void a(oo<dve> $$0, afv<dve> $$1, ib<dob<?, ?>> $$2, List<dvh> $$3) {
      $$0.a($$1, new dve($$2, List.copyOf($$3)));
   }

   public static void a(oo<dve> $$0, afv<dve> $$1, ib<dob<?, ?>> $$2, dvh... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dvh a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bgl<bhg> $$4 = bgl.<bhg>a().a(bhd.a($$0), (int)$$3 - 1).a(bhd.a($$0 + $$2), 1).a();
         return dux.a(new bhn($$4));
      }
   }

   public static dvg a() {
      return dut.a(dmr.c);
   }

   public static dut a(cua $$0) {
      return dut.a(dmr.a($$0.o(), ht.b));
   }

   public static ib<dve> a(ib<dob<?, ?>> $$0, dvh... $$1) {
      return ib.a(new dve($$0, List.of($$1)));
   }

   public static <FC extends dqs, F extends doo<FC>> ib<dve> a(F $$0, FC $$1, dvh... $$2) {
      return a(ib.a(new dob($$0, $$1)), $$2);
   }

   public static <FC extends dqs, F extends doo<FC>> ib<dve> a(F $$0, FC $$1) {
      return a($$0, $$1, dmr.c);
   }

   public static <FC extends dqs, F extends doo<FC>> ib<dve> a(F $$0, FC $$1, dmr $$2) {
      return a($$0, $$1, dut.a($$2));
   }
}
