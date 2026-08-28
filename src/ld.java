import java.util.List;

public class ld extends lb {
   public static final ld c = new ld();

   @Override
   protected cwq a(kz $$0, cwq $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(kz $$0, cwq $$1) {
      ji $$2 = $$0.c().a($$0.d().c(dlt.b));
      List<bvi> $$3 = $$0.b().a(bvi.class, new faw($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bvi $$4 = $$3.getFirst();
         buu $$5 = $$4.f($$1);
         cwq $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bvk $$7) {
            $$7.a($$5, 2.0F);
            $$7.fY();
         }

         return true;
      }
   }
}
