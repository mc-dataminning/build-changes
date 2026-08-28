import java.util.List;

public class tb {
   public static final enj a = enc.a(edi.a.e);
   public static final enj b = enc.a(edi.a.c);
   public static final enj c = enc.a(edi.a.a);
   public static final enj d = enc.a(edi.a.d);
   public static final enj e = enb.a(eec.a(), eec.b());
   public static final enj f = enb.a(eec.b(10), eec.c(10));
   public static final enj g = enb.a(eec.b(8), eec.c(8));
   public static final enj h = enb.a(eec.b(4), eec.c(4));
   public static final enj i = enb.a(eec.a(), eec.a(256));

   public static void a(rk<eng> $$0) {
      sv.a($$0);
      sw.a($$0);
      sx.a($$0);
      sy.a($$0);
      sz.a($$0);
      ta.a($$0);
      tc.a($$0);
      td.a($$0);
      te.a($$0);
   }

   public static aly<eng> a(String $$0) {
      return aly.a(mb.aS, alz.b($$0));
   }

   public static void a(rk<eng> $$0, aly<eng> $$1, jq<ega<?, ?>> $$2, List<enj> $$3) {
      $$0.a($$1, new eng($$2, List.copyOf($$3)));
   }

   public static void a(rk<eng> $$0, aly<eng> $$1, jq<ega<?, ?>> $$2, enj... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static enj a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         brm<bsj> $$4 = brm.<bsj>a().a(bsg.a($$0), (int)$$3 - 1).a(bsg.a($$0 + $$2), 1).a();
         return emy.a(new bsq($$4));
      }
   }

   public static eni a() {
      return emv.a(eep.c);
   }

   public static emv a(dke $$0) {
      return emv.a(eep.a($$0.m(), jh.c));
   }

   public static jq<eng> a(jq<ega<?, ?>> $$0, enj... $$1) {
      return jq.a(new eng($$0, List.of($$1)));
   }

   public static <FC extends eis, F extends ego<FC>> jq<eng> a(F $$0, FC $$1, enj... $$2) {
      return a(jq.a(new ega($$0, $$1)), $$2);
   }

   public static <FC extends eis, F extends ego<FC>> jq<eng> a(F $$0, FC $$1) {
      return a($$0, $$1, eep.c);
   }

   public static <FC extends eis, F extends ego<FC>> jq<eng> a(F $$0, FC $$1, eep $$2) {
      return a($$0, $$1, emv.a($$2));
   }
}
