import java.util.List;

public class sc {
   public static final ehx a = ehq.a(dxz.a.e);
   public static final ehx b = ehq.a(dxz.a.c);
   public static final ehx c = ehq.a(dxz.a.a);
   public static final ehx d = ehq.a(dxz.a.d);
   public static final ehx e = ehp.a(dyt.a(), dyt.b());
   public static final ehx f = ehp.a(dyt.b(10), dyt.c(10));
   public static final ehx g = ehp.a(dyt.b(8), dyt.c(8));
   public static final ehx h = ehp.a(dyt.b(4), dyt.c(4));
   public static final ehx i = ehp.a(dyt.a(), dyt.a(256));

   public static void a(qm<ehu> $$0) {
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

   public static akj<ehu> a(String $$0) {
      return akj.a(lr.aP, new akk($$0));
   }

   public static void a(qm<ehu> $$0, akj<ehu> $$1, jj<ear<?, ?>> $$2, List<ehx> $$3) {
      $$0.a($$1, new ehu($$2, List.copyOf($$3)));
   }

   public static void a(qm<ehu> $$0, akj<ehu> $$1, jj<ear<?, ?>> $$2, ehx... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ehx a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bon<bpi> $$4 = bon.<bpi>a().a(bpf.a($$0), (int)$$3 - 1).a(bpf.a($$0 + $$2), 1).a();
         return ehn.a(new bpp($$4));
      }
   }

   public static ehw a() {
      return ehj.a(dzg.c);
   }

   public static ehj a(dff $$0) {
      return ehj.a(dzg.a($$0.o(), ja.c));
   }

   public static jj<ehu> a(jj<ear<?, ?>> $$0, ehx... $$1) {
      return jj.a(new ehu($$0, List.of($$1)));
   }

   public static <FC extends edi, F extends ebe<FC>> jj<ehu> a(F $$0, FC $$1, ehx... $$2) {
      return a(jj.a(new ear($$0, $$1)), $$2);
   }

   public static <FC extends edi, F extends ebe<FC>> jj<ehu> a(F $$0, FC $$1) {
      return a($$0, $$1, dzg.c);
   }

   public static <FC extends edi, F extends ebe<FC>> jj<ehu> a(F $$0, FC $$1, dzg $$2) {
      return a($$0, $$1, ehj.a($$2));
   }
}
