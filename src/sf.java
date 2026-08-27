import java.util.List;

public class sf {
   public static final efw a = efp.a(dvz.a.e);
   public static final efw b = efp.a(dvz.a.c);
   public static final efw c = efp.a(dvz.a.a);
   public static final efw d = efp.a(dvz.a.d);
   public static final efw e = efo.a(dwt.a(), dwt.b());
   public static final efw f = efo.a(dwt.b(10), dwt.c(10));
   public static final efw g = efo.a(dwt.b(8), dwt.c(8));
   public static final efw h = efo.a(dwt.b(4), dwt.c(4));
   public static final efw i = efo.a(dwt.a(), dwt.a(256));

   public static void a(ql<eft> $$0) {
      rz.a($$0);
      sa.a($$0);
      sb.a($$0);
      sc.a($$0);
      sd.a($$0);
      se.a($$0);
      sg.a($$0);
      sh.a($$0);
      si.a($$0);
   }

   public static akg<eft> a(String $$0) {
      return akg.a(le.aI, new akh($$0));
   }

   public static void a(ql<eft> $$0, akg<eft> $$1, iw<dyq<?, ?>> $$2, List<efw> $$3) {
      $$0.a($$1, new eft($$2, List.copyOf($$3)));
   }

   public static void a(ql<eft> $$0, akg<eft> $$1, iw<dyq<?, ?>> $$2, efw... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static efw a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bnw<bor> $$4 = bnw.<bor>a().a(boo.a($$0), (int)$$3 - 1).a(boo.a($$0 + $$2), 1).a();
         return efm.a(new boy($$4));
      }
   }

   public static efv a() {
      return efi.a(dxg.c);
   }

   public static efi a(dde $$0) {
      return efi.a(dxg.a($$0.n(), in.c));
   }

   public static iw<eft> a(iw<dyq<?, ?>> $$0, efw... $$1) {
      return iw.a(new eft($$0, List.of($$1)));
   }

   public static <FC extends ebh, F extends dzd<FC>> iw<eft> a(F $$0, FC $$1, efw... $$2) {
      return a(iw.a(new dyq($$0, $$1)), $$2);
   }

   public static <FC extends ebh, F extends dzd<FC>> iw<eft> a(F $$0, FC $$1) {
      return a($$0, $$1, dxg.c);
   }

   public static <FC extends ebh, F extends dzd<FC>> iw<eft> a(F $$0, FC $$1, dxg $$2) {
      return a($$0, $$1, efi.a($$2));
   }
}
