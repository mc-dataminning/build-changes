import java.util.List;

public class lj extends lh {
   public static final lj c = new lj();

   @Override
   protected daa a(lf $$0, daa $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(lf $$0, daa $$1) {
      iw $$2 = $$0.c().a($$0.d().c(dpk.b));
      List<bxw> $$3 = $$0.b().a(bxw.class, new ffn($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bxw $$4 = $$3.getFirst();
         bxf $$5 = $$4.f($$1);
         daa $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bxy $$7) {
            $$7.g($$5);
            $$7.gc();
         }

         return true;
      }
   }
}
