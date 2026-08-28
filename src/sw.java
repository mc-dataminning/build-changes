import java.util.List;

public class sw {
   public static final ehp a = ehi.a(dxs.a.e);
   public static final ehp b = ehi.a(dxs.a.c);
   public static final ehp c = ehi.a(dxs.a.a);
   public static final ehp d = ehi.a(dxs.a.d);
   public static final ehp e = ehh.a(dym.a(), dym.b());
   public static final ehp f = ehh.a(dym.b(10), dym.c(10));
   public static final ehp g = ehh.a(dym.b(8), dym.c(8));
   public static final ehp h = ehh.a(dym.b(4), dym.c(4));
   public static final ehp i = ehh.a(dym.a(), dym.a(256));

   public static void a(rc<ehm> $$0) {
      sq.a($$0);
      sr.a($$0);
      ss.a($$0);
      st.a($$0);
      su.a($$0);
      sv.a($$0);
      sx.a($$0);
      sy.a($$0);
      sz.a($$0);
   }

   public static ald<ehm> a(String $$0) {
      return ald.a(lq.aI, new ale($$0));
   }

   public static void a(rc<ehm> $$0, ald<ehm> $$1, ji<eaj<?, ?>> $$2, List<ehp> $$3) {
      $$0.a($$1, new ehm($$2, List.copyOf($$3)));
   }

   public static void a(rc<ehm> $$0, ald<ehm> $$1, ji<eaj<?, ?>> $$2, ehp... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ehp a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpc<bpx> $$4 = bpc.<bpx>a().a(bpu.a($$0), (int)$$3 - 1).a(bpu.a($$0 + $$2), 1).a();
         return ehf.a(new bqe($$4));
      }
   }

   public static eho a() {
      return ehb.a(dyz.c);
   }

   public static ehb a(dex $$0) {
      return ehb.a(dyz.a($$0.o(), iz.c));
   }

   public static ji<ehm> a(ji<eaj<?, ?>> $$0, ehp... $$1) {
      return ji.a(new ehm($$0, List.of($$1)));
   }

   public static <FC extends eda, F extends eaw<FC>> ji<ehm> a(F $$0, FC $$1, ehp... $$2) {
      return a(ji.a(new eaj($$0, $$1)), $$2);
   }

   public static <FC extends eda, F extends eaw<FC>> ji<ehm> a(F $$0, FC $$1) {
      return a($$0, $$1, dyz.c);
   }

   public static <FC extends eda, F extends eaw<FC>> ji<ehm> a(F $$0, FC $$1, dyz $$2) {
      return a($$0, $$1, ehb.a($$2));
   }
}
