import java.util.List;

public class ld extends lb {
   public static final ld c = new ld();

   @Override
   protected cxh a(kz $$0, cxh $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(kz $$0, cxh $$1) {
      ji $$2 = $$0.c().a($$0.d().c(dmk.b));
      List<bvy> $$3 = $$0.b().a(bvy.class, new fbs($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bvy $$4 = $$3.getFirst();
         bvj $$5 = $$4.f($$1);
         cxh $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bwa $$7) {
            $$7.a($$5, 2.0F);
            $$7.ga();
         }

         return true;
      }
   }
}
