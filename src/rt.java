import java.util.List;

public class rt {
   public static final eex a = eeq.a(dva.a.e);
   public static final eex b = eeq.a(dva.a.c);
   public static final eex c = eeq.a(dva.a.a);
   public static final eex d = eeq.a(dva.a.d);
   public static final eex e = eep.a(dvu.a(), dvu.b());
   public static final eex f = eep.a(dvu.b(10), dvu.c(10));
   public static final eex g = eep.a(dvu.b(8), dvu.c(8));
   public static final eex h = eep.a(dvu.b(4), dvu.c(4));
   public static final eex i = eep.a(dvu.a(), dvu.a(256));

   public static void a(pz<eeu> $$0) {
      rn.a($$0);
      ro.a($$0);
      rp.a($$0);
      rq.a($$0);
      rr.a($$0);
      rs.a($$0);
      ru.a($$0);
      rv.a($$0);
      rw.a($$0);
   }

   public static aju<eeu> a(String $$0) {
      return aju.a(ku.aF, new ajv($$0));
   }

   public static void a(pz<eeu> $$0, aju<eeu> $$1, in<dxr<?, ?>> $$2, List<eex> $$3) {
      $$0.a($$1, new eeu($$2, List.copyOf($$3)));
   }

   public static void a(pz<eeu> $$0, aju<eeu> $$1, in<dxr<?, ?>> $$2, eex... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eex a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bmp<bnk> $$4 = bmp.<bnk>a().a(bnh.a($$0), (int)$$3 - 1).a(bnh.a($$0 + $$2), 1).a();
         return een.a(new bnr($$4));
      }
   }

   public static eew a() {
      return eej.a(dwh.c);
   }

   public static eej a(dch $$0) {
      return eej.a(dwh.a($$0.n(), id.c));
   }

   public static in<eeu> a(in<dxr<?, ?>> $$0, eex... $$1) {
      return in.a(new eeu($$0, List.of($$1)));
   }

   public static <FC extends eai, F extends dye<FC>> in<eeu> a(F $$0, FC $$1, eex... $$2) {
      return a(in.a(new dxr($$0, $$1)), $$2);
   }

   public static <FC extends eai, F extends dye<FC>> in<eeu> a(F $$0, FC $$1) {
      return a($$0, $$1, dwh.c);
   }

   public static <FC extends eai, F extends dye<FC>> in<eeu> a(F $$0, FC $$1, dwh $$2) {
      return a($$0, $$1, eej.a($$2));
   }
}
