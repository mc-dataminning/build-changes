import java.util.List;

public class rf {
   public static final ecj a = ecc.a(dsm.a.e);
   public static final ecj b = ecc.a(dsm.a.c);
   public static final ecj c = ecc.a(dsm.a.a);
   public static final ecj d = ecc.a(dsm.a.d);
   public static final ecj e = ecb.a(dtg.a(), dtg.b());
   public static final ecj f = ecb.a(dtg.b(10), dtg.c(10));
   public static final ecj g = ecb.a(dtg.b(8), dtg.c(8));
   public static final ecj h = ecb.a(dtg.b(4), dtg.c(4));
   public static final ecj i = ecb.a(dtg.a(), dtg.a(256));

   public static void a(pl<ecg> $$0) {
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

   public static ajg<ecg> a(String $$0) {
      return ajg.a(kj.aD, new ajh($$0));
   }

   public static void a(pl<ecg> $$0, ajg<ecg> $$1, il<dvd<?, ?>> $$2, List<ecj> $$3) {
      $$0.a($$1, new ecg($$2, List.copyOf($$3)));
   }

   public static void a(pl<ecg> $$0, ajg<ecg> $$1, il<dvd<?, ?>> $$2, ecj... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ecj a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         blm<bmh> $$4 = blm.<bmh>a().a(bme.a($$0), (int)$$3 - 1).a(bme.a($$0 + $$2), 1).a();
         return ebz.a(new bmo($$4));
      }
   }

   public static eci a() {
      return ebv.a(dtt.c);
   }

   public static ebv a(daa $$0) {
      return ebv.a(dtt.a($$0.o(), ib.c));
   }

   public static il<ecg> a(il<dvd<?, ?>> $$0, ecj... $$1) {
      return il.a(new ecg($$0, List.of($$1)));
   }

   public static <FC extends dxu, F extends dvq<FC>> il<ecg> a(F $$0, FC $$1, ecj... $$2) {
      return a(il.a(new dvd($$0, $$1)), $$2);
   }

   public static <FC extends dxu, F extends dvq<FC>> il<ecg> a(F $$0, FC $$1) {
      return a($$0, $$1, dtt.c);
   }

   public static <FC extends dxu, F extends dvq<FC>> il<ecg> a(F $$0, FC $$1, dtt $$2) {
      return a($$0, $$1, ebv.a($$2));
   }
}
