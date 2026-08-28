import java.util.List;

public class lj extends lh {
   public static final lj c = new lj();

   @Override
   protected dak a(lf $$0, dak $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(lf $$0, dak $$1) {
      iw $$2 = $$0.c().a($$0.d().c(dpu.b));
      List<byf> $$3 = $$0.b().a(byf.class, new ffx($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         byf $$4 = $$3.getFirst();
         bxo $$5 = $$4.f($$1);
         dak $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof byh $$7) {
            $$7.g($$5);
            $$7.gc();
         }

         return true;
      }
   }
}
