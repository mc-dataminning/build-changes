import java.util.List;

public class tb {
   public static final enq a = enj.a(edp.a.e);
   public static final enq b = enj.a(edp.a.c);
   public static final enq c = enj.a(edp.a.a);
   public static final enq d = enj.a(edp.a.d);
   public static final enq e = eni.a(eej.a(), eej.b());
   public static final enq f = eni.a(eej.b(10), eej.c(10));
   public static final enq g = eni.a(eej.b(8), eej.c(8));
   public static final enq h = eni.a(eej.b(4), eej.c(4));
   public static final enq i = eni.a(eej.a(), eej.a(256));

   public static void a(rk<enn> $$0) {
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

   public static aly<enn> a(String $$0) {
      return aly.a(mb.aT, alz.b($$0));
   }

   public static void a(rk<enn> $$0, aly<enn> $$1, jq<egh<?, ?>> $$2, List<enq> $$3) {
      $$0.a($$1, new enn($$2, List.copyOf($$3)));
   }

   public static void a(rk<enn> $$0, aly<enn> $$1, jq<egh<?, ?>> $$2, enq... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static enq a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         brq<bsn> $$4 = brq.<bsn>a().a(bsk.a($$0), (int)$$3 - 1).a(bsk.a($$0 + $$2), 1).a();
         return enf.a(new bsu($$4));
      }
   }

   public static enp a() {
      return enc.a(eew.c);
   }

   public static enc a(dkl $$0) {
      return enc.a(eew.a($$0.m(), jh.c));
   }

   public static jq<enn> a(jq<egh<?, ?>> $$0, enq... $$1) {
      return jq.a(new enn($$0, List.of($$1)));
   }

   public static <FC extends eiz, F extends egv<FC>> jq<enn> a(F $$0, FC $$1, enq... $$2) {
      return a(jq.a(new egh($$0, $$1)), $$2);
   }

   public static <FC extends eiz, F extends egv<FC>> jq<enn> a(F $$0, FC $$1) {
      return a($$0, $$1, eew.c);
   }

   public static <FC extends eiz, F extends egv<FC>> jq<enn> a(F $$0, FC $$1, eew $$2) {
      return a($$0, $$1, enc.a($$2));
   }
}
