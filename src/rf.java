import java.util.List;

public class rf {
   public static final ecl a = ece.a(dso.a.e);
   public static final ecl b = ece.a(dso.a.c);
   public static final ecl c = ece.a(dso.a.a);
   public static final ecl d = ece.a(dso.a.d);
   public static final ecl e = ecd.a(dti.a(), dti.b());
   public static final ecl f = ecd.a(dti.b(10), dti.c(10));
   public static final ecl g = ecd.a(dti.b(8), dti.c(8));
   public static final ecl h = ecd.a(dti.b(4), dti.c(4));
   public static final ecl i = ecd.a(dti.a(), dti.a(256));

   public static void a(pl<eci> $$0) {
      qz.a($$0);
      ra.a($$0);
      rb.a($$0);
      rc.a($$0);
      rd.a($$0);
      re.a($$0);
      rg.a($$0);
      rh.a($$0);
      ri.a($$0);
   }

   public static ajg<eci> a(String $$0) {
      return ajg.a(kj.aD, new ajh($$0));
   }

   public static void a(pl<eci> $$0, ajg<eci> $$1, il<dvf<?, ?>> $$2, List<ecl> $$3) {
      $$0.a($$1, new eci($$2, List.copyOf($$3)));
   }

   public static void a(pl<eci> $$0, ajg<eci> $$1, il<dvf<?, ?>> $$2, ecl... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ecl a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bln<bmi> $$4 = bln.<bmi>a().a(bmf.a($$0), (int)$$3 - 1).a(bmf.a($$0 + $$2), 1).a();
         return ecb.a(new bmp($$4));
      }
   }

   public static eck a() {
      return ebx.a(dtv.c);
   }

   public static ebx a(dac $$0) {
      return ebx.a(dtv.a($$0.o(), ib.c));
   }

   public static il<eci> a(il<dvf<?, ?>> $$0, ecl... $$1) {
      return il.a(new eci($$0, List.of($$1)));
   }

   public static <FC extends dxw, F extends dvs<FC>> il<eci> a(F $$0, FC $$1, ecl... $$2) {
      return a(il.a(new dvf($$0, $$1)), $$2);
   }

   public static <FC extends dxw, F extends dvs<FC>> il<eci> a(F $$0, FC $$1) {
      return a($$0, $$1, dtv.c);
   }

   public static <FC extends dxw, F extends dvs<FC>> il<eci> a(F $$0, FC $$1, dtv $$2) {
      return a($$0, $$1, ebx.a($$2));
   }
}
