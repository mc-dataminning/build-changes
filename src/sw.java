import java.util.List;

public class sw {
   public static final ehm a = ehf.a(dxp.a.e);
   public static final ehm b = ehf.a(dxp.a.c);
   public static final ehm c = ehf.a(dxp.a.a);
   public static final ehm d = ehf.a(dxp.a.d);
   public static final ehm e = ehe.a(dyj.a(), dyj.b());
   public static final ehm f = ehe.a(dyj.b(10), dyj.c(10));
   public static final ehm g = ehe.a(dyj.b(8), dyj.c(8));
   public static final ehm h = ehe.a(dyj.b(4), dyj.c(4));
   public static final ehm i = ehe.a(dyj.a(), dyj.a(256));

   public static void a(rc<ehj> $$0) {
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

   public static ala<ehj> a(String $$0) {
      return ala.a(lq.aI, new alb($$0));
   }

   public static void a(rc<ehj> $$0, ala<ehj> $$1, ji<eag<?, ?>> $$2, List<ehm> $$3) {
      $$0.a($$1, new ehj($$2, List.copyOf($$3)));
   }

   public static void a(rc<ehj> $$0, ala<ehj> $$1, ji<eag<?, ?>> $$2, ehm... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ehm a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         boz<bpu> $$4 = boz.<bpu>a().a(bpr.a($$0), (int)$$3 - 1).a(bpr.a($$0 + $$2), 1).a();
         return ehc.a(new bqb($$4));
      }
   }

   public static ehl a() {
      return egy.a(dyw.c);
   }

   public static egy a(deu $$0) {
      return egy.a(dyw.a($$0.n(), iz.c));
   }

   public static ji<ehj> a(ji<eag<?, ?>> $$0, ehm... $$1) {
      return ji.a(new ehj($$0, List.of($$1)));
   }

   public static <FC extends ecx, F extends eat<FC>> ji<ehj> a(F $$0, FC $$1, ehm... $$2) {
      return a(ji.a(new eag($$0, $$1)), $$2);
   }

   public static <FC extends ecx, F extends eat<FC>> ji<ehj> a(F $$0, FC $$1) {
      return a($$0, $$1, dyw.c);
   }

   public static <FC extends ecx, F extends eat<FC>> ji<ehj> a(F $$0, FC $$1, dyw $$2) {
      return a($$0, $$1, egy.a($$2));
   }
}
