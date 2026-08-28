import java.util.List;

public class sx {
   public static final eht a = ehm.a(dxw.a.e);
   public static final eht b = ehm.a(dxw.a.c);
   public static final eht c = ehm.a(dxw.a.a);
   public static final eht d = ehm.a(dxw.a.d);
   public static final eht e = ehl.a(dyq.a(), dyq.b());
   public static final eht f = ehl.a(dyq.b(10), dyq.c(10));
   public static final eht g = ehl.a(dyq.b(8), dyq.c(8));
   public static final eht h = ehl.a(dyq.b(4), dyq.c(4));
   public static final eht i = ehl.a(dyq.a(), dyq.a(256));

   public static void a(rc<ehq> $$0) {
      sr.a($$0);
      ss.a($$0);
      st.a($$0);
      su.a($$0);
      sv.a($$0);
      sw.a($$0);
      sy.a($$0);
      sz.a($$0);
      ta.a($$0);
   }

   public static ale<ehq> a(String $$0) {
      return ale.a(lq.aI, new alf($$0));
   }

   public static void a(rc<ehq> $$0, ale<ehq> $$1, ji<ean<?, ?>> $$2, List<eht> $$3) {
      $$0.a($$1, new ehq($$2, List.copyOf($$3)));
   }

   public static void a(rc<ehq> $$0, ale<ehq> $$1, ji<ean<?, ?>> $$2, eht... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eht a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpg<bqb> $$4 = bpg.<bqb>a().a(bpy.a($$0), (int)$$3 - 1).a(bpy.a($$0 + $$2), 1).a();
         return ehj.a(new bqi($$4));
      }
   }

   public static ehs a() {
      return ehf.a(dzd.c);
   }

   public static ehf a(dfb $$0) {
      return ehf.a(dzd.a($$0.o(), iz.c));
   }

   public static ji<ehq> a(ji<ean<?, ?>> $$0, eht... $$1) {
      return ji.a(new ehq($$0, List.of($$1)));
   }

   public static <FC extends ede, F extends eba<FC>> ji<ehq> a(F $$0, FC $$1, eht... $$2) {
      return a(ji.a(new ean($$0, $$1)), $$2);
   }

   public static <FC extends ede, F extends eba<FC>> ji<ehq> a(F $$0, FC $$1) {
      return a($$0, $$1, dzd.c);
   }

   public static <FC extends ede, F extends eba<FC>> ji<ehq> a(F $$0, FC $$1, dzd $$2) {
      return a($$0, $$1, ehf.a($$2));
   }
}
