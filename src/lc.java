import java.util.List;

public class lc extends la {
   public static final lc c = new lc();

   @Override
   protected cwm a(ky $$0, cwm $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(ky $$0, cwm $$1) {
      jh $$2 = $$0.c().a($$0.d().c(dkv.b));
      List<bvh> $$3 = $$0.b().a(bvh.class, new ezt($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bvh $$4 = $$3.getFirst();
         but $$5 = $$4.f($$1);
         cwm $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bvj $$7) {
            $$7.a($$5, 2.0F);
            $$7.ai();
         }

         return true;
      }
   }
}
