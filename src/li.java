import java.util.List;

public class li extends lg {
   public static final li c = new li();

   @Override
   protected czy a(le $$0, czy $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(le $$0, czy $$1) {
      iv $$2 = $$0.c().a($$0.d().c(dpi.b));
      List<bxu> $$3 = $$0.b().a(bxu.class, new ffl($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bxu $$4 = $$3.getFirst();
         bxd $$5 = $$4.f($$1);
         czy $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bxw $$7) {
            $$7.g($$5);
            $$7.gc();
         }

         return true;
      }
   }
}
