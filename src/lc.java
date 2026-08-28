import java.util.List;

public class lc extends la {
   public static final lc c = new lc();

   @Override
   protected cxp a(ky $$0, cxp $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(ky $$0, cxp $$1) {
      jh $$2 = $$0.c().a($$0.d().c(dmt.b));
      List<bwg> $$3 = $$0.b().a(bwg.class, new fbt($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bwg $$4 = $$3.getFirst();
         bvs $$5 = $$4.f($$1);
         cxp $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bwi $$7) {
            $$7.a($$5, 2.0F);
            $$7.ai();
         }

         return true;
      }
   }
}
