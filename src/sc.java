import java.util.List;

public class sc {
   public static final eid a = ehw.a(dyf.a.e);
   public static final eid b = ehw.a(dyf.a.c);
   public static final eid c = ehw.a(dyf.a.a);
   public static final eid d = ehw.a(dyf.a.d);
   public static final eid e = ehv.a(dyz.a(), dyz.b());
   public static final eid f = ehv.a(dyz.b(10), dyz.c(10));
   public static final eid g = ehv.a(dyz.b(8), dyz.c(8));
   public static final eid h = ehv.a(dyz.b(4), dyz.c(4));
   public static final eid i = ehv.a(dyz.a(), dyz.a(256));

   public static void a(qm<eia> $$0) {
      rw.a($$0);
      rx.a($$0);
      ry.a($$0);
      rz.a($$0);
      sa.a($$0);
      sb.a($$0);
      sd.a($$0);
      se.a($$0);
      sf.a($$0);
   }

   public static akj<eia> a(String $$0) {
      return akj.a(lr.aP, new akk($$0));
   }

   public static void a(qm<eia> $$0, akj<eia> $$1, jj<eax<?, ?>> $$2, List<eid> $$3) {
      $$0.a($$1, new eia($$2, List.copyOf($$3)));
   }

   public static void a(qm<eia> $$0, akj<eia> $$1, jj<eax<?, ?>> $$2, eid... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eid a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         boq<bpl> $$4 = boq.<bpl>a().a(bpi.a($$0), (int)$$3 - 1).a(bpi.a($$0 + $$2), 1).a();
         return eht.a(new bps($$4));
      }
   }

   public static eic a() {
      return ehp.a(dzm.c);
   }

   public static ehp a(dfh $$0) {
      return ehp.a(dzm.a($$0.o(), ja.c));
   }

   public static jj<eia> a(jj<eax<?, ?>> $$0, eid... $$1) {
      return jj.a(new eia($$0, List.of($$1)));
   }

   public static <FC extends edo, F extends ebk<FC>> jj<eia> a(F $$0, FC $$1, eid... $$2) {
      return a(jj.a(new eax($$0, $$1)), $$2);
   }

   public static <FC extends edo, F extends ebk<FC>> jj<eia> a(F $$0, FC $$1) {
      return a($$0, $$1, dzm.c);
   }

   public static <FC extends edo, F extends ebk<FC>> jj<eia> a(F $$0, FC $$1, dzm $$2) {
      return a($$0, $$1, ehp.a($$2));
   }
}
